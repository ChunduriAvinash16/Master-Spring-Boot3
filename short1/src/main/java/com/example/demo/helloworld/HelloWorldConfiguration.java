package com.example.demo.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address){}

record Address(String firstLine,String city) {}
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Avinash";
	}
	@Bean
	public int age(){
		return 23;
	}

	@Bean
	public Person person(){
		return new Person("Sreekar", 23, new Address("BSR", "BNG"));
	}

	@Bean
	public Person person2methodCall() {
		return new Person(name(), age(),address());
	}

	@Bean
	@Primary
	public Person person3Paramater(String name,int age,Address address2) {
		return new Person(name, age,address2);
	}


	@Bean
	public Person person4Qualifier(String name,int age,Address address) {
		return new Person(name, age,address);
	}

	@Bean
	public Person person4Generic(String name,int age,@Qualifier(value = "Address2Qualifier")Address address) {
		return new Person(name, age,address);
	}

	@Bean(name = "address2")
	@Qualifier(value = "Address2Qualifier")
	public Address address() {
		return new Address("BSR Appartments", "Bengaluru");
	}

	@Bean(name = "address3")
	@Primary
	public Address address3() {
		return new Address("BSR Marthalli", "Bengaluru");
	}
}
