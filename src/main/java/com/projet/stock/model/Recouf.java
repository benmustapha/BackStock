package com.projet.stock.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "recouf")
public class Recouf {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  private int code_four;
	  private String lib_four;
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  private LocalDate date_reg;
	  private String libelle;
	  private float total;
	  @JsonManagedReference
	    @OneToMany(mappedBy = "recouf")
	    @Valid
	    private List<Lrecouf> lrecoufs = new ArrayList<>();
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCode_four() {
		return code_four;
	}
	public void setCode_four(int code_four) {
		this.code_four = code_four;
	}
	public String getLib_four() {
		return lib_four;
	}
	public void setLib_four(String lib_four) {
		this.lib_four = lib_four;
	}
	public LocalDate getDate_reg() {
		return date_reg;
	}
	public void setDate_reg(LocalDate date_reg) {
		this.date_reg = date_reg;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public List<Lrecouf> getLrecoufs() {
		return lrecoufs;
	}
	public void setLrecoufs(List<Lrecouf> lrecoufs) {
		this.lrecoufs = lrecoufs;
	}
	public Recouf(long id, int annee, int numero, int code_four, String lib_four, LocalDate date_reg, String libelle,
			float total, @Valid List<Lrecouf> lrecoufs) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.code_four = code_four;
		this.lib_four = lib_four;
		this.date_reg = date_reg;
		this.libelle = libelle;
		this.total = total;
		this.lrecoufs = lrecoufs;
	}
	public Recouf() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Recouf [id=" + id + ", annee=" + annee + ", numero=" + numero + ", code_four=" + code_four
				+ ", lib_four=" + lib_four + ", date_reg=" + date_reg + ", libelle=" + libelle + ", total=" + total
				+ ", lrecoufs=" + lrecoufs + "]";
	}

}
