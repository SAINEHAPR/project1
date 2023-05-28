package Basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mymobile {
	public static void main(String[] args) {
//	ClassPathResource resource=new ClassPathResource("ioc1.xml");
//BeanFactory beanFactory=new XmlBeanFactory(resource);
//Mobile mobile=(Mobile) beanFactory.getBean("mymobile");
//mobile.musicPlayer();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile mobile=(Mobile) context.getBean("mymobile");
		mobile.musicPlayer();
}
}