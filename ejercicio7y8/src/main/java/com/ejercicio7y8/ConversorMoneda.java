package com.ejercicio7y8;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JRadioButton;

public class ConversorMoneda {

	JFrame frame;
	private JTextField inputCantidad;
	private JLabel resultado;
	private JRadioButton rdbtnEurosPesetas, rdbtnPesetasEuros;
	private ButtonGroup opcionesConversion;

	public ConversorMoneda() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 21, 141, 25);
		frame.getContentPane().add(lblNewLabel);

		inputCantidad = new JTextField();
		inputCantidad.setBounds(161, 21, 102, 25);
		inputCantidad.addKeyListener(kl);
		frame.getContentPane().add(inputCantidad);
		inputCantidad.setColumns(10);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(convierte);
		btnConvertir.setBounds(171, 103, 86, 25);
		frame.getContentPane().add(btnConvertir);

		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 57, 130, 25);
		frame.getContentPane().add(lblNewLabel_2);

		resultado = new JLabel("");
		resultado.setBounds(161, 57, 104, 25);
		resultado.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(resultado);
		
		rdbtnEurosPesetas = new JRadioButton("Euros a pesetas");
		rdbtnEurosPesetas.setSelected(true);
		rdbtnEurosPesetas.setBounds(295, 22, 130, 23);
		frame.getContentPane().add(rdbtnEurosPesetas);
		
		rdbtnPesetasEuros = new JRadioButton("Pesetas a euros");
		rdbtnPesetasEuros.setBounds(295, 58, 130, 23);
		frame.getContentPane().add(rdbtnPesetasEuros);
		
		opcionesConversion = new ButtonGroup();
		opcionesConversion.add(rdbtnEurosPesetas);
		opcionesConversion.add(rdbtnPesetasEuros);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(borra);
		btnBorrar.setBounds(171, 151, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
	
	KeyListener kl = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {}
		
		@Override
		public void keyReleased(KeyEvent e) {}
		
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				if(rdbtnEurosPesetas.isSelected()) {
					double antesDe = Double.parseDouble(inputCantidad.getText());
					double despuesDe = antesDe * 166.386;
					resultado.setText(String.format("%.4f", despuesDe));
				}
				else if (rdbtnPesetasEuros.isSelected()) {
					double antesDe = Double.parseDouble(inputCantidad.getText());
					double despuesDe = antesDe / 166.386;
					resultado.setText(String.format("%.4f", despuesDe));
				}
			}
		}
	};

	ActionListener convierte = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(rdbtnEurosPesetas.isSelected()) {
				double antesDe = Double.parseDouble(inputCantidad.getText());
				double despuesDe = antesDe * 166.386;
				resultado.setText(String.format("%.4f", despuesDe));
			}
			else if (rdbtnPesetasEuros.isSelected()) {
				double antesDe = Double.parseDouble(inputCantidad.getText());
				double despuesDe = antesDe / 166.386;
				resultado.setText(String.format("%.4f", despuesDe));
			}
		}
	};
	
	ActionListener borra = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			resultado.setText("");
			inputCantidad.setText("");
		}
	};
}
