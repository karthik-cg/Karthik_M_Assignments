package com.CoreJavaAssignments3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator03 {
	public static void main(String args[])
	{
		
		List<Integer> list=new ArrayList<>();
		list.add(6);
		list.add(7);
		list.add(10);
		list.add(5);
		list.add(420);
		
		  ListIterator<Integer> itr=list.listIterator(list.size());  
		  while(itr.hasPrevious()){  
		   System.out.println(itr.previous()); 
		  }
	}

}