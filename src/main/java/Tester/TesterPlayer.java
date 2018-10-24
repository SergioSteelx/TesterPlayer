package Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.superq.Factura;

public class TesterPlayer {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tester tester = applicationContext.getBean("testerDvd",Tester.class);
		Tester tester2 = applicationContext.getBean("testerMp3",Tester.class);
		Tester tester3 = applicationContext.getBean("testerBLR",Tester.class);
		Tester tester4 = applicationContext.getBean("testerSP",Tester.class);
		
		tester.test();
		System.out.println("\n");
		tester2.test();
		System.out.println("\n");
		tester3.test();
		System.out.println("\n");
		tester4.test();
			
	}

}
