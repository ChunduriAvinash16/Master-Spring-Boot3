package com.example.demo.helloworld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHello1BasicJava {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(
				HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));

		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));

		System.out.println(context.getBean("person2methodCall"));

		System.out.println(context.getBean("person3Paramater"));

		System.out.println(context.getBean("person4Generic"));

		System.out.println(context.getBean("address2")); //name of the bean

		System.out.println(context.getBean(Address.class)); // type of the bean

		System.out.println(context.getBean(Person.class));

		System.out.println();

//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(context.getBean("person4Generic"));
	}
}
