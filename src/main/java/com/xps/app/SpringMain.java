package com.xps.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) throws Exception {
		
		if (args == null) {
			throw new Exception("Argument cannot be null");
		}
		
		String contextFile = args[0];
		System.out.println("Initiating context " + contextFile);
		
		try{
			@SuppressWarnings({ "unused", "resource" })
			ApplicationContext appContext = new ClassPathXmlApplicationContext(contextFile);
		}catch(Error e) {
			System.out.println("SpringMain failed to start");
		}
		System.out.println("SpringMain started");
	}
}
