package com.aks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CombineTwoString {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("AKS", "Kumar", "Swamy", "Suman");
		Map<String, String> re = str.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0) + "", Collectors.reducing("", (o, n) -> o + n+ "|" )));
		System.out.println(re);
	}
}
