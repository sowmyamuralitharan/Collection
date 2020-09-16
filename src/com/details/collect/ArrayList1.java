package com.details.collect;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("ram");
		list.add("lily");
		//list.add(Boolean.TRUE);   print true
		list.add("pinky");
		list.add("sweetu");
		list.add("tintu");
		
		
		list.add(0, "nate");
		list.add(1, "serena");
		list.add(3, "blair"); // throwsIndexOutOfBoundException

		list.add("jenny");
		
		//list.add(1);    does not compile
		
		
	
		System.out.println(list);
		
		
		
		List<String> letters = new ArrayList();
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		
		System.out.println(letters);
		
		List<String> words = new ArrayList();
		
		words.add("blair");
		words.add("serena");
		words.add("lily");
		words.add("chuck");
		words.add("nate");
		
		System.out.println(words);
		
		System.out.println(letters.addAll(words));
		
		System.out.println(letters.addAll(1, letters));
		
		System.out.println(letters);
		
		
		
		List<String> liti = null;
		
		//System.out.println(letters.addAll(liti));
		
		System.out.println(letters);
		
		
		
		List<String> lipi = new ArrayList();
		
		lipi.add("1");
		lipi.add("2");
		lipi.add("3");
		
		//lipi.addAll(4,pink);//indexOutOfBoundException
		
		System.out.println(lipi);
		
		System.out.println(lipi.size());
		
		List<String> list1 = new ArrayList();
		
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		
		System.out.println(list1);
	System.out.println(lipi.addAll(list1)); //Unresolved compilation problem
		
		
		
	System.out.println(lipi);
	
	System.out.println("CLEAR");
	
	List<String> list2 = new ArrayList();
	
	list2.add("one");
	list2.add("two");
	list2.add("three");
	list2.add("four");
	
	System.out.println(list2);
	System.out.println(list2.isEmpty());
	System.out.println(list2.size());
	list2.clear();	
	System.out.println(list2);
	System.out.println(list2.size());

	
	
	

	List<String> list3 = new ArrayList();
	
	list3.add("red");
	list3.add("yellow");
	list3.add("white");
	list3.add("black");
	list3.add("blue");
	
	System.out.println(list3);
	
	Iterator<String> iterator = list3.iterator();
	
	while(iterator.hasNext())
	{
		//String i = iterator.next();  
		//System.out.println(i);  
		/*this or this*/
		System.out.println(iterator.next());
	}
		

	List<String> list4 = new ArrayList();
	
	list4.add("aaaa");
	list4.add("bbbb");
	list4.add("cccc");
	list4.add("dddd");
	list4.add("eeee");
	
		for(String itemss:list4)
		{
			System.out.println(itemss);
		}
		
		System.out.println("returning element = " +list4.get(2));
		
		list4.set(2, "pink");
		
		
		
		
		
		
		
		
		

	
			
		
	}
}
		
		
		
