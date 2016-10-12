package com.test.app;
//import com.test.app.HelloWorld;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        
        AnnotationConfigApplicationContext context = 
        		   new AnnotationConfigApplicationContext();
        
        context.register(HelloWorldConfig.class); 
        context.refresh();
        HelloWorld hello = (HelloWorld) context.getBean("helloWorld"); 
        hello.setName("Adnan");
        hello.getName();
        
       /* HelloWorld hello = new HelloWorld();
        System.out.println( hello );
        hello.setName("Adnan");
        hello.getName(); */ 
    }
}
