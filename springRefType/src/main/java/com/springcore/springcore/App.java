package com.springcore.springcore;

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
        System.out.println( "Hello World!" );
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("NewFile.xml");
       A n= (A) context.getBean("aref");
       System.out.println(n.getX());
       System.out.println(n.getOb().getY());
    }
}
