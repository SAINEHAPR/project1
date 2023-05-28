package Basics1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
	Bike bike=(Bike) context.getBean("mybike");
	bike.riding();
	bike.sound();
	//if we give qualified name of another class we will get classCastException
	//so we have to give the name of nonstatic method class
}
}
