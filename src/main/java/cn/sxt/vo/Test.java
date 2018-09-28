package cn.sxt.vo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		User stu=(User)ac.getBean("u1");
		
		System.out.println(stu.toString());
		
		
//		ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
//		Student stu=(Student)ac1.getBean("student");
//		stu.show();
//		

	}

}
