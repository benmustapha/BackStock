package com.projet.stock.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "client")
public class Client {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String libelle;
	  private String adresse;
	  private String tel;
	  private String email;
	  private String fax;
	  private String login;
	  private String pwd;
	  private String smtva;
	  private String  matfisc;
	  private String  timbre;
	  private Date cree;
	  private float   soldinit;
	  private float   soldef;
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
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
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
	public String getSmtva() {
		return smtva;
	}
	public void setSmtva(String smtva) {
		this.smtva = smtva;
	}
	public String getMatfisc() {
		return matfisc;
	}
	public void setMatfisc(String matfisc) {
		this.matfisc = matfisc;
	}
	public String getTimbre() {
		return timbre;
	}
	public void setTimbre(String timbre) {
		this.timbre = timbre;
	}
	public Date getCree() {
		return cree;
	}
	public void setCree(Date cree) {
		this.cree = cree;
	}
	public float getSoldinit() {
		return soldinit;
	}
	public void setSoldinit(float soldinit) {
		this.soldinit = soldinit;
	}
	public float getSoldef() {
		return soldef;
	}
	public void setSoldef(float soldef) {
		this.soldef = soldef;
	}
	public Client(long id, String code, String libelle, String adresse, String tel, String email, String fax,
			String login, String pwd, String smtva, String matfisc, String timbre, Date cree, float soldinit,
			float soldef) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.fax = fax;
		this.login = login;
		this.pwd = pwd;
		this.smtva = smtva;
		this.matfisc = matfisc;
		this.timbre = timbre;
		this.cree = cree;
		this.soldinit = soldinit;
		this.soldef = soldef;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", code=" + code + ", libelle=" + libelle + ", adresse=" + adresse + ", tel=" + tel
				+ ", email=" + email + ", fax=" + fax + ", login=" + login + ", pwd=" + pwd + ", smtva=" + smtva
				+ ", matfisc=" + matfisc + ", timbre=" + timbre + ", cree=" + cree + ", soldinit=" + soldinit
				+ ", soldef=" + soldef + "]";
	}
	
}