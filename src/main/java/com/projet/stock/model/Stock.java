package com.projet.stock.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "stock")
public class Stock {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	private int code_dir;
	  private String code_art;
	  private Date date_invent;
	  private int stkinit;
	  private int qtee;
	  private int qtes;
	  private int stk;
	  private String lib_art;
	  private String lib_direction;
	public int getCode_dir() {
		return code_dir;
	}
	public void setCode_dir(int code_dir) {
		this.code_dir = code_dir;
	}
	public String getCode_art() {
		return code_art;
	}
	public void setCode_art(String code_art) {
		this.code_art = code_art;
	}
	public int getStkinit() {
		return stkinit;
	}
	public void setStkinit(int stkinit) {
		this.stkinit = stkinit;
	}
	public int getQtee() {
		return qtee;
	}
	public void setQtee(int qtee) {
		this.qtee = qtee;
	}
	public int getQtes() {
		return qtes;
	}
	public void setQtes(int qtes) {
		this.qtes = qtes;
	}
	public int getStk() {
		return stk;
	}
	public void setStk(int stk) {
		this.stk = stk;
	}
	public String getLib_art() {
		return lib_art;
	}
	public void setLib_art(String lib_art) {
		this.lib_art = lib_art;
	}
	public String getLib_direction() {
		return lib_direction;
	}
	public void setLib_direction(String lib_direction) {
		this.lib_direction = lib_direction;
	}
	
	public Date getDate_invent() {
		return date_invent;
	}
	public void setDate_invent(Date date_invent) {
		this.date_invent = date_invent;
	}
	public Stock(int code_dir, String code_art, Date date_invent, int stkinit, int qtee, int qtes, int stk,
			String lib_art, String lib_direction) {
		super();
		this.code_dir = code_dir;
		this.code_art = code_art;
		this.date_invent = date_invent;
		this.stkinit = stkinit;
		this.qtee = qtee;
		this.qtes = qtes;
		this.stk = stk;
		this.lib_art = lib_art;
		this.lib_direction = lib_direction;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [code_dir=" + code_dir + ", code_art=" + code_art + ", date_invent=" + date_invent + ", stkinit="
				+ stkinit + ", qtee=" + qtee + ", qtes=" + qtes + ", stk=" + stk + ", lib_art=" + lib_art
				+ ", lib_direction=" + lib_direction + "]";
	}
	  

}
