package fr.eni.caveavin.orm.service;

import java.util.List;

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
		return vDao.findByNom(nom);
	}
	public List<Vin> rechercherVinParMellesime(String millesime){
		return vDao.findByMillesime(millesime);
	}
	public List<Vin> rechercherVinPetillant(String petillant){
		return vDao.findByPetillant(petillant);
	}
	public List<Vin> rechercherVinParCouleur(String couleur){
		return vDao.findByCouleur(couleur);
	}
	public List<Vin> rechercherVinParRegion(String region){
		return vDao.findByRegion(region);
	}
}
