package springcorecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMap {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springcorecollections/mapconfig.xml");
		quesMap map1=(quesMap) context.getBean("map1");	
		
		System.out.println(map1.getCourses());

	}

}
