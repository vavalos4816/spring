package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.beans.Persona;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/example/xml/beans.xml");
		
		Persona m = (Persona)ac.getBean("persona");
		System.out.println(m.getId()+" "+m.getNombre()+" "+m.getApodo()+" "+m.getPais().getNombre()+" "+m.getCiudad().getNombre());
		((ConfigurableApplicationContext)ac).close();
	}
}