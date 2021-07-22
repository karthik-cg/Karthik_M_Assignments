package com.CoreJavaAssignments3;

import java.util.TreeSet;

public class BankAccountList09 {

	public static void main(String[] args) {
		
		BankAccount09 b1=new BankAccount09(10000,100,"MK",true);
		BankAccount09 b2=new BankAccount09(20000,50,"HP",true);
		BankAccount09 b3=new BankAccount09(30000,201,"AB",true);
		
		TreeSet<BankAccount09> set=new TreeSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		for(BankAccount09 s:set)
		{
			System.out.println(s.getAcc_ID());
		}
	}

}