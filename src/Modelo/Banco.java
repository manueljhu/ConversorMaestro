package Modelo;

import java.util.Objects;

//Bancos de la empresa
public class Banco {
	private String cue;
	private String des;
	private float rie;
	private String cta;
	private String dir;
	private String pob;
	private int npro;
	private String pro;
	private String suf;
	private String email;
	private String iban;
	private String swift;
	
	public Banco() {
		this.cue="";
		this.des="";
		this.cta="";
		this.dir="";
		this.pob="";
		this.pro="";
		this.suf="";
		this.email="";
		this.iban="";
		this.swift="";
	}
	
	public String getCue() {
		return cue;
	}
	public void setCue(String cue) {
		this.cue = cue;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getRie() {
		return rie;
	}
	public void setRie(float rie) {
		this.rie = rie;
	}
	public String getCta() {
		return cta;
	}
	public void setCta(String cta) {
		this.cta = cta;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public int getNpro() {
		return npro;
	}
	public void setNpro(int npro) {
		this.npro = npro;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getSuf() {
		return suf;
	}
	public void setSuf(String suf) {
		this.suf = suf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getSwift() {
		return swift;
	}
	public void setSwift(String swift) {
		this.swift = swift;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cue);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(cue, other.cue);
	}
	@Override
	public String toString() {
		return "Banco [cue=" + cue + ", des=" + des + ", rie=" + rie + ", cta=" + cta + ", dir=" + dir + ", pob=" + pob
				+ ", npro=" + npro + ", pro=" + pro + ", suf=" + suf + ", email=" + email + ", iban=" + iban
				+ ", swift=" + swift + "]";
	}	
}
