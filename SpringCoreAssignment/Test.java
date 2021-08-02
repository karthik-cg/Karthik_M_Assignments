package SpringCoreAssignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	

	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringCoreAssignment/config.xml");
        Customer customer1=(Customer) context.getBean("customer1");
        System.out.println(customer1);

	}

}
