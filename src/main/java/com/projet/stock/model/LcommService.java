package com.projet.stock.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "lcommService")

public class LcommService {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int numero;
	  private String code_article;
	  private String Libart;
	  private int pu;
	  private float qte;
	  private int tva;
	  private float totht;
	  @ManyToOne
	    @JoinColumn
	    private CommService commService;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCode_article() {
		return code_article;
	}
	public void setCode_article(String code_article) {
		this.code_article = code_article;
	}
	public String getLibart() {
		return Libart;
	}
	public void setLibart(String libart) {
		Libart = libart;
	}
	public int getPu() {
		return pu;
	}
	public void setPu(int pu) {
		this.pu = pu;
	}
	public float getQte() {
		return qte;
	}
	public void setQte(float qte) {
		this.qte = qte;
	}
	public int getTva() {
		return tva;
	}
	public void setTva(int tva) {
		this.tva = tva;
	}
	public float getTotht() {
		return totht;
	}
	public void setTotht(float totht) {
		this.totht = totht;
	}
	public CommService getCommService() {
		return commService;
	}
	public void setCommservice(CommService commService) {
		this.commService = commService;
	}
	public LcommService(long id, int numero, String code_article, String libart, int pu, float qte, int tva,
			float totht, CommService commService) {
		super();
		this.id = id;
		this.numero = numero;
		this.code_article = code_article;
		Libart = libart;
		this.pu = pu;
		this.qte = qte;
		this.tva = tva;
		this.totht = totht;
		this.commService = commService;
	}
	public LcommService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LcommService [id=" + id + ", numero=" + numero + ", code_article=" + code_article + ", Libart=" + Libart
				+ ", pu=" + pu + ", qte=" + qte + ", tva=" + tva + ", totht=" + totht + ", commService=" + commService
				+ "]";
	}
	
}
