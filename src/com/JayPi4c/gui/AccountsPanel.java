package com.JayPi4c.gui;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.JayPi4c.Main;
import com.JayPi4c.util.Constants;
import com.JayPi4c.util.accounts.Account;

public class AccountsPanel extends JPanel {

	private static final long serialVersionUID = -6948188587309735668L;

	private static JLabel lifeStyle;
	private static JLabel management;
	private static JLabel investment;
	private static JLabel education;
	private static JLabel fun;
	private static JLabel donation;
	private static JLabel vision;

	public AccountsPanel(Dimension d) {
		this.setSize(d);
		this.setLayout(null);

		Account acc = Main.accounts[Constants.LIFESTYLE];
		lifeStyle = new JLabel(acc.getName());
		lifeStyle.setToolTipText(acc.getdescription());
		lifeStyle.setText(acc.getName() + ": " + acc.getValue());
		lifeStyle.setBounds(50, 25, 700, 20);
		lifeStyle.setVisible(true);
		this.add(lifeStyle);

		acc = Main.accounts[Constants.MANAGEMENT];
		management = new JLabel(acc.getName());
		management.setToolTipText(acc.getdescription());
		management.setText(acc.getName() + ": " + acc.getValue());
		management.setBounds(50, 60, 700, 20);
		management.setVisible(true);
		this.add(management);

		acc = Main.accounts[Constants.INVESTMENT];
		investment = new JLabel(acc.getName());
		investment.setToolTipText(acc.getdescription());
		investment.setText(acc.getName() + ": " + acc.getValue());
		investment.setBounds(50, 95, 700, 20);
		investment.setVisible(true);
		this.add(investment);

		acc = Main.accounts[Constants.EDUCATION];
		education = new JLabel(acc.getName());
		education.setToolTipText(acc.getdescription());
		education.setText(acc.getName() + ": " + acc.getValue());
		education.setBounds(50, 130, 700, 20);
		education.setVisible(true);
		this.add(education);

		acc = Main.accounts[Constants.FUN];
		fun = new JLabel(acc.getName());
		fun.setToolTipText(acc.getdescription());
		fun.setText(acc.getName() + ": " + acc.getValue());
		fun.setBounds(50, 165, 700, 20);
		fun.setVisible(true);
		this.add(fun);

		acc = Main.accounts[Constants.DONATION];
		donation = new JLabel(acc.getName());
		donation.setToolTipText(acc.getdescription());
		donation.setText(acc.getName() + ": " + acc.getValue());
		donation.setBounds(50, 200, 700, 20);
		donation.setVisible(true);
		this.add(donation);

		acc = Main.accounts[Constants.VISION];
		vision = new JLabel(acc.getName());
		vision.setToolTipText(acc.getdescription());
		vision.setText(acc.getName() + ": " + acc.getValue());
		vision.setBounds(50, 235, 700, 20);
		vision.setVisible(true);
		this.add(vision);

		this.setVisible(true);
	}

	public static void refresh() {
		Account acc = Main.accounts[Constants.LIFESTYLE];
		lifeStyle.setText(acc.getName() + ": " + acc.getValue());

		acc = Main.accounts[Constants.MANAGEMENT];
		management.setText(acc.getName() + ": " + acc.getValue());

		acc = Main.accounts[Constants.INVESTMENT];
		investment.setText(acc.getName() + ": " + acc.getValue());

		acc = Main.accounts[Constants.EDUCATION];
		education.setText(acc.getName() + ": " + acc.getValue());

		acc = Main.accounts[Constants.FUN];
		fun.setText(acc.getName() + ": " + acc.getValue());

		acc = Main.accounts[Constants.DONATION];
		donation.setText(acc.getName() + ": " + acc.getValue());

		acc = Main.accounts[Constants.VISION];
		vision.setText(acc.getName() + ": " + acc.getValue());

	}

}
