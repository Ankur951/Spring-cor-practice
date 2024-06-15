package SpringCollections;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext collection= new ClassPathXmlApplicationContext("SpringCollections/springcon.xml");
    	BeenClassForCollection emp1 =(BeenClassForCollection)collection.getBean("emp1");
    	System.out.print(emp1.getName());
    	System.out.println(emp1.getPhonNo());
    	System.out.println(emp1.getAdd());
    	System.out.println(emp1.getCourses());
    }
}
