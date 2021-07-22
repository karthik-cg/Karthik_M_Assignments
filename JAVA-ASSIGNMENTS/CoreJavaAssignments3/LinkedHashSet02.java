package com.CoreJavaAssignments3;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet02 {
	public static void main(String args[])
	{
		
		Set<Integer> set=new LinkedHashSet<>();
		set.add(6);
		set.add(7);
		set.add(10);
		set.add(5);
		set.add(420);
		
		Iterator<Integer> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 
		  }
	}

}