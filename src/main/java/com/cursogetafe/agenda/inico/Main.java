package com.cursogetafe.agenda.inico;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.cursogetafe.agenda.config.Config;



public class Main {

	public static void main(String[] args) { //uno le puede pasar parameteos al main 
		
		
		new AnnotationConfigApplicationContext(Config.class);
		
		
	
		

	}

}
