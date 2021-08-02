package springcorecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testList {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springcorecollections/listconfig.xml");
		quesList list1=(quesList) context.getBean("list1");	
		
		System.out.println(list1.getName());
		System.out.println(list1.getPhones());
		
	}

}
