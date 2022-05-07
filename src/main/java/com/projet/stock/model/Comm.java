package com.projet.stock.model;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "commande")
public class Comm {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date date_comm;
	  private int code_client;
	  private String libelle;
	  private String lib_client;
	  private double avance;
	  private double totht;
	  private double tottva;
	  private double totttc;
	  @JsonManagedReference
	  @JsonIgnore
	  @OneToMany(mappedBy = "comm", fetch=FetchType.EAGER)
      @Valid
	  private List<Lcomm> lcomms = new ArrayList<>();
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
	public Date getDate_comm() {
		return date_comm;
	}
	public void setDate_comm(Date date_comm) {
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
	public double getAvance() {
		return avance;
	}
	public void setAvance(double avance) {
		this.avance = avance;
	}
	public double getTotht() {
		return totht;
	}
	public void setTotht(double totht) {
		this.totht = totht;
	}
	public double getTottva() {
		return tottva;
	}
	public void setTottva(double tottva) {
		this.tottva = tottva;
	}
	public double getTotttc() {
		return totttc;
	}
	public void setTotttc(double totttc) {
		this.totttc = totttc;
	}
	public List<Lcomm> getLcomms() {
		return lcomms;
	}
	public void setLcomms(List<Lcomm> lcomms) {
		this.lcomms = lcomms;
	}
	public Comm(long id, int annee, int numero, Date date_comm, int code_client, String libelle, String lib_client,
			double avance, double totht, double tottva, double totttc, @Valid List<Lcomm> lcomms) {
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
	public Comm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Comm [id=" + id + ", annee=" + annee + ", numero=" + numero + ", date_comm=" + date_comm
				+ ", code_client=" + code_client + ", libelle=" + libelle + ", lib_client=" + lib_client + ", avance="
				+ avance + ", totht=" + totht + ", tottva=" + tottva + ", totttc=" + totttc + ", lcomms=" + lcomms
				+ "]";
	}


}
