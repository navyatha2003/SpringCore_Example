package SpringCore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContect.xml");
        
    	Emp1 emp1 = (Emp1) context.getBean("emp1");
    	Emp2 emp2 = (Emp2) context.getBean(Emp2.class);
    	
    	System.out.println(emp1);
    	System.out.println(emp2);
        
    }
}
