package com.ejercicio1;

public class App {
	public static void main(String[] args) {
		try {
			Ventana window = new Ventana();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
