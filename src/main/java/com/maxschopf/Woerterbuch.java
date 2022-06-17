package com.maxschopf;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class Woerterbuch{

	public static class TreeMapTest{

		public static void print(){
			Map<String, Integer> map = new TreeMap<>();
			map.put("Datenstruktur", 42);
			map.put("und", 8);
			map.put("Algorithmen", 5);



			int loop = 1;
			int counter = 0;

			ArrayList<String> strings = new ArrayList<>();
			ArrayList<Integer> integers = new ArrayList<>();
			ArrayList<Integer> count = new ArrayList<>();


			for(Map.Entry<String, Integer> eingabe : map.entrySet()){
				strings.add(eingabe.getKey());
				integers.add(eingabe.getValue());
				count.add(loop);
				counter++;
			}

			

			for(int j = 0; j<strings.size(); j++){
				System.out.println("#"+strings.get(j) + "#" + " kam im text so oft vor: " + count.get(j));
			}

		}

	}

}