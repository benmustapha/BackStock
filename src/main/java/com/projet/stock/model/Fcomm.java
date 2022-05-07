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
@Table(name = "fcomm")
public class Fcomm {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  private int code_four;
	  private String lib_four;
	  private int code_dir;
	  private String lib_direction;
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  private LocalDate date_mvt;
	  private String libelle;
	  private float totht;
	  private float tottva;
	  private float totttc;
	  @JsonManagedReference
	    @OneToMany(mappedBy = "fcomm")
	    @Valid
	    private List<Lfcomm> lfcomms = new ArrayList<>();
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
	public int getCode_dir() {
		return code_dir;
	}
	public void setCode_dir(int code_dir) {
		this.code_dir = code_dir;
	}
	public String getLib_direction() {
		return lib_direction;
	}
	public void setLib_direction(String lib_direction) {
		this.lib_direction = lib_direction;
	}
	public LocalDate getDate_mvt() {
		return date_mvt;
	}
	public void setDate_mvt(LocalDate date_mvt) {
		this.date_mvt = date_mvt;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getTotht() {
		return totht;
	}
	public void setTotht(float totht) {
		this.totht = totht;
	}
	public float getTottva() {
		return tottva;
	}
	public void setTottva(float tottva) {
		this.tottva = tottva;
	}
	public float getTotttc() {
		return totttc;
	}
	public void setTotttc(float totttc) {
		this.totttc = totttc;
	}
	public List<Lfcomm> getLfcomms() {
		return lfcomms;
	}
	public void setLfcomms(List<Lfcomm> lfcomms) {
		this.lfcomms = lfcomms;
	}
	public Fcomm(long id, int annee, int numero, int code_four, String lib_four, int code_dir, String lib_direction,
			LocalDate date_mvt, String libelle, float totht, float tottva, float totttc, @Valid List<Lfcomm> lfcomms) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.code_four = code_four;
		this.lib_four = lib_four;
		this.code_dir = code_dir;
		this.lib_direction = lib_direction;
		this.date_mvt = date_mvt;
		this.libelle = libelle;
		this.totht = totht;
		this.tottva = tottva;
		this.totttc = totttc;
		this.lfcomms = lfcomms;
	}
	public Fcomm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fcomm [id=" + id + ", annee=" + annee + ", numero=" + numero + ", code_four=" + code_four
				+ ", lib_four=" + lib_four + ", code_dir=" + code_dir + ", lib_direction=" + lib_direction
				+ ", date_mvt=" + date_mvt + ", libelle=" + libelle + ", totht=" + totht + ", tottva=" + tottva
				+ ", totttc=" + totttc + ", lfcomms=" + lfcomms + "]";
	}

	
}
