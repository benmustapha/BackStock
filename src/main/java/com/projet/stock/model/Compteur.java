package com.projet.stock.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compteur")
public class Compteur {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	private int annee;
	private int numcomm;
	private int numcomms;
	private int numbl;
	private int numblf;
	private int numcommf;
	private int numav;
	private int numavf;
	private int numbr;
	private int numbs;
	private int numfac;
	private int numfacf;
	private int numreg;
	private int numregf;
	private int numchq;
	private int numdev;
	private int numinv;
	private int numimp;
	private int numimpf;
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
	public int getNumcomm() {
		return numcomm;
	}
	public void setNumcomm(int numcomm) {
		this.numcomm = numcomm;
	}
	public int getNumcomms() {
		return numcomms;
	}
	public void setNumcomms(int numcomms) {
		this.numcomms = numcomms;
	}
	public int getNumbl() {
		return numbl;
	}
	public void setNumbl(int numbl) {
		this.numbl = numbl;
	}
	public int getNumblf() {
		return numblf;
	}
	public void setNumblf(int numblf) {
		this.numblf = numblf;
	}
	public int getNumcommf() {
		return numcommf;
	}
	public void setNumcommf(int numcommf) {
		this.numcommf = numcommf;
	}
	public int getNumav() {
		return numav;
	}
	public void setNumav(int numav) {
		this.numav = numav;
	}
	public int getNumavf() {
		return numavf;
	}
	public void setNumavf(int numavf) {
		this.numavf = numavf;
	}
	public int getNumbr() {
		return numbr;
	}
	public void setNumbr(int numbr) {
		this.numbr = numbr;
	}
	public int getNumbs() {
		return numbs;
	}
	public void setNumbs(int numbs) {
		this.numbs = numbs;
	}
	public int getNumfac() {
		return numfac;
	}
	public void setNumfac(int numfac) {
		this.numfac = numfac;
	}
	public int getNumfacf() {
		return numfacf;
	}
	public void setNumfacf(int numfacf) {
		this.numfacf = numfacf;
	}
	public int getNumreg() {
		return numreg;
	}
	public void setNumreg(int numreg) {
		this.numreg = numreg;
	}
	public int getNumregf() {
		return numregf;
	}
	public void setNumregf(int numregf) {
		this.numregf = numregf;
	}
	public int getNumchq() {
		return numchq;
	}
	public void setNumchq(int numchq) {
		this.numchq = numchq;
	}
	public int getNumdev() {
		return numdev;
	}
	public void setNumdev(int numdev) {
		this.numdev = numdev;
	}
	public int getNuminv() {
		return numinv;
	}
	public void setNuminv(int numinv) {
		this.numinv = numinv;
	}
	public int getNumimp() {
		return numimp;
	}
	public void setNumimp(int numimp) {
		this.numimp = numimp;
	}
	public int getNumimpf() {
		return numimpf;
	}
	public void setNumimpf(int numimpf) {
		this.numimpf = numimpf;
	}
	public Compteur(long id, int annee, int numcomm, int numcomms, int numbl, int numblf, int numcommf, int numav,
			int numavf, int numbr, int numbs, int numfac, int numfacf, int numreg, int numregf, int numchq, int numdev,
			int numinv, int numimp, int numimpf) {
		super();
		this.id = id;
		this.annee = annee;
		this.numcomm = numcomm;
		this.numcomms = numcomms;
		this.numbl = numbl;
		this.numblf = numblf;
		this.numcommf = numcommf;
		this.numav = numav;
		this.numavf = numavf;
		this.numbr = numbr;
		this.numbs = numbs;
		this.numfac = numfac;
		this.numfacf = numfacf;
		this.numreg = numreg;
		this.numregf = numregf;
		this.numchq = numchq;
		this.numdev = numdev;
		this.numinv = numinv;
		this.numimp = numimp;
		this.numimpf = numimpf;
	}
	public Compteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Compteur [id=" + id + ", annee=" + annee + ", numcomm=" + numcomm + ", numcomms=" + numcomms
				+ ", numbl=" + numbl + ", numblf=" + numblf + ", numcommf=" + numcommf + ", numav=" + numav
				+ ", numavf=" + numavf + ", numbr=" + numbr + ", numbs=" + numbs + ", numfac=" + numfac + ", numfacf="
				+ numfacf + ", numreg=" + numreg + ", numregf=" + numregf + ", numchq=" + numchq + ", numdev=" + numdev
				+ ", numinv=" + numinv + ", numimp=" + numimp + ", numimpf=" + numimpf + "]";
	}
	

	
}
