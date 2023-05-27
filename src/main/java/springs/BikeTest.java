package springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BikeTest {

	public static void main(String[] args) {

		ClassPathResource cp = new ClassPathResource("ioc.xml");
		BeanFactory bc = new XmlBeanFactory(cp);
		Bike bb = (Bike)bc.getBean("bike");
		bb.price();

//		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
//		Bike b=(Bike) ac.getBean("bike");
//		b.price();
		
	}

}
