package com.JayPi4c.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class Frame extends JFrame {

	private static final long serialVersionUID = -208823195276469124L;

	public Frame() {
		super("Life Accounts");
		Dimension dim = new Dimension(800, 400);
		this.setSize(dim);
		this.setPreferredSize(dim);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		tabs.setSize(dim);
		tabs.addTab("Main", new MainPanel(dim));
		tabs.addTab("Accounts", new AccountsPanel(dim));
		tabs.setVisible(true);
		this.add(tabs);
		this.setVisible(true);
		this.pack();

	}

}
