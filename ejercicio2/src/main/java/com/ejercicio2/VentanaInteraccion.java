package com.ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaInteraccion {

	JFrame frame;
	
	/**
	 * Create the application.
	 */
	public VentanaInteraccion() {
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
		
		JLabel lblNewLabel = new JLabel("Has pulsado:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(26, 26, 89, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel respuesta = new JLabel("New label");
		respuesta.setBounds(130, 26, 67, 25);
		frame.getContentPane().add(respuesta);
		
		JButton boton1 = new JButton("Boton 1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				respuesta.setText("Boton 1");
			}
		});
		boton1.setBounds(207, 27, 89, 23);
		frame.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("Boton 2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				respuesta.setText("Boton 2");
			}
		});
		boton2.setBounds(306, 27, 89, 23);
		frame.getContentPane().add(boton2);
	}
}
