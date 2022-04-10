package com.sample.sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		Map<String, Integer> map1= new HashMap<String, Integer>();
		map1.put("John",67);
		map1.put("sneha", 34);
		map1.put("raj", 23);
		System.out.println(map1);
		map1.put("didi", 56);
		System.out.println(map1);
		
		System.out.println("Is there John ? "+map1.containsKey("John"));
		
		System.out.println("All key: " +map1.keySet());
		System.out.println("all value :"+map1.values());
		
		Set<String> names= map1.keySet();
		for(String name:names)
			System.out.println("Name: " +name +",Age: " +map1.get(name));
		
		//Maps of Map
		
		Map<String, Map<String, Object>> userprofile = new HashMap<String, Map<String, Object>>();
		Map<String, Object> profile = new HashMap<String,Object>();
		profile.put("age ", 29);
		profile.put("Dept ", "HR");
		profile.put("City ", "My");
		userprofile.put("John ", profile);
		System.out.println(userprofile);
		
		Map<String, Object> searchprofile = new HashMap<String,Object>();
		searchprofile.put("age ", 29);
		searchprofile.put("Dept ", "HR");
		searchprofile.put("City ", "My");
		userprofile.put("John ", searchprofile);
		System.out.println(searchprofile);
		System.out.println(userprofile);
	}

}
