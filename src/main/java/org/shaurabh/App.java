package org.shaurabh;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //get bean by type/class
       Devs devs= (Devs) context.getBean( Devs.class );

        devs.build();

    }
}
