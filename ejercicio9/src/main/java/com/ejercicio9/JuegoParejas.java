package com.ejercicio9;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

/**
 * @author Marc RG
 *
 */
public class JuegoParejas extends JFrame {

	private JPanel contentPane;

	private JToggleButton button1, button2, button3, button4;
	private JToggleButton button5, button6, button7, button8;
	private JToggleButton button9, button10, button11, button12;
	private JToggleButton button13, button14, button15, button16;

	private int contadorSeleccionados;
	private int parejas = 0;
	private int intentos = 1;

	// Array de botones que han sido seleccionados, nos permitirá comprobar si son
	// pareja
	private JToggleButton[] botonesSeleccionados = new JToggleButton[2];

	private ImageIcon redBull = new ImageIcon(JuegoParejas.class.getResource("assets/redbull.png"));
	private ImageIcon ferrari = new ImageIcon(JuegoParejas.class.getResource("assets/ferrari_3.png"));
	private ImageIcon astonMartin = new ImageIcon(JuegoParejas.class.getResource("assets/astonmartin.png"));
	private ImageIcon mercedes = new ImageIcon(JuegoParejas.class.getResource("assets/mercedes.png"));
	private ImageIcon mclaren = new ImageIcon(JuegoParejas.class.getResource("assets/mclaren.png"));
	private ImageIcon alpine = new ImageIcon(JuegoParejas.class.getResource("assets/alpine.png"));
	private ImageIcon williams = new ImageIcon(JuegoParejas.class.getResource("assets/williams.png"));
	private ImageIcon alfaRomeo = new ImageIcon(JuegoParejas.class.getResource("assets/alfaromeo.jpeg"));

	public JuegoParejas() {
		setTitle("Juego de formar parejas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4));

		button1 = new JToggleButton();
		button1.setSelectedIcon(redBull);
		contentPane.add(button1);

		button2 = new JToggleButton();
		button2.setSelectedIcon(ferrari);
		getContentPane().add(button2);

		button3 = new JToggleButton();
		button3.setSelectedIcon(astonMartin);
		getContentPane().add(button3);

		button4 = new JToggleButton();
		button4.setSelectedIcon(mercedes);
		getContentPane().add(button4);

		button5 = new JToggleButton();
		button5.setSelectedIcon(mclaren);
		getContentPane().add(button5);

		button6 = new JToggleButton();
		button6.setSelectedIcon(alpine);
		getContentPane().add(button6);

		button7 = new JToggleButton();
		button7.setSelectedIcon(williams);
		getContentPane().add(button7);

		button8 = new JToggleButton();
		button8.setSelectedIcon(alfaRomeo);
		getContentPane().add(button8);

		button9 = new JToggleButton();
		button9.setSelectedIcon(redBull);
		getContentPane().add(button9);

		button10 = new JToggleButton();
		button10.setSelectedIcon(ferrari);
		getContentPane().add(button10);

		button11 = new JToggleButton();
		button11.setSelectedIcon(astonMartin);
		getContentPane().add(button11);

		button12 = new JToggleButton();
		button12.setSelectedIcon(mercedes);
		getContentPane().add(button12);

		button13 = new JToggleButton();
		button13.setSelectedIcon(mclaren);
		getContentPane().add(button13);

		button14 = new JToggleButton();
		button14.setSelectedIcon(alpine);
		getContentPane().add(button14);

		button15 = new JToggleButton();
		button15.setSelectedIcon(williams);
		getContentPane().add(button15);

		button16 = new JToggleButton();
		button16.setSelectedIcon(alfaRomeo);
		getContentPane().add(button16);

		initialiseButtons();

		setVisible(true);
	}

	ActionListener buttonClick = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			// Marcamos el boton como seleccionado si se ha clicado
			JToggleButton btn1 = (JToggleButton) e.getSource();
			btn1.setSelected(true);

			// Comprobamos si se han seleccionado dos botones
			if (compruebaBotones()) {
				guardarSeleccion();
				calculate();
			}

		}

	};

	/**
	 * Metodo que comprueba si se han clicado dos botones
	 * 
	 * @return True si se han clicado 2, false en caso contrario
	 */
	private boolean compruebaBotones() {
		contadorSeleccionados = 0;

		for (Component c : contentPane.getComponents()) {
			if (c instanceof JToggleButton) {
				JToggleButton button = (JToggleButton) c;
				if (button.isSelected() && button.isEnabled()) {
					contadorSeleccionados++;
				}
			}
		}

		if (contadorSeleccionados == 2) {
			contadorSeleccionados = 0;
			return true;
		} else {
			contadorSeleccionados = 0;
			return false;
		}
	}

	/**
	 * Este método guarda los dos botones seleccionados en un array para ser
	 * comprobados posteriormente
	 */
	private void guardarSeleccion() {
		int i = 0;
		for (Component c : contentPane.getComponents()) {
			if (c instanceof JToggleButton) {
				JToggleButton button = (JToggleButton) c;
				if (button.isSelected() && button.isEnabled()) {
					botonesSeleccionados[i] = button;
					i++;
				}
			}
		}
	}

	/**
	 * Metodo que comprueba si los dos botones seleccionados forman una pareja.
	 */
	private void calculate() {

		// Si ambos botones son iguales, los desactivamos y sumamos +1 en el contador de parejas
		if (botonesSeleccionados[0].getSelectedIcon().equals(botonesSeleccionados[1].getSelectedIcon())) {
			botonesSeleccionados[0].setEnabled(false);
			botonesSeleccionados[1].setEnabled(false);
			parejas = parejas + 1;

			// Si completamos todas las parejas, mostramos ventana indicando el final del juego
			if (parejas == 8) {
				FinJuego finale = new FinJuego(intentos);
			}
			// Por el contrario, si los botones no son iguales, los mantenemos en pantalla durante 1 seg, los ocultamos
			// y sumamos 1 intento
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			botonesSeleccionados[0].setSelected(false);
			botonesSeleccionados[1].setSelected(false);
			intentos = intentos + 1;
		}
	}

	/**
	 * Metodo que agrega el listener y la imagen por defecto a todos los botones
	 */
	private void initialiseButtons() {

		for (Component c : contentPane.getComponents()) {
			if (c instanceof JToggleButton) {
				JToggleButton button = (JToggleButton) c;
				button.setIcon(new ImageIcon(JuegoParejas.class.getResource("assets/f1.jpg")));
				button.addActionListener(buttonClick);
			}
		}

	}

}
