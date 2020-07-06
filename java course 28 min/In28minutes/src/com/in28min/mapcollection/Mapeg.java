package com.in28min.mapcollection;

import java.util.HashMap;
import java.util.Map;

public class Mapeg {

	public static void main(String[] args) {
		Map<String,Integer>mapp = Map.of("A", 2, "B", 4, "C", 6, "D", 8);
	
		Map<String, Integer> hashMap = new HashMap<String,Integer>(mapp);
		System.out.println(hashMap);
		hashMap.put("E", 25);
		System.out.println(hashMap);
		hashMap.put("E", null);
        System.out.println(hashMap);
		//hashMap.remove(key)
	}
}
