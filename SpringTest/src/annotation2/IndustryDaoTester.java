package annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class IndustryDaoTester {
	
	public static void main(String[] args) {
//		IndustryDaoTester tester=new IndustryDaoTester();
//		tester.dao.getData("this is example");
		
		ApplicationContext context=new AnnotationConfigApplicationContext("annotation2");
<<<<<<< HEAD
//		ApplicationContext context=new ClassPathXmlApplicationContext("/annotation2.xml");
=======
//		ApplicationContext context=new ClassPathXmlApplicationContext("./annotation2.xml");
>>>>>>> 10ade6d4e52b7ae90262ff3b2a12a39fd974d43b
		IndustryDaoService tester=context.getBean(IndustryDaoService.class);
		tester.insertIndustry("IBM");
	}
}
