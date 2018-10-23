package Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.superq.Factura;

public class TesterPlayer {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tester tester = applicationContext.getBean("tester",Tester.class);
		
		tester.test();
			
	}

}
