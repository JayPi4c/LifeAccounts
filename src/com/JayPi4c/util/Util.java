package com.JayPi4c.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.JayPi4c.Main;
import com.JayPi4c.util.accounts.Account;

public class Util {
	public static void splitAmount(double amount) {
		Main.sum += amount;
		for (int i = 0; i < Main.accounts.length; i++) {
			Account acc = Main.accounts[i];
			acc.addValue(amount * acc.getPercentage());
			System.out.println(acc.getName() + ": " + acc.getValue());
		}
		System.out.println("Sum: " + Main.sum);
		saveChange();

	}

	public static String getExecutionPath() {
		String absolutePath = new File(".").getAbsolutePath();
		File file = new File(absolutePath);
		absolutePath = file.getParentFile().toString();
		return absolutePath;
	}

	public static void saveChange() {
		try {
			File f = new File(Util.getExecutionPath() + "/data/data.csv");
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(f));
			for (Account acc : Main.accounts) {
				fileWriter.write(acc.getValue() + ",");
			}
			fileWriter.write("" + Main.sum);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
