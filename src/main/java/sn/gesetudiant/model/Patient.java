package sn.gesetudiant.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="patient")
public class Patient implements Serializable {
	@Id @GeneratedValue
 private Long id;
 private String numerodossier;
 private String nom;
 private String tel;
 @Temporal(TemporalType.DATE)
 private Date datenais;
 @OneToMany(mappedBy="patient",fetch=FetchType.LAZY)
 private Collection<Consultation> consultations;
 
 
 
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(Long id, String numerodossier, String nom, String tel, Date datenais) {
	super();
	this.id = id;
	this.numerodossier = numerodossier;
	this.nom = nom;
	this.tel = tel;
	this.datenais = datenais;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNumerodossier() {
	return numerodossier;
}
public void setNumerodossier(String numerodossier) {
	this.numerodossier = numerodossier;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Date getDatenais() {
	return datenais;
}
public void setDatenais(Date datenais) {
	this.datenais = datenais;
}
 
 
}
