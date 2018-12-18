package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.beans.Persona;
public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/example/xml/beans.xml");
		Persona m = ac.getBean("persona", Persona.class);
		System.out.println(m.getId() + " " + m.getNombre() + " " + m.getApodo() + " " + m.getPais().getNombre() + " " + m.getPais().getCiudad().getNombre());
		((ConfigurableApplicationContext) ac).close();
	}
}