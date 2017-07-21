package com.tacademy.date;

public class Data {
	private String name;
	private int age;
	private String testringAddress;
	private String masetAddress;
	

	public String getMasetAddress() {
		return masetAddress;
	}

	public void setMasetAddress(String masetAddress) {
		this.masetAddress = masetAddress;
	}

	public String getTestringAddress() {
		return testringAddress;
	}

	public void setTestringAddress(String testringAddress) {
		this.testringAddress = testringAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", testringAddress=" + testringAddress + ", masetAddress="
				+ masetAddress + "]";
	} 


	
	
}
