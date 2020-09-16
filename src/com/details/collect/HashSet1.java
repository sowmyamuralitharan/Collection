package com.details.collect;

import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		hs.add("seven");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) 
		System.out.println(it);
		
		
	}

}
