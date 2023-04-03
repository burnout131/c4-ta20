package com.ejercicio2;


public class App {
	public static void main(String[] args) {
		try {
			VentanaInteraccion window = new VentanaInteraccion();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
