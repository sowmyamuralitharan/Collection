package com.details.collect;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("two");
		System.out.println(ll);
		
		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
