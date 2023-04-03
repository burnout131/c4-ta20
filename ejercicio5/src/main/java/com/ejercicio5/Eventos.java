package com.ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Eventos {

	JFrame frame;
	JTextArea textArea;

	public Eventos() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(108, 33, 288, 130);
		frame.getContentPane().add(textArea);

		textArea.addMouseListener(mouse);

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(34, 33, 362, 130);
		frame.getContentPane().add(scroll);

		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(action);
		btnNewButton.setBounds(168, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
		}
	};

	MouseListener mouse = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			textArea.append("Has soltado el clic \n");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			textArea.append("Has presionado el clic \n");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			textArea.append("Has sacado el cursor del recuadro \n");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			textArea.append("Has metido el cursor en el recuadro \n");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}
	};
}
