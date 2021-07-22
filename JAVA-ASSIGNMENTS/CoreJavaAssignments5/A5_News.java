package com.CoreJavaAssignments5;


import java.util.LinkedList;
import java.util.List;

class A5_News {

	public static void main(String[] args) {
		List<News> newsList=new LinkedList<News>();
		newsList.add(new News(1, "kartz", "thont", "Very good"));
		newsList.add(new News(2, "hp", "mo", "Properly executed"));
		newsList.add(new News(3, "poto", "gandh", "Very well written"));
		newsList.add(new News(4, "cm", "mk", "Amazing insight into the story"));
		newsList.add(new News(5, "jb", "ak", "Poor report"));
		newsList.add(new News(6, "sam", "bot", "Fantabulous"));
		newsList.add(new News(7, "tw", "zayn", "Super creativity"));
		
		System.out.println("News list : \n");
		newsList.forEach(System.out::println);
		
		System.out.println("\n--------------------------\n");
		System.out.println("NewsId which received maximum comments : \n");
		
		News news1=newsList.stream()
				.max((o1,o2)->o1.getComment().length()-o2.getComment().length())
				.get();
		System.out.println(news1.getNewsId());
		
		/*System.out.println("\n--------------------------\n");
		System.out.println("User posted maximum comments : \n");*/
		

		
		/*System.out.println("\n--------------------------\n");
		System.out.println("Display commentByUser wise number of comments : \n");*/
		
			
		
		
		
	}

}