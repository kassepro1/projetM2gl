package sn.gesetudiant.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
public class Medecin implements Serializable{
	@Id
private Long id;
private String matricule ;
@ManyToOne
private Service service;
@MapsId
private Utilisateur utilisateur;
@OneToMany(mappedBy="medecin",fetch=FetchType.LAZY)
private Collection<Consultation> consultations;
public Medecin() {
	super();
	// TODO Auto-generated constructor stub
}
public Medecin(Long id, String matricule, Collection<Service> services) {
	super();
	this.id = id;
	this.matricule = matricule;
	this.service = service;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
public Service getService() {
	return service;
}
public void setService(Service service) {
	this.service = service;
}
public Utilisateur getUtilisateur() {
	return utilisateur;
}
public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}


}
