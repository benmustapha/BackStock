package com.projet.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String nom;
	  private String role;
	  private String login;
	  private String pwd;
	public long getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Utilisateur(long id, String nom, String role, String login, String pwd) {
		super();
		this.id = id;
		this.nom = nom;
		this.role = role;
		this.login = login;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", role=" + role + ", login=" + login + ", pwd=" + pwd + "]";
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
}