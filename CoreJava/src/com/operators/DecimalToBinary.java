package com.operators;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num = 11;
		System.out.println("Utility Method :: " + Integer.toBinaryString(num));
		String results = "";

		while (num > 0) {
			int temp = num % 2;
			results = temp + results;
			num = num / 2;
		}
		System.out.println("My Own Results :: " + results);
	}
}
