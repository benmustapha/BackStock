package com.projet.stock.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "scategorie")
public class Scategorie {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String code_categ;
	  private String libelle;
	  private int rang;
	public long getId() {
		return id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode_categ() {
		return code_categ;
	}
	public void setCode_categ(String code_categ) {
		this.code_categ = code_categ;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getRang() {
		return rang;
	}
	public void setRang(int rang) {
		this.rang = rang;
	}
	public Scategorie(long id, String code, String code_categ, String libelle, int rang) {
		super();
		this.id = id;
		this.code = code;
		this.code_categ = code_categ;
		this.libelle = libelle;
		this.rang = rang;
	}
	public Scategorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Scategorie [id=" + id + ", code=" + code + ", code_categ=" + code_categ + ", libelle=" + libelle
				+ ", rang=" + rang + "]";
	}

}
