package com.advance.hashmap;
import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		Map<String, String> capitals=new HashMap<>();
		capitals.put("England", "London");
		capitals.put("India", "New Delhi");
		capitals.put("Russia", "moscow");
		capitals.put("England", "oslo");
		System.out.println("capital of the england is:" +capitals.get("England"));
		capitals.remove("England", "oslo");
	    System.out.println("capital of england is:"+capitals.get("England"));
	    
	    if(capitals.containsValue("moscow")) {
	    	System.out.println("russia is on the list");
	    }
	    capitals.put(null, "city is not on the list");
	    String userInput="Goa";
	    if(capitals.containsKey(userInput)) {
	    	System.out.println(capitals.get(userInput));
	    }else {
	    	System.out.println(capitals.get(null));
	    }
	    System.out.println(capitals.getOrDefault(userInput, "the city is not on the list."));
	    capitals.replace("India", "New Delhi", "Mumbai");
	    System.out.println("replaced capital of india is:" +capitals.get(("India")));
	    capitals.putIfAbsent(userInput, "Nayagara");
	    capitals.remove(null);
	    System.out.println(capitals.size()+"countries can be found in the hashmap:" );
	    for(String country:capitals.keySet()) {
	    	System.out.println("_"+country);
	    }
	    capitals.clear();
	    System.out.println(capitals.size()+"capitals can be found in the hashmap");
	    	for(String capital:capitals.values()) {
	    		System.out.println("_" +capital);
	    	}
	    
	    	}
	  
		

	}


