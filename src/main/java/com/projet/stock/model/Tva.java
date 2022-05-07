package com.projet.stock.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tva")
public class Tva {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int tva1;
	  private int tva2;
	  private int tva3;
	  private int tva4;
	  private int timbre;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getTva1() {
		return tva1;
	}
	public void setTva1(int tva1) {
		this.tva1 = tva1;
	}
	public int getTva2() {
		return tva2;
	}
	public void setTva2(int tva2) {
		this.tva2 = tva2;
	}
	public int getTva3() {
		return tva3;
	}
	public void setTva3(int tva3) {
		this.tva3 = tva3;
	}
	public int getTva4() {
		return tva4;
	}
	public void setTva4(int tva4) {
		this.tva4 = tva4;
	}
	public int getTimbre() {
		return timbre;
	}
	public void setTimbre(int timbre) {
		this.timbre = timbre;
	}
	public Tva(long id, int annee, int tva1, int tva2, int tva3, int tva4, int timbre) {
		super();
		this.id = id;
		this.annee = annee;
		this.tva1 = tva1;
		this.tva2 = tva2;
		this.tva3 = tva3;
		this.tva4 = tva4;
		this.timbre = timbre;
	}
	public Tva() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tva [id=" + id + ", annee=" + annee + ", tva1=" + tva1 + ", tva2=" + tva2 + ", tva3=" + tva3 + ", tva4="
				+ tva4 + ", timbre=" + timbre + "]";
	}
	  
	  
}
