package com.CoreJavaAssignments3;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMap08 {
	public static void main(String[] args) {
		
		Map<String, Integer> map=new ConcurrentHashMap<String, Integer>();
		map.put("Karthik", 10);
		map.put("HP", 20);
		map.put("Thonta", 30);
		System.out.println(map);
		
		Set<java.util.Map.Entry<String, Integer>> entry= map.entrySet();
		Iterator<java.util.Map.Entry<String, Integer>> itr=entry.iterator();
		while(itr.hasNext())
		{
			map.put("Kartz", 100);
			System.out.println(itr.next());
		}
	}
}