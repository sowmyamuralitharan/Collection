package com.details.collect;
import java.util.*;
public class VectorClass1 {

	public static void main(String[] args) {
		      
		     
		    
		  Vector<String> v=new Vector<String>();//creating vector  
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar"); 
		  v.addElement("kumar"); 
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		   
		  // while(e.hasNext())
			//	System.out.println(e.next());
		  }   
	}

}
