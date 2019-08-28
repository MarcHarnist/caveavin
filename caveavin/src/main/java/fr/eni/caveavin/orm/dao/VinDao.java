package fr.eni.caveavin.orm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.caveavin.orm.bean.Vin;

public interface VinDao extends JpaRepository<Vin, Integer> {
	
	// Find by name
	List<Vin> findByNom(String nom);
	
	// Find by vintage
	List<Vin> findByMillesime(String millesime);
		
	// Find by sparkling vine = "oui" (yes in french)
	List<Vin> findByPetillant(String petillant);

	// Find by color
	List<Vin> findByCouleur(String couleur);

	// Find by country
	List<Vin> findByRegion(String region);
}
