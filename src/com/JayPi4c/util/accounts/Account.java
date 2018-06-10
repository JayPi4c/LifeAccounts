package com.JayPi4c.util.accounts;

public abstract class Account {
	String name;
	double percentage;
	double value;
	String description;

	public Account(String name, double percentage, double value, String description) {
		this.name = name;
		this.percentage = percentage;
		this.value = value;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void addValue(double value) {
		this.value += value;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
}
