package com.JayPi4c.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.JayPi4c.Main;
import com.JayPi4c.util.accounts.Account;
import com.JayPi4c.util.accounts.Donation;
import com.JayPi4c.util.accounts.Education;
import com.JayPi4c.util.accounts.Fun;
import com.JayPi4c.util.accounts.Investments;
import com.JayPi4c.util.accounts.LifeStyle;
import com.JayPi4c.util.accounts.Management;
import com.JayPi4c.util.accounts.Vision;

public class Init {
	public static void begin() {

		Main.accounts = new Account[7];
		Main.accounts[Constants.LIFESTYLE] = new LifeStyle();
		Main.accounts[Constants.MANAGEMENT] = new Management();
		Main.accounts[Constants.INVESTMENT] = new Investments();
		Main.accounts[Constants.EDUCATION] = new Education();
		Main.accounts[Constants.FUN] = new Fun();
		Main.accounts[Constants.DONATION] = new Donation();
		Main.accounts[Constants.VISION] = new Vision();
		Main.sum = 0.0;

		File dataDir = new File(Util.getExecutionPath() + "/data");
		if (!dataDir.exists()) {
			dataDir.mkdir();
			try {
				File f = new File(Util.getExecutionPath() + "/data/data.csv");
				f.createNewFile();
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(f));
				for (int i = 0; i < 8; i++) {
					fileWriter.write((i != 0 ? "," : "") + "0.0");
				}
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}

		try {
			File f = new File(Util.getExecutionPath() + "/data/data.csv");
			if (!f.exists()) {
				f.createNewFile();
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(f));
				for (int i = 0; i < 8; i++) {
					fileWriter.write((i != 0 ? "," : "") + "0.0");
				}
				fileWriter.close();
			} else {

				BufferedReader fileReader = new BufferedReader(new FileReader(f));
				String line = fileReader.readLine();
				String[] parts = line.split(",");
				Main.accounts[Constants.LIFESTYLE].setValue(Double.parseDouble(parts[Constants.LIFESTYLE]));
				Main.accounts[Constants.MANAGEMENT].setValue(Double.parseDouble(parts[Constants.MANAGEMENT]));
				Main.accounts[Constants.INVESTMENT].setValue(Double.parseDouble(parts[Constants.INVESTMENT]));
				Main.accounts[Constants.EDUCATION].setValue(Double.parseDouble(parts[Constants.EDUCATION]));
				Main.accounts[Constants.FUN].setValue(Double.parseDouble(parts[Constants.FUN]));
				Main.accounts[Constants.DONATION].setValue(Double.parseDouble(parts[Constants.DONATION]));
				Main.accounts[Constants.VISION].setValue(Double.parseDouble(parts[Constants.VISION]));
				Main.sum = Double.parseDouble(parts[7]);
				fileReader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
