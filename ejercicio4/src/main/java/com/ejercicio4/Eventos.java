package com.ejercicio4;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Eventos {

	JFrame frame;
	JTextArea textArea;
	
	/**
	 * Create the application.
	 */
	public Eventos() {
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
		
		frame.addWindowListener(win);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 84, 65, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setBounds(108, 33, 288, 130);
		frame.getContentPane().add(textArea);
		
		textArea.addMouseListener(mouse);
		textArea.addKeyListener(key);
		textArea.addFocusListener(focus);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(108, 33, 288, 130);
		frame.getContentPane().add(scroll);
	}
	
	KeyListener key = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {}
		
		@Override
		public void keyReleased(KeyEvent e) {
			textArea.append("Has soltado una tecla \n");
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			textArea.append("Has apretado una tecla \n");
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
			// TODO Auto-generated method stub
			textArea.append("Has metido el cursor en el recuadro \n");
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {}
	};
	
	FocusListener focus = new FocusListener() {
		
		@Override
		public void focusLost(FocusEvent e) {
			textArea.append("Foco perdido \n");
		}
		
		@Override
		public void focusGained(FocusEvent e) {
			textArea.append("Foco recuperado \n");
		}
	};
	
	WindowListener win = new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
			textArea.append("Ventana Abierta \n");
		}
		
		@Override
		public void windowIconified(WindowEvent e) {}
		
		@Override
		public void windowDeiconified(WindowEvent e) {}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea.append("Ventana Desactivada \n");
		}
		
		@Override
		public void windowClosing(WindowEvent e) {}
		
		@Override
		public void windowClosed(WindowEvent e) {}
		
		@Override
		public void windowActivated(WindowEvent e) {
			textArea.append("Ventana Activada \n");
		}
	};
}
