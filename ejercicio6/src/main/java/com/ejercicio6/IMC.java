package com.ejercicio6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class IMC {

	JFrame frame;
	private JTextField altura;
	private JTextField peso;
	private JLabel resultado;

	public IMC() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 21, 111, 25);
		frame.getContentPane().add(lblNewLabel);

		altura = new JTextField();
		altura.setBounds(131, 22, 72, 25);
		frame.getContentPane().add(altura);
		altura.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Peso (kg)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(213, 21, 72, 25);
		frame.getContentPane().add(lblNewLabel_1);

		peso = new JTextField();
		peso.setBounds(295, 22, 86, 25);
		frame.getContentPane().add(peso);
		peso.setColumns(10);

		JButton button = new JButton("Calcular IMC");
		button.addActionListener(listener);
		button.setBounds(67, 69, 103, 25);
		frame.getContentPane().add(button);

		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(193, 69, 36, 25);
		frame.getContentPane().add(lblNewLabel_2);

		resultado = new JLabel("");
		resultado.setBackground(new Color(255, 255, 255));
		resultado.setBounds(246, 69, 72, 25);
		frame.getContentPane().add(resultado);
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			double alturaInt = Double.parseDouble(altura.getText());
			double pesoInt = Double.parseDouble(peso.getText());
			double result = pesoInt / Math.pow(alturaInt, 2);
			resultado.setText(String.format("%.2f", result));
		}
	};
}
