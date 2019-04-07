package com.customer.freelance.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Spring boot app starting..." );
    	SpringApplication.run(App.class, args);
    	System.out.println( "Spring boot app started!" );
    }
}
