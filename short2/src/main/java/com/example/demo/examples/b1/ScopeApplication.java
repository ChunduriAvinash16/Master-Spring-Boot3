package com.example.demo.examples.b1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Normalclass{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototypeclass {

}
@Configuration
@ComponentScan
public class ScopeApplication {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(
				ScopeApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(Normalclass.class));
			System.out.println(context.getBean(Normalclass.class));
			System.out.println(context.getBean(Normalclass.class));

			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));

		}
	}
}
