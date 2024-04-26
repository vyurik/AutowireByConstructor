package edu.vyurik.spring.iocdi.autowired.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.vyurik.spring.iocdi.autowired.bean.Category;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/app-context-xml.xml");
    	
			
		System.out.println("=====================bookAutowiredByConstructor  Output Start ===============================");
		Category category = context.getBean("category", Category.class);
		System.out.println("Autowiring by Constructor: book = "+ category.getBook().toString());
		System.out.println("======================bookAutowiredByConstructor   Output End ================================="); 
    }
}