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
@Table(name = "commService")

public class CommService {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  private LocalDate date_comm;
	  private int code_client;
	  private String libelle;
	  private String lib_client;
	  private float avance;
	  private float totht;
	  private float tottva;
	  private float totttc;
	  @JsonManagedReference
	    @OneToMany(mappedBy = "commService")
	    @Valid
	    private List<LcommService> lcomms = new ArrayList<>();
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
	public LocalDate getDate_comm() {
		return date_comm;
	}
	public void setDate_comm(LocalDate date_comm) {
		this.date_comm = date_comm;
	}
	public int getCode_client() {
		return code_client;
	}
	public void setCode_client(int code_client) {
		this.code_client = code_client;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getLib_client() {
		return lib_client;
	}
	public void setLib_client(String lib_client) {
		this.lib_client = lib_client;
	}
	public float getAvance() {
		return avance;
	}
	public void setAvance(float avance) {
		this.avance = avance;
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
	public List<LcommService> getLcomms() {
		return lcomms;
	}
	public void setLcomms(List<LcommService> lcomms) {
		this.lcomms = lcomms;
	}
	public CommService(long id, int annee, int numero, LocalDate date_comm, int code_client, String libelle,
			String lib_client, float avance, float totht, float tottva, float totttc,
			@Valid List<LcommService> lcomms) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.date_comm = date_comm;
		this.code_client = code_client;
		this.libelle = libelle;
		this.lib_client = lib_client;
		this.avance = avance;
		this.totht = totht;
		this.tottva = tottva;
		this.totttc = totttc;
		this.lcomms = lcomms;
	}
	public CommService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CommService [id=" + id + ", annee=" + annee + ", numero=" + numero + ", date_comm=" + date_comm
				+ ", code_client=" + code_client + ", libelle=" + libelle + ", lib_client=" + lib_client + ", avance="
				+ avance + ", totht=" + totht + ", tottva=" + tottva + ", totttc=" + totttc + ", lcomms=" + lcomms
				+ "]";
	}


}
