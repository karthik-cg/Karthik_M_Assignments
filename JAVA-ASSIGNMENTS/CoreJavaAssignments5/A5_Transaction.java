package com.CoreJavaAssignments5;

import java.util.LinkedList;
import java.util.List;

public class A5_Transaction {
	public static void main(String[] args) {
		
		List<Transaction> transList=new LinkedList<Transaction>();
		
		transList.add(new Transaction(new Trader("kartz", "Delhi"), 2010, 500));
		transList.add(new Transaction(new Trader("mk", "Mumbai"), 2012, 600));
		transList.add(new Transaction(new Trader("hp", "Chennai"), 2013, 300));
		transList.add(new Transaction(new Trader("cm", "Pune"), 2011, 400));
		transList.add(new Transaction(new Trader("thnt", "Banglore"), 2015, 700));
		transList.add(new Transaction(new Trader("mkld", "Kolkata"), 2011, 600));
		transList.add(new Transaction(new Trader("mo", "Delhi"), 2014, 300));
		transList.add(new Transaction(new Trader("sam", "Chennai"), 2011, 200));
		transList.add(new Transaction(new Trader("gnd", "Delhi"), 2012, 900));
		transList.add(new Transaction(new Trader("tw", "Delhi"), 2013, 200));
		
		System.out.println("Transaction List : \n");
		transList.forEach(System.out::println);
		
		System.out.println("\n--------------------------\n");
		System.out.println("Transactions  in  the  year  2011  and  sort  them  by  value  (small  to high) : \n");
		
		transList.stream()
		.filter(a->a.getYear()==2011)
		.sorted((o1,o2)->o1.getValue()-o2.getValue())
		.forEach(System.out::println);
		
		System.out.println("\n--------------------------\n");
		System.out.println("Print all transactions� values from the traders living in Delhi : \n");
		
		transList.stream()
		.filter(a->a.getTrader().getCity().equalsIgnoreCase("delhi"))
		.forEach(a->System.out.println(a.getValue()));
		
		System.out.println("\n--------------------------\n");
		System.out.println("Highest value of all transactions : \n");
		
		Transaction transaction = transList.stream()
				.max((o1,o2)->o1.getValue()-o2.getValue())
				.get();
		
		System.out.println(transaction.getValue());
		
		System.out.println("\n--------------------------\n");
		System.out.println("Minimum value of all transactions : \n");
		
		transaction = transList.stream()
				.min((o1,o2)->o1.getValue()-o2.getValue())
				.get();
				
		System.out.println(transaction.getValue());

	}
}
