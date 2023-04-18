package com.ejercicio9;

import java.awt.EventQueue;

public class App {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					JuegoParejas frame = new JuegoParejas();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

}
