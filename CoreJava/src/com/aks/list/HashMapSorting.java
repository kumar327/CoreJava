package com.aks.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSorting {
	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("John", 25);
		unsortedMap.put("BBBB", 30);
		unsortedMap.put("Alice", 30);
		unsortedMap.put("Bob", 20);
		unsortedMap.put("Doe", 35);

		// Sorting by values
		Map<String, Integer> sortedByValue = new LinkedHashMap<>();
		LinkedHashMap newSort = unsortedMap.entrySet().stream().sorted((v1, v2) -> {
			if (v1.getValue() == v2.getValue())
				return v1.getKey().compareTo(v2.getKey());
			else if (v1.getValue() > v2.getValue())
				return 1;
			else
				return -1;
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old, newV) -> old, LinkedHashMap::new));
		System.out.println(newSort);
//		sortedByValue.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
