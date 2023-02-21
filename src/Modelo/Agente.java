package Modelo;

import java.util.Objects;

//Agentes
public class Agente {
	
	private String cod;
	private String nom;
	private String dir;
	private String pob;
	private int npro;
	private String pro;
	private String nif;
	private String te1;
	private String te2;
	private String fax;
	private String mov;
	private String ob1;
	private String ob2;
	private String ob3;
	private String rut;
	private int tip;
	private int com;
	private float co1;
	private float co2;
	private float co3;
	private float co4;
	private float co5;
	private float lim;
	private float pais;
	private int tia;
	private String alt;
	private String fot;
	private String web;
	private String xxx;
	private String rut_crm;
	private float vdi_crm;
	private float ldi_crm;
	private String tcu_crm;
	private String cud_crm;
	private String est_crm;
	private String v01;
	private String v02;
	private String v03;
	private String v04;
	private String v05;
	private String v06;
	private String v07;
	private String v08;
	private String v09;
	private String v10;
	private String v11;
	private String v12;
	private String historia;
	private float lopd_ori;
	private String lopd_otr_o;
	private String lopd_ces;
	private String lopd_otr_c;
	private String age_usu;
	private String age_ver_todo;
	private int com_per;
	private int com_imp;
	private int com_inc;
	private float com_impinc;
	private float com_por;
	private String web_acc;
	private String web_psw;
	private String web_todo;
	private String web_crear;
	private String web_pago;
	private String web_dto;
	private String web_edipre;
	private String web_acccob;
	
	
	public Agente() {
		
		this.cod="";
		this.nom="";
		this.dir="";
		this.pob="";
		this.pro="";
		this.nif="";
		this.te1="";
		this.te2="";
		this.fax="";
		this.mov="";
		this.ob1="";
		this.ob2="";
		this.ob3="";
		this.rut="";
		this.fot="";
		this.web="";
		this.xxx="";
		this.tcu_crm="";
		this.cud_crm="";
		this.est_crm="";
		this.v01="";
		this.v02="";
		this.v03="";
		this.v04="";
		this.v05="";
		this.v06="";
		this.v07="";
		this.v08="";
		this.v09="";
		this.v10="";
		this.v11="";
		this.v12="";
		this.lopd_otr_o="";
		this.lopd_ces="";
		this.lopd_otr_c="";
		this.age_usu="";
		this.age_ver_todo="";
		this.web_acc="";
		this.web_psw="";
		this.web_todo="";
		this.web_crear="";
		this.web_pago="";
		this.web_dto="";
		this.web_edipre="";
		this.web_acccob="";
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
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getTe1() {
		return te1;
	}
	public void setTe1(String te1) {
		this.te1 = te1;
	}
	public String getTe2() {
		return te2;
	}
	public void setTe2(String te2) {
		this.te2 = te2;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMov() {
		return mov;
	}
	public void setMov(String mov) {
		this.mov = mov;
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
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getTip() {
		return tip;
	}
	public void setTip(int tip) {
		this.tip = tip;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
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
	public float getLim() {
		return lim;
	}
	public void setLim(float lim) {
		this.lim = lim;
	}
	public float getPais() {
		return pais;
	}
	public void setPais(float pais) {
		this.pais = pais;
	}
	public int getTia() {
		return tia;
	}
	public void setTia(int tia) {
		this.tia = tia;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getFot() {
		return fot;
	}
	public void setFot(String fot) {
		this.fot = fot;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getXxx() {
		return xxx;
	}
	public void setXxx(String xxx) {
		this.xxx = xxx;
	}
	public String getRut_crm() {
		return rut_crm;
	}
	public void setRut_crm(String rut_crm) {
		this.rut_crm = rut_crm;
	}
	public float getVdi_crm() {
		return vdi_crm;
	}
	public void setVdi_crm(float vdi_crm) {
		this.vdi_crm = vdi_crm;
	}
	public float getLdi_crm() {
		return ldi_crm;
	}
	public void setLdi_crm(float ldi_crm) {
		this.ldi_crm = ldi_crm;
	}
	public String getTcu_crm() {
		return tcu_crm;
	}
	public void setTcu_crm(String tcu_crm) {
		this.tcu_crm = tcu_crm;
	}
	public String getCud_crm() {
		return cud_crm;
	}
	public void setCud_crm(String cud_crm) {
		this.cud_crm = cud_crm;
	}
	public String getEst_crm() {
		return est_crm;
	}
	public void setEst_crm(String est_crm) {
		this.est_crm = est_crm;
	}
	public String getV01() {
		return v01;
	}
	public void setV01(String v01) {
		this.v01 = v01;
	}
	public String getV02() {
		return v02;
	}
	public void setV02(String v02) {
		this.v02 = v02;
	}
	public String getV03() {
		return v03;
	}
	public void setV03(String v03) {
		this.v03 = v03;
	}
	public String getV04() {
		return v04;
	}
	public void setV04(String v04) {
		this.v04 = v04;
	}
	public String getV05() {
		return v05;
	}
	public void setV05(String v05) {
		this.v05 = v05;
	}
	public String getV06() {
		return v06;
	}
	public void setV06(String v06) {
		this.v06 = v06;
	}
	public String getV07() {
		return v07;
	}
	public void setV07(String v07) {
		this.v07 = v07;
	}
	public String getV08() {
		return v08;
	}
	public void setV08(String v08) {
		this.v08 = v08;
	}
	public String getV09() {
		return v09;
	}
	public void setV09(String v09) {
		this.v09 = v09;
	}
	public String getV10() {
		return v10;
	}
	public void setV10(String v10) {
		this.v10 = v10;
	}
	public String getV11() {
		return v11;
	}
	public void setV11(String v11) {
		this.v11 = v11;
	}
	public String getV12() {
		return v12;
	}
	public void setV12(String v12) {
		this.v12 = v12;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
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
	public String getAge_usu() {
		return age_usu;
	}
	public void setAge_usu(String age_usu) {
		this.age_usu = age_usu;
	}
	public String getAge_ver_todo() {
		return age_ver_todo;
	}
	public void setAge_ver_todo(String age_ver_todo) {
		this.age_ver_todo = age_ver_todo;
	}
	public int getCom_per() {
		return com_per;
	}
	public void setCom_per(int com_per) {
		this.com_per = com_per;
	}
	public int getCom_imp() {
		return com_imp;
	}
	public void setCom_imp(int com_imp) {
		this.com_imp = com_imp;
	}
	public int getCom_inc() {
		return com_inc;
	}
	public void setCom_inc(int com_inc) {
		this.com_inc = com_inc;
	}
	public float getCom_impinc() {
		return com_impinc;
	}
	public void setCom_impinc(float com_impinc) {
		this.com_impinc = com_impinc;
	}
	public float getCom_por() {
		return com_por;
	}
	public void setCom_por(float com_por) {
		this.com_por = com_por;
	}
	public String getWeb_acc() {
		return web_acc;
	}
	public void setWeb_acc(String web_acc) {
		this.web_acc = web_acc;
	}
	public String getWeb_psw() {
		return web_psw;
	}
	public void setWeb_psw(String web_psw) {
		this.web_psw = web_psw;
	}
	public String getWeb_todo() {
		return web_todo;
	}
	public void setWeb_todo(String web_todo) {
		this.web_todo = web_todo;
	}
	public String getWeb_crear() {
		return web_crear;
	}
	public void setWeb_crear(String web_crear) {
		this.web_crear = web_crear;
	}
	public String getWeb_pago() {
		return web_pago;
	}
	public void setWeb_pago(String web_pago) {
		this.web_pago = web_pago;
	}
	public String getWeb_dto() {
		return web_dto;
	}
	public void setWeb_dto(String web_dto) {
		this.web_dto = web_dto;
	}
	public String getWeb_edipre() {
		return web_edipre;
	}
	public void setWeb_edipre(String web_edipre) {
		this.web_edipre = web_edipre;
	}
	public String getWeb_acccob() {
		return web_acccob;
	}
	public void setWeb_acccob(String web_acccob) {
		this.web_acccob = web_acccob;
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
		Agente other = (Agente) obj;
		return Objects.equals(cod, other.cod);
	}
	
	@Override
	public String toString() {
		return "Agente [cod=" + cod + ", nom=" + nom + ", dir=" + dir + ", pob=" + pob + ", npro=" + npro + ", pro="
				+ pro + ", nif=" + nif + ", te1=" + te1 + ", te2=" + te2 + ", fax=" + fax + ", mov=" + mov + ", ob1="
				+ ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + ", rut=" + rut + ", tip=" + tip + ", com=" + com + ", co1="
				+ co1 + ", co2=" + co2 + ", co3=" + co3 + ", co4=" + co4 + ", co5=" + co5 + ", lim=" + lim + ", pais="
				+ pais + ", tia=" + tia + ", alt=" + alt + ", fot=" + fot + ", web=" + web + ", xxx=" + xxx
				+ ", rut_crm=" + rut_crm + ", vdi_crm=" + vdi_crm + ", ldi_crm=" + ldi_crm + ", tcu_crm=" + tcu_crm
				+ ", cud_crm=" + cud_crm + ", est_crm=" + est_crm + ", v01=" + v01 + ", v02=" + v02 + ", v03=" + v03
				+ ", v04=" + v04 + ", v05=" + v05 + ", v06=" + v06 + ", v07=" + v07 + ", v08=" + v08 + ", v09=" + v09
				+ ", v10=" + v10 + ", v11=" + v11 + ", v12=" + v12 + ", historia=" + historia + ", lopd_ori=" + lopd_ori
				+ ", lopd_otr_o=" + lopd_otr_o + ", lopd_ces=" + lopd_ces + ", lopd_otr_c=" + lopd_otr_c + ", age_usu="
				+ age_usu + ", age_ver_todo=" + age_ver_todo + ", com_per=" + com_per + ", com_imp=" + com_imp
				+ ", com_inc=" + com_inc + ", com_impinc=" + com_impinc + ", com_por=" + com_por + ", web_acc="
				+ web_acc + ", web_psw=" + web_psw + ", web_todo=" + web_todo + ", web_crear=" + web_crear
				+ ", web_pago=" + web_pago + ", web_dto=" + web_dto + ", web_edipre=" + web_edipre + ", web_acccob="
				+ web_acccob + "]";
	}

	
}
