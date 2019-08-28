package fr.eni.caveavin.orm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vin")

public class Vin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String petillant;
	private String millesime;
	private String couleur;
	private String region;
	private int quantite;
	
	/** Constructeurs
	 * 
	 */
	public Vin() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param petillant
	 * @param millesime
	 * @param couleur
	 * @param region
	 * @param quantite
	 */
	public Vin(int id, String nom, String petillant, String millesime, String couleur, String region, int quantite) {
		this.id = id;
		this.nom = nom;
		this.petillant = petillant;
		this.millesime = millesime;
		this.couleur = couleur;
		this.region = region;
		this.quantite = quantite;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the petillant
	 */
	public String getPetillant() {
		return petillant;
	}

	/**
	 * @param petillant the petillant to set
	 */
	public void setPetillant(String petillant) {
		this.petillant = petillant;
	}

	/**
	 * @return the millesime
	 */
	public String getMillesime() {
		return millesime;
	}

	/**
	 * @param millesime the millesime to set
	 */
	public void setMillesime(String millesime) {
		this.millesime = millesime;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Vin [id=%s, nom=%s, petillant=%s, millesime=%s, couleur=%s, region=%s, quantite=%s]", id,
				nom, petillant, millesime, couleur, region, quantite);
	}
	
	
}
