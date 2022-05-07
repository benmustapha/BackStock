package com.projet.stock.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "article")
@JsonInclude(value=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Article {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String code_b;
	  private String libelle;
	  private float pa;
	  private float pv;
	  private int tva;
	  private int fodec;
	  private int stock;
	  private int stkinit;
	  private String codeCateg;
	  private String codeScateg;
	  private String fileName;
	  private Date cree;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode_b() {
		return code_b;
	}
	public void setCode_b(String code_b) {
		this.code_b = code_b;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getPa() {
		return pa;
	}
	public void setPa(float pa) {
		this.pa = pa;
	}
	public float getPv() {
		return pv;
	}
	public void setPv(float pv) {
		this.pv = pv;
	}
	public int getTva() {
		return tva;
	}
	public void setTva(int tva) {
		this.tva = tva;
	}
	public int getFodec() {
		return fodec;
	}
	public void setFodec(int fodec) {
		this.fodec = fodec;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStkinit() {
		return stkinit;
	}
	public void setStkinit(int stkinit) {
		this.stkinit = stkinit;
	}
	public String getCodeCateg() {
		return codeCateg;
	}
	public void setCodeCateg(String codeCateg) {
		this.codeCateg = codeCateg;
	}
	public String getCodeScateg() {
		return codeScateg;
	}
	public void setCodeScateg(String codeScateg) {
		this.codeScateg = codeScateg;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public Date getCree() {
		return cree;
	}
	public void setCree(Date cree) {
		this.cree = cree;
	}
	public Article(long id, String code, String code_b, String libelle, float pa, float pv, int tva, int fodec,
			int stock, int stkinit, String codeCateg, String codeScateg, String fileName,  Date cree) {
		super();
		this.id = id;
		this.code = code;
		this.code_b = code_b;
		this.libelle = libelle;
		this.pa = pa;
		this.pv = pv;
		this.tva = tva;
		this.fodec = fodec;
		this.stock = stock;
		this.stkinit = stkinit;
		this.codeCateg = codeCateg;
		this.codeScateg = codeScateg;
		this.fileName = fileName;
		
		this.cree = cree;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", code_b=" + code_b + ", libelle=" + libelle + ", pa=" + pa
				+ ", pv=" + pv + ", tva=" + tva + ", fodec=" + fodec + ", stock=" + stock + ", stkinit=" + stkinit
				+ ", codeCateg=" + codeCateg + ", codeScateg=" + codeScateg + ", fileName=" + fileName + ", cree="
				+ cree + "]";
	}

}
