package com.operators;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String str = "10111";
		System.out.println("Utility Method :: " + Integer.parseInt(str, 2));

		System.out.println("My Own converter from binary to decimal");

		int results = 0;
		int len = str.length() - 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != 48) {
				results += Math.pow(2, (len - i));
			}
		}
		System.out.println("My Results :: " + results);
	}

}

