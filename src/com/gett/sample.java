package com.gett;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sample {
public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("java", 123);
		map.put("sql", 456);
		map.put("python", 789);
		
		System.out.println(map);
		
		Map<String, Integer> saw = new LinkedHashMap<>();
		
		saw.put("java", 123);
		saw.put("sql", 456);
		saw.put("python", 789);
		
		System.out.println(saw);
		
        Map<String, Integer> see = new TreeMap<>();
		
		see.put("java", 123);
		see.put("sql", 456);
		see.put("python", 789);
		
		System.out.println(see);
		
Map<String, Integer> se = new Hashtable<>();
		
		se.put("java", 123);
		se.put("sql", 456);
		se.put("python", 789);
		
		System.out.println(se);
		
	
		
		
	}
}
