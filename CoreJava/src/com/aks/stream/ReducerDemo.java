package com.aks.stream;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReducerDemo {

	public static void main(String[] args) {
		String[] arr = { "D", "A", "B", "C", "A" };

//		String str = "Kumar";
//
//		String results = Arrays.stream(arr).reduce((old, n) -> old + "-" + n).get();
//		System.out.println(results);
//
//		String rev = str.chars().mapToObj(c -> (char) c).reduce("", (o, n) -> n + o, (s1, s2) -> s2 + s1);
//
//		System.out.println(rev);

		TreeMap<String, Long> results = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap<String, Long>::new, Collectors.counting()));

		System.out.println(results);
	}
}
