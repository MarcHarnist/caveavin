package fr.eni.caveavin.orm.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.caveavin.orm.bean.Vin;
import fr.eni.caveavin.orm.service.GestionVin;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		GestionVin gv = cpxac.getBean("gestionVin", GestionVin.class);
		
		List<Vin> liste = gv.listeVin();
		for(Vin vin : liste) {
			System.out.println(vin);
		}
		
		Vin vin1 = new Vin(0, "Château Gormeaux", "non", "2014", "Blanc", "Bourgogne", 0);
		System.out.println("Liste des vins après l'ajout");
		liste= gv.listeVin();
		for(Vin vin : liste) {
			System.out.println(vin);
		}
				
		
	}

}
