package com.projet.stock.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "residence")
public class Societe {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String libelle;
	  private String slibelle;
	  private String adresse;
	  private String te1;
	  private String tel2;
	  private String fax;
	  private String matf;
	  private String rib;
	  private String banque;
	  private String numc;
	  private String numf;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getSlibelle() {
		return slibelle;
	}
	public void setSlibelle(String slibelle) {
		this.slibelle = slibelle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTe1() {
		return te1;
	}
	public void setTe1(String te1) {
		this.te1 = te1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMatf() {
		return matf;
	}
	public void setMatf(String matf) {
		this.matf = matf;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public String getBanque() {
		return banque;
	}
	public void setBanque(String banque) {
		this.banque = banque;
	}
	public String getNumc() {
		return numc;
	}
	public void setNumc(String numc) {
		this.numc = numc;
	}
	public String getNumf() {
		return numf;
	}
	public void setNumf(String numf) {
		this.numf = numf;
	}
	public Societe(long id, String libelle, String slibelle, String adresse, String te1, String tel2, String fax,
			String matf, String rib, String banque, String numc, String numf) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.slibelle = slibelle;
		this.adresse = adresse;
		this.te1 = te1;
		this.tel2 = tel2;
		this.fax = fax;
		this.matf = matf;
		this.rib = rib;
		this.banque = banque;
		this.numc = numc;
		this.numf = numf;
	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Societe [id=" + id + ", libelle=" + libelle + ", slibelle=" + slibelle + ", adresse=" + adresse
				+ ", te1=" + te1 + ", tel2=" + tel2 + ", fax=" + fax + ", matf=" + matf + ", rib=" + rib + ", banque="
				+ banque + ", numc=" + numc + ", numf=" + numf + "]";
	}
	
}
