package Modelo;

import java.util.Objects;

public class Apunte {
	
	private String num;
	private String fec;
	private String cue;
	private String con;
	private String sig;
	private String mar;
	private String fac;
	private String doc;
	private String xxx;
	private float impeu;
	private String acl;
	private String cen;
	private String ren;
	private float met;
	private String apu_tipdoc;
	private String apu_numdoc;
	private int anno_efe;
	
	public Apunte() {
		this.num="";
		this.cue="";
		this.con="";
		this.sig="";
		this.mar="";
		this.fac="";
		this.doc="";
		this.xxx="";
		this.acl="";
		this.cen="";
		this.ren="";
		this.apu_tipdoc="";
		this.apu_numdoc="";
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getFec() {
		return fec;
	}
	public void setFec(String fec) {
		this.fec = fec;
	}
	public String getCue() {
		return cue;
	}
	public void setCue(String cue) {
		this.cue = cue;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public String getFac() {
		return fac;
	}
	public void setFac(String fac) {
		this.fac = fac;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getXxx() {
		return xxx;
	}
	public void setXxx(String xxx) {
		this.xxx = xxx;
	}
	public float getImpeu() {
		return impeu;
	}
	public void setImpeu(float impeu) {
		this.impeu = impeu;
	}
	public String getAcl() {
		return acl;
	}
	public void setAcl(String acl) {
		this.acl = acl;
	}
	public String getCen() {
		return cen;
	}
	public void setCen(String cen) {
		this.cen = cen;
	}
	public String getRen() {
		return ren;
	}
	public void setRen(String ren) {
		this.ren = ren;
	}
	public float getMet() {
		return met;
	}
	public void setMet(float met) {
		this.met = met;
	}
	public String getApu_tipdoc() {
		return apu_tipdoc;
	}
	public void setApu_tipdoc(String apu_tipdoc) {
		this.apu_tipdoc = apu_tipdoc;
	}
	public String getApu_numdoc() {
		return apu_numdoc;
	}
	public void setApu_numdoc(String apu_numdoc) {
		this.apu_numdoc = apu_numdoc;
	}
	public int getAnno_efe() {
		return anno_efe;
	}
	public void setAnno_efe(int anno_efe) {
		this.anno_efe = anno_efe;
	}
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apunte other = (Apunte) obj;
		return Objects.equals(num, other.num);
	}
	@Override
	public String toString() {
		return "Apunte [num=" + num + ", fec=" + fec + ", cue=" + cue + ", con=" + con + ", sig=" + sig + ", mar=" + mar
				+ ", fac=" + fac + ", doc=" + doc + ", xxx=" + xxx + ", impeu=" + impeu + ", acl=" + acl + ", cen="
				+ cen + ", ren=" + ren + ", met=" + met + ", apu_tipdoc=" + apu_tipdoc + ", apu_numdoc=" + apu_numdoc
				+ ", anno_efe=" + anno_efe + "]";
	}

	
	
}
