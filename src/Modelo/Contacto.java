package Modelo;

import java.util.Objects;

//Contactos de clientes y proveedores
public class Contacto {
	
	private String cla;
	private String cod;
	private String nom;
	private String car;
	private String tel;
	private String ext;
	private String ob1;
	private String ob2;
	private String ob3;
	private String email;
	private String codcon;
	private float lopd_ori;
	private String lopd_otr_o;
	private String lopd_ces;
	private String lopd_otr_c;
	
	public Contacto() {
		this.cla="";
		this.cod="";
		this.nom="";
		this.car="";
		this.tel="";
		this.ext="";
		this.ob1="";
		this.ob2="";
		this.ob3="";
		this.email="";
		this.codcon="";
		this.lopd_otr_o="";
		this.lopd_ces="";
		this.lopd_otr_c="";

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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getOb1() {
		return ob1;
	}
	public void setOb1(String ob1) {
		this.ob1 = ob1;
	}
	public String getOb2() {
		return ob2;
	}
	public void setOb2(String ob2) {
		this.ob2 = ob2;
	}
	public String getOb3() {
		return ob3;
	}
	public void setOb3(String ob3) {
		this.ob3 = ob3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodcon() {
		return codcon;
	}
	public void setCodcon(String codcon) {
		this.codcon = codcon;
	}
	public float getLopd_ori() {
		return lopd_ori;
	}
	public void setLopd_ori(float lopd_ori) {
		this.lopd_ori = lopd_ori;
	}
	public String getLopd_otr_o() {
		return lopd_otr_o;
	}
	public void setLopd_otr_o(String lopd_otr_o) {
		this.lopd_otr_o = lopd_otr_o;
	}
	public String getLopd_ces() {
		return lopd_ces;
	}
	public void setLopd_ces(String lopd_ces) {
		this.lopd_ces = lopd_ces;
	}
	public String getLopd_otr_c() {
		return lopd_otr_c;
	}
	public void setLopd_otr_c(String lopd_otr_c) {
		this.lopd_otr_c = lopd_otr_c;
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
		Contacto other = (Contacto) obj;
		return Objects.equals(cla, other.cla) && Objects.equals(cod, other.cod);
	}
	@Override
	public String toString() {
		return "Contacto [cla=" + cla + ", cod=" + cod + ", nom=" + nom + ", car=" + car + ", tel=" + tel + ", ext="
				+ ext + ", ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + ", email=" + email + ", codcon=" + codcon
				+ ", lopd_ori=" + lopd_ori + ", lopd_otr_o=" + lopd_otr_o + ", lopd_ces=" + lopd_ces + ", lopd_otr_c="
				+ lopd_otr_c + "]";
	}	
}
