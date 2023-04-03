package com.ejercicio4;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Eventos window = new Eventos();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
