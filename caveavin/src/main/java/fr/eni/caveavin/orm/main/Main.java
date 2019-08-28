package fr.eni.caveavin.orm.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.caveavin.orm.service.GestionVin;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("ApplicationSpringData_Marc.xml");
		GestionVin gv = cpxac.getBean("gestionVin", GestionVin.class);
		
		
		
	}

}
