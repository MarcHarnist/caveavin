package fr.eni.caveavin.orm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.caveavin.orm.bean.Vin;

public interface VinDao extends JpaRepository<Vin, Integer> {
	
	// Find by name order asc
	List<Vin> findByName(String nom);
	
	// Find by name order desc
	List<Vin> findByNameOrderByDesc(String nom);
	
	// Find by vintage order asc
	List<Vin> findByVintage(String millesime);
		
	// Find by vintage order desc
	List<Vin> findByVintageOrderDesc(String millesime);
	
	// Find by sparkling vine = "oui" (yes in french)
	List<Vin> findBySparkling(String petillant);

	// Find by  order asc
	List<Vin> findByQuantity(String quantite);
	
	// Find by quantity order desc
	
	// Find by color order asc
	List<Vin> findByColor(String couleur);

	// Find by color order desc
	List<Vin> findByColorOrderDesc(String couleur);
	
	// Find by  order asc
	List<Vin> findByCountry(String region);

	// Find by  order desc
	List<Vin> findByCountryOrderDesc(String region);
}
