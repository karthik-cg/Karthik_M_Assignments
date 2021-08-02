package springcorecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSet {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springcorecollections/setconfig.xml");
		quesSet set1=(quesSet) context.getBean("set1");	
		
		System.out.println(set1.getAddresses());

		
		
	}

}
