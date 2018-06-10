package com.JayPi4c.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class InputField extends JTextField implements KeyListener {

	private static final long serialVersionUID = -8539253064409694332L;

	public InputField() {
		this.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (this.getText().length() == 0)
			return;
		System.out.println("Event");
		try {
			Double.parseDouble(this.getText());
			System.out.println(this.getText() + " is valid");
		} catch (NumberFormatException ex) {
			if (this.getText().charAt(0) == '-') {
				try {
					String s = this.getText().substring(1);
					if (s.length() > 0)
						Double.parseDouble(s);
				} catch (NumberFormatException exc) {
					System.out.println("wrong substring");
				}

			} else
				this.setText("");
			System.out.println("error");
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
