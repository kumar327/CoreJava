package com.aks.sort;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>(new NameComparsion());
		t.add("AKS");
		t.add("Sw");
		t.add("AM");
		t.add("AKS");
		System.out.println(t);
	}
}

class NameComparsion implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}
}