package Modelo;

import java.util.Objects;

//Direcciones de clientes y proveedores
public class Direccion {
	private String cla;
	private String cod;
	private String den;
	private String dir;
	private String pob;
	private int npro;
	private String pro;
	private float pais;
	private String email;
	private String rut;
	private String tel;
	private String hab;
	private String per;
	
	
	
	public Direccion() {
		this.cla="";
		this.cod="";
		this.den="";
		this.dir="";
		this.pob="";
		this.pro="";
		this.email="";
		this.rut="";
		this.tel="";
		this.hab="";
		this.per="";

	}
	
	
	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getDen() {
		return den;
	}
	public void setDen(String den) {
		this.den = den;
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
	public float getPais() {
		return pais;
	}
	public void setPais(float pais) {
		this.pais = pais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHab() {
		return hab;
	}
	public void setHab(String hab) {
		this.hab = hab;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cla, cod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(cla, other.cla) && Objects.equals(cod, other.cod);
	}
	@Override
	public String toString() {
		return "Direccion [cla=" + cla + ", cod=" + cod + ", den=" + den + ", dir=" + dir + ", pob=" + pob + ", npro="
				+ npro + ", pro=" + pro + ", pais=" + pais + ", email=" + email + ", rut=" + rut + ", tel=" + tel
				+ ", hab=" + hab + ", per=" + per + "]";
	}
	
	

}
