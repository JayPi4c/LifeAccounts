package com.JayPi4c.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.JayPi4c.util.Util;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1042820277328113549L;

	public MainPanel(Dimension d) {
		this.setSize(d);
		this.setLayout(null);
		InputField input = new InputField();
		input.setBounds(50, 50, 700, 20);
		input.setVisible(true);
		this.add(input);
		this.setVisible(true);

		JButton confirm = new JButton("Confirm");
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if (input.getText().length() == 0)
					return;
				Util.splitAmount(Double.parseDouble(input.getText()));
				AccountsPanel.refresh();
			}
		});
		confirm.setBounds(350, 100, 100, 20);
		confirm.setVisible(true);
		this.add(confirm);
	}

}
