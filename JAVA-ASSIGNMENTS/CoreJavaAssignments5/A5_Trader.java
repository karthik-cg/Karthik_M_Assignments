package com.CoreJavaAssignments5;

import java.util.LinkedList;
import java.util.List;

class Assignment_5_Trader {
	public static void main(String[] args) {
		
		List<Trader> traderList=new LinkedList<Trader>();
		
		traderList.add(new Trader("kartzz", "Chennai"));
		traderList.add(new Trader("mk", "Mumbai"));
		traderList.add(new Trader("hp", "Indore"));
		traderList.add(new Trader("cm", "Bangalore"));
		traderList.add(new Trader("thnt", "Pune"));
		traderList.add(new Trader("mo", "Delhi"));
		traderList.add(new Trader("gnd", "Chennai"));
		traderList.add(new Trader("poto", "Delhi"));
		traderList.add(new Trader("sru", "Indore"));
		traderList.add(new Trader("bot", "Pune"));
		
		System.out.println("Traders List : \n");
		traderList.forEach(System.out::println);
		
		/*System.out.println("\n---------------------\n");
		System.out.println("Unique cities where traders work : \n");
		
		traderList.stream()
		.distinct()
		.forEach(a->System.out.println(a.getCity()));
		*/
		System.out.println("\n---------------------\n");
		System.out.println("Traders from Pune sorted by name alphabetically : \n");
		
		traderList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("pune"))
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(System.out::println);
		
		/*System.out.println("\n---------------------\n");
		System.out.println("String of all traders name sorted alphabetically : \n");
		
		traderList.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.
		*/
		
		System.out.println("\n---------------------\n");
		System.out.println("Traders from Indore : \n");
		
		traderList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("Indore"))
		.forEach(System.out::println);
		
	}
}
