package com.CoreJavaAssignments4;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Karthik");
		list.add("HP");
		list.add("CM");
		list.add("Thont");
          list.replaceAll(o->o.toUpperCase());
          System.out.println(list);
	}



}
