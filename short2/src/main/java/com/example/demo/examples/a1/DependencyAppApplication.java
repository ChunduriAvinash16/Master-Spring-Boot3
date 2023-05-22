package com.example.demo.examples.a1;

import com.example.demo.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusiness{
	Dependency1 dependency1;
	Dependency2 dependency2;

	public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
		System.out.println("Inside constructor injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Inside Setter for Dependency 1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Inside Setter for Dependency 2");
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return dependency1+" "+dependency2;
	}

}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DependencyAppApplication {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(
				DependencyAppApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusiness.class));
		}
	}
}
