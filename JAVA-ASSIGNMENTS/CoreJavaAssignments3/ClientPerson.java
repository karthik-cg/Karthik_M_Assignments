package com.CoreJavaAssignments3;

import java.util.Set;
import java.util.*;
public class ClientPerson {
	public static void main(String args[])
	{
		Person p1=new Person(76.0,5.8,"Karthik");
		Person p2=new Person(75.0,5.9,"netha");
		Person p3=new Person(76.7,5.10,"hp");
		Person p4=new Person(65.5,5.6,"thonta");
		Person p5=new Person(58.8,5.7,"moth");
		
		TreeSet<Person> set=new TreeSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		for(Person p:set)
		{
			System.out.println(p.getWeight()+" "+p.getName()+" "+p.getHeight());
		}
	}
}