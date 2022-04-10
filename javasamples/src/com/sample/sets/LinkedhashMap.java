package com.sample.sets;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap {
	public static void main(String[] args) {
		Map<String, String> map1=new LinkedHashMap<String, String>();
		map1.put("A", "a");
		map1.put("B", "b");
		map1.put("C", "c");
		System.out.println(map1);
		
		map1.get("C");
		System.out.println(map1);
		map1.get("A");
		System.out.println(map1);
	}

}
