package com.dutta.vehicle.gaddi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

//	/**
//	 * to explain normal Dependency Injection injection.
//	 */
//	public static void main(String[] args) {
//		ApplicationContext context  = new ClassPathXmlApplicationContext("springForNormalBeans.xml");
//		FourWheeler charchakka = (FourWheeler)context.getBean("fourWheeler");
//		charchakka.drive();
//		((ConfigurableApplicationContext)context).close();
//
//	}

//	/**
//	 * to explain component scan. Look at springForComponentScan.xml for
//	 * context:component-scan than get the Bean for volvoAsComponent such that its
//	 * object will be injected and drive() method is called. But the class
//	 * VolvoAsComponent as Maruti maruti as object and has to intialized
//	 * using @Autowired and @Component
//	 */
//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("springForComponentScan.xml");
//		FourWheeler charchakka = (FourWheeler) context.getBean("volvoAsComponent");
//		charchakka.drive();
//		((ConfigurableApplicationContext) context).close();
//
//	}
//
//	/**
//	 * to explain dependency injection with property
//	 */
//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("springWithProperty.xml");
//		/*
//		 * the parameter as string passed in getBean() method should be same as bean id
//		 * in springWithProperty
//		 */
//		Tata charchakka = (Tata) context.getBean("tata");
//		charchakka.drive();
//		((ConfigurableApplicationContext) context).close();
//
//	}
//
	/**
	 * to explain Annotation based dependency injection
	 */
	public static void main(String[] args) {
		ApplicationContext factory  = new AnnotationConfigApplicationContext(AppConfig.class);
		Hundai charchakka = factory.getBean(Hundai.class);
		charchakka.feature();
		((ConfigurableApplicationContext)factory).close();
	}	

}
