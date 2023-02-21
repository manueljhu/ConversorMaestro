package Modelo;

import java.util.Objects;

public class Familia {

	private String cod;
	private String nom;
	private String cuc;
	private String cuv;
	private float co1;
	private float co2;
	private float co3;
	private float co4;
	private float co5;
	private String dtocom1;
	private String dtocom2;
	private String dtoven1;
	private String dtoven2;
	private float dt1;
	private float dt2;
	private float dt3;
	private float dt4;
	private float dt5;
	private float d01;
	private float d02;
	private float d03;
	private float d04;
	private float d05;
	private float ma1;
	private float ma2;
	private float ma3;
	private float ma4;
	private float ma5;
	private String ima;
	private String fot;
	private String abr;
	private String pos;
	private String ctadevcom;
	private String ctadevven;
	private String ctadtocom;
	private String ctadtoven;
	private String historia;
	private int tipima;
	
	public Familia() {
		this.cod="";
		this.nom="";
		this.cuc="";
		this.cuv="";
		this.dtocom1="";
		this.dtocom2="";
		this.dtoven1="";
		this.dtoven2="";
		this.ima="";
		this.fot="";
		this.abr="";
		this.pos="";
		this.ctadevcom="";
		this.ctadevven="";
		this.ctadtocom="";
		this.ctadtoven="";
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
	public String getCuc() {
		return cuc;
	}
	public void setCuc(String cuc) {
		this.cuc = cuc;
	}
	public String getCuv() {
		return cuv;
	}
	public void setCuv(String cuv) {
		this.cuv = cuv;
	}
	public float getCo1() {
		return co1;
	}
	public void setCo1(float co1) {
		this.co1 = co1;
	}
	public float getCo2() {
		return co2;
	}
	public void setCo2(float co2) {
		this.co2 = co2;
	}
	public float getCo3() {
		return co3;
	}
	public void setCo3(float co3) {
		this.co3 = co3;
	}
	public float getCo4() {
		return co4;
	}
	public void setCo4(float co4) {
		this.co4 = co4;
	}
	public float getCo5() {
		return co5;
	}
	public void setCo5(float co5) {
		this.co5 = co5;
	}
	public String getDtocom1() {
		return dtocom1;
	}
	public void setDtocom1(String dtocom1) {
		this.dtocom1 = dtocom1;
	}
	public String getDtocom2() {
		return dtocom2;
	}
	public void setDtocom2(String dtocom2) {
		this.dtocom2 = dtocom2;
	}
	public String getDtoven1() {
		return dtoven1;
	}
	public void setDtoven1(String dtoven1) {
		this.dtoven1 = dtoven1;
	}
	public String getDtoven2() {
		return dtoven2;
	}
	public void setDtoven2(String dtoven2) {
		this.dtoven2 = dtoven2;
	}
	public float getDt1() {
		return dt1;
	}
	public void setDt1(float dt1) {
		this.dt1 = dt1;
	}
	public float getDt2() {
		return dt2;
	}
	public void setDt2(float dt2) {
		this.dt2 = dt2;
	}
	public float getDt3() {
		return dt3;
	}
	public void setDt3(float dt3) {
		this.dt3 = dt3;
	}
	public float getDt4() {
		return dt4;
	}
	public void setDt4(float dt4) {
		this.dt4 = dt4;
	}
	public float getDt5() {
		return dt5;
	}
	public void setDt5(float dt5) {
		this.dt5 = dt5;
	}
	public float getD01() {
		return d01;
	}
	public void setD01(float d01) {
		this.d01 = d01;
	}
	public float getD02() {
		return d02;
	}
	public void setD02(float d02) {
		this.d02 = d02;
	}
	public float getD03() {
		return d03;
	}
	public void setD03(float d03) {
		this.d03 = d03;
	}
	public float getD04() {
		return d04;
	}
	public void setD04(float d04) {
		this.d04 = d04;
	}
	public float getD05() {
		return d05;
	}
	public void setD05(float d05) {
		this.d05 = d05;
	}
	public float getMa1() {
		return ma1;
	}
	public void setMa1(float ma1) {
		this.ma1 = ma1;
	}
	public float getMa2() {
		return ma2;
	}
	public void setMa2(float ma2) {
		this.ma2 = ma2;
	}
	public float getMa3() {
		return ma3;
	}
	public void setMa3(float ma3) {
		this.ma3 = ma3;
	}
	public float getMa4() {
		return ma4;
	}
	public void setMa4(float ma4) {
		this.ma4 = ma4;
	}
	public float getMa5() {
		return ma5;
	}
	public void setMa5(float ma5) {
		this.ma5 = ma5;
	}
	public String getIma() {
		return ima;
	}
	public void setIma(String ima) {
		this.ima = ima;
	}
	public String getFot() {
		return fot;
	}
	public void setFot(String fot) {
		this.fot = fot;
	}
	public String getAbr() {
		return abr;
	}
	public void setAbr(String abr) {
		this.abr = abr;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getCtadevcom() {
		return ctadevcom;
	}
	public void setCtadevcom(String ctadevcom) {
		this.ctadevcom = ctadevcom;
	}
	public String getCtadevven() {
		return ctadevven;
	}
	public void setCtadevven(String ctadevven) {
		this.ctadevven = ctadevven;
	}
	public String getCtadtocom() {
		return ctadtocom;
	}
	public void setCtadtocom(String ctadtocom) {
		this.ctadtocom = ctadtocom;
	}
	public String getCtadtoven() {
		return ctadtoven;
	}
	public void setCtadtoven(String ctadtoven) {
		this.ctadtoven = ctadtoven;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public int getTipima() {
		return tipima;
	}
	public void setTipima(int tipima) {
		this.tipima = tipima;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Familia other = (Familia) obj;
		return Objects.equals(cod, other.cod);
	}
	
	@Override
	public String toString() {
		return "Familia [cod=" + cod + ", nom=" + nom + ", cuc=" + cuc + ", cuv=" + cuv + ", co1=" + co1 + ", co2="
				+ co2 + ", co3=" + co3 + ", co4=" + co4 + ", co5=" + co5 + ", dtocom1=" + dtocom1 + ", dtocom2="
				+ dtocom2 + ", dtoven1=" + dtoven1 + ", dtoven2=" + dtoven2 + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3="
				+ dt3 + ", dt4=" + dt4 + ", dt5=" + dt5 + ", d01=" + d01 + ", d02=" + d02 + ", d03=" + d03 + ", d04="
				+ d04 + ", d05=" + d05 + ", ma1=" + ma1 + ", ma2=" + ma2 + ", ma3=" + ma3 + ", ma4=" + ma4 + ", ma5="
				+ ma5 + ", ima=" + ima + ", fot=" + fot + ", abr=" + abr + ", pos=" + pos + ", ctadevcom=" + ctadevcom
				+ ", ctadevven=" + ctadevven + ", ctadtocom=" + ctadtocom + ", ctadtoven=" + ctadtoven + ", historia="
				+ historia + ", tipima=" + tipima + "]";
	}
	
}
