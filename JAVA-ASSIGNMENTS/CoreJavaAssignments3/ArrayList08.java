package com.CoreJavaAssignments3;

import java.util.*;
public class ArrayList08 {
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr=list.iterator();  
		while(itr.hasNext()){  
		list.remove(10);
		System.out.println(itr.next()); 
		}

	}

}
