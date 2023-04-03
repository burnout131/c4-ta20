package com.ejercicio5;

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
