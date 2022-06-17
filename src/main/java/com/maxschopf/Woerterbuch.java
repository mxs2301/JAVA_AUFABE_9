package com.maxschopf;

import java.util.Map;
import java.util.TreeMap;

public class Woerterbuch{

	public static class TreeMapTest{

		public static void print(){
			Map<String, Integer> map = new TreeMap<>();
			map.put("Datenstruktur", 42);
			map.put("und", 8);
			map.put("Algorithmen", 5);


			System.out.println(map.entrySet());
			System.out.println(map);
		}

	}

}