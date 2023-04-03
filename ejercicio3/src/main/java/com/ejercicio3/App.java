package com.ejercicio3;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Contador window = new Contador();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
