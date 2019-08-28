package fr.eni.caveavin.orm.service;

import java.util.List;

import javax.print.attribute.standard.PDLOverrideSupported;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.caveavin.orm.bean.Vin;
import fr.eni.caveavin.orm.dao.VinDao;

@Service(value="gestionVin")
public class GestionVin {
	
	@Autowired
	VinDao vDao;
	
	public List<Vin> listeVin(){
		return vDao.findAll();
	}
	public Vin rechercherVin(int id) {
		return vDao.findOne(id);
	}
	public void ajouterVin(Vin v){
		vDao.save(v);
	}
	public void modifierVin(Vin v) {
		vDao.save(v);
	}
	public void supprimerVin(Vin v) {
		vDao.delete(v);
	}
	public void supprimerVin(int id) {
		vDao.delete(id);
	}
	public long nombreDelements() {
		return vDao.count();
	}
	public List<Vin> rechercherVinParNom(String nom){
		return vDao.findByName(nom);
	}
	public List<Vin> rechercherVinParNomDecroissant(String nom){
		return vDao.findByNameOrderByDesc(nom);
	}
	public List<Vin> rechercherVinParMellesime(String millesime){
		return vDao.findByVintage(millesime);
	}
	public List<Vin> rechercherVinParMellesimeDecroissant(String millesime){
		return vDao.findByVintageOrderDesc(millesime);
	}
	public List<Vin> rechercherVinPetillant(String petillant){
		return vDao.findBySparkling(petillant);
	}
	// Retourne une liste vins classés par quantité par ordre croissant
	public List<Vin> rechercherVinParQuantite(String quantite){
		return vDao.findByQuantity(quantite);
	}
	// Retourne une liste vins classés par quantité par ordre décroissant
	public List<Vin> rechercherVinParQuantiteDecroissant(String quantite){
		return vDao.findByQuantityOrderDesc(quantite);
	}
	public List<Vin> rechercherVinParCouleur(String couleur){
		return vDao.findByColor(couleur);
	}
	public List<Vin> rechercherVinParCouleurDecroissant(String couleur){
		return vDao.findByColorOrderDesc(couleur);
	}
	public List<Vin> rechercherVinParRegion(String region){
		return vDao.findByCountry(region);
	}
	public List<Vin> rechercherVinParRegionDecroissant(String region){
		return vDao.findByCountryOrderDesc(region);
	}
}
