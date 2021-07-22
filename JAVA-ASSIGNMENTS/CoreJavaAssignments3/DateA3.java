package com.CoreJavaAssignments3;

import java.security.KeyStore.Entry;
import java.util.*;
public class DateA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Date,String> hash=new HashMap<>();
		Date d1=new Date(20,01,1999);
		Date d2=new Date(25,03,2005);
		Date d3=new Date(20,01,1998);
		Date d4=new Date(20,03,2000);
		hash.put(d1,"kar");
		hash.put(d2,"mk");
		hash.put(d3,"hp");
		hash.put(d4,"cm");
		/*System.out.println(hash.values());
		System.out.println(hash.get(d1));*/
		Set<Map.Entry<Date,String>> entry=hash.entrySet();
		Iterator<Map.Entry<Date,String>> it=entry.iterator();
		while(it.hasNext())
		{
			Map.Entry<Date,String> ent=(Map.Entry<Date, String>) it.next();
			Date d=ent.getKey();
			String a=ent.getValue();
			
			System.out.println(d.day+"/"+d.month+"/"+d.year);
			System.out.println(a);
			
			
		}
		

	}
}