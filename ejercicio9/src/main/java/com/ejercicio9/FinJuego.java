/**
 * 
 */
package com.ejercicio9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Marc RG
 *
 */
public class FinJuego extends JFrame {

	private JPanel contentPane;
	JLabel intentosLabel = new JLabel();
	JLabel imageLabel = new JLabel();

	public FinJuego(int numIntentos) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(new BorderLayout());
		setSize(new Dimension(600, 600));
		setTitle("Has ganado!");

		intentosLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 24));
		intentosLabel.setText("Has ganado! Lo has hecho en " + numIntentos + " intentos");
		contentPane.add(intentosLabel, java.awt.BorderLayout.NORTH);

		ImageIcon image = new ImageIcon(this.getClass().getResource("assets/champion.gif"));
		imageLabel.setIcon(image);
		contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
