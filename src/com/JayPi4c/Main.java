package com.JayPi4c;

import com.JayPi4c.gui.Frame;
import com.JayPi4c.util.Init;
import com.JayPi4c.util.accounts.Account;

public class Main {

	public static Account accounts[];
	public static double sum;

	public static void main(String args[]) {

		Init.begin();

		new Frame();
	}

}
