package Modelo;

import java.util.Objects;

public class FormasPago {
	private int id;
	private String nom;
	private int di1;
	private int di2;
	private int dir;
	private int npa;
	private String mes;
	private int vto;
	private float inc;
	private float cad;
	private String cob;
	private int car;
	private float porcobdir;
	private String inclib;
	private String reppro;
	private String cuecobdir;
	
	
	
	public FormasPago() {
		this.nom="";
		this.mes="";
		this.cob="";
		this.inclib="";
		this.reppro="";
		this.cuecobdir="";

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDi1() {
		return di1;
	}
	public void setDi1(int di1) {
		this.di1 = di1;
	}
	public int getDi2() {
		return di2;
	}
	public void setDi2(int di2) {
		this.di2 = di2;
	}
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	public int getNpa() {
		return npa;
	}
	public void setNpa(int npa) {
		this.npa = npa;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getVto() {
		return vto;
	}
	public void setVto(int vto) {
		this.vto = vto;
	}
	public float getInc() {
		return inc;
	}
	public void setInc(float inc) {
		this.inc = inc;
	}
	public float getCad() {
		return cad;
	}
	public void setCad(float cad) {
		this.cad = cad;
	}
	public String getCob() {
		return cob;
	}
	public void setCob(String cob) {
		this.cob = cob;
	}
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
	public float getPorcobdir() {
		return porcobdir;
	}
	public void setPorcobdir(float porcobdir) {
		this.porcobdir = porcobdir;
	}
	public String getInclib() {
		return inclib;
	}
	public void setInclib(String inclib) {
		this.inclib = inclib;
	}
	public String getReppro() {
		return reppro;
	}
	public void setReppro(String reppro) {
		this.reppro = reppro;
	}
	public String getCuecobdir() {
		return cuecobdir;
	}
	public void setCuecobdir(String cuecobdir) {
		this.cuecobdir = cuecobdir;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormasPago other = (FormasPago) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "FormasPago [id=" + id + ", nom=" + nom + ", di1=" + di1 + ", di2=" + di2 + ", dir=" + dir + ", npa="
				+ npa + ", mes=" + mes + ", vto=" + vto + ", inc=" + inc + ", cad=" + cad + ", cob=" + cob + ", car="
				+ car + ", porcobdir=" + porcobdir + ", inclib=" + inclib + ", reppro=" + reppro + ", cuecobdir="
				+ cuecobdir + "]";
	}
	
	
	
	
}
