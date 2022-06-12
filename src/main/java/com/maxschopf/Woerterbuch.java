package com.maxschopf;

import java.util.Map;
import java.util.TreeMap;

public class Woerterbuch{

	public static class TreeMapTest{

		public static void print(){
			Map<Integer, String> map = new TreeMap<>();
			map.put(42, "Datenstruktur");
			map.put(8, "und");
			map.put(5, "Algorithmen");

			for(String eintrag: map.values()){
				System.out.print(eintrag + " ");
			}

			System.out.println();

		}

	}

}