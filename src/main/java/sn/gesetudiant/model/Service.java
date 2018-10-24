package sn.gesetudiant.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="service")
public class Service implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String libelle;
	@OneToMany(mappedBy="service",fetch=FetchType.LAZY)
	private Collection<Consultation> consultations;
	@OneToMany(mappedBy="service",fetch=FetchType.LAZY)
	private Collection<Medecin> medecins;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
}
