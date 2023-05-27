package springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test_car {
	
	public static void main(String[] args) {
		
//		ClassPathResource cpr=new ClassPathResource("ioc.xml");
//		BeanFactory bf=new XmlBeanFactory(cpr);
//		Car c=(Car) bf.getBean("mycar");
//		c.audi();
		
//		Since ioc.xml is present inside src/main/java we are using "ClassPathXmlApplicationContext" class
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		Car c=(Car) ac.getBean("mycar");
		c.audi();
		
	}

}
