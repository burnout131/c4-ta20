package com.ejercicio7y8;

public class App {

	public static void main(String[] args) {
		try {
			ConversorMoneda window = new ConversorMoneda();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
