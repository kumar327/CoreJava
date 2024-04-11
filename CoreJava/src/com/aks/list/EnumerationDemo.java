package com.aks.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(3);
		v.add(4);
		v.add(2);
		v.add(3);
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			System.out.println(integer);
		}

	}
}
