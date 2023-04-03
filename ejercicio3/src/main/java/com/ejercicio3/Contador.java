package com.ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Contador {

	JFrame frame;
	int contadorBtn1 = 0;
	int contadorBtn2 = 0;
	JLabel labelContadorUno;
	JLabel labelContadorDos;

	/**
	 * Create the application.
	 */
	public Contador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Boton 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 28, 65, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Boton 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(233, 28, 57, 33);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblVeces = new JLabel("veces");
		lblVeces.setBounds(126, 28, 57, 33);
		frame.getContentPane().add(lblVeces);

		JLabel lblVeces2 = new JLabel("veces");
		lblVeces2.setBounds(359, 28, 65, 33);
		frame.getContentPane().add(lblVeces2);

		JButton boton1 = new JButton("Boton 1");
		boton1.addActionListener(listener1);
		boton1.setBounds(53, 72, 89, 23);
		frame.getContentPane().add(boton1);

		JButton boton2 = new JButton("Boton 2");
		boton2.addActionListener(listener2);
		boton2.setBounds(288, 72, 89, 23);
		frame.getContentPane().add(boton2);

		labelContadorUno = new JLabel("0");
		labelContadorUno.setHorizontalAlignment(SwingConstants.CENTER);
		labelContadorUno.setBounds(93, 28, 23, 33);
		frame.getContentPane().add(labelContadorUno);

		labelContadorDos = new JLabel("0");
		labelContadorDos.setHorizontalAlignment(SwingConstants.CENTER);
		labelContadorDos.setBounds(314, 28, 23, 33);
		frame.getContentPane().add(labelContadorDos);
	}

	ActionListener listener1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			contadorBtn1++;
			String contadorToStr = Integer.toString(contadorBtn1);
			labelContadorUno.setText(contadorToStr);
		}
	};

	ActionListener listener2 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			contadorBtn2++;
			String contadorToStr = Integer.toString(contadorBtn2);
			labelContadorDos.setText(contadorToStr);
		}
	};

}
