package sn.gesetudiant.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="consultation")
public class Consultation implements Serializable{
	@Id @GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateCons;
	private String commentaire;
	private String prescription;
	@JoinColumn(name = "patient_id", referencedColumnName = "id")
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Service service;
	@ManyToOne
	private Medecin medecin;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateCons() {
		return dateCons;
	}
	public void setDateCons(Date dateCons) {
		this.dateCons = dateCons;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Consultation(Long id, Date dateCons, String commentaire, String prescription, Patient patient,
			Service service) {
		super();
		this.id = id;
		this.dateCons = dateCons;
		this.commentaire = commentaire;
		this.prescription = prescription;
		this.patient = patient;
		this.service = service;
	}
	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
