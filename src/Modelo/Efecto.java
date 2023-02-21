package Modelo;

import java.util.Objects;

//Previsiones de cobro y de pago
public class Efecto {
	
	private String num;
	private String fec;
	private String cue;
	private String con;
	private String tip;
	private String ban;
	private String vto;
	private String fac;
	private String rem;
	private String fre;
	private String fpa;
	private String dev;
	private String xx1;
	private String xx2;
	private String xx3;
	private float impeu;
	private float pageu;
	private int car;
	private float imprem;
	private String cueapu;
	private float impdev;
	private float impgas;
	private String rie;
	private String rut;
	private String cu1;
	private String cu2;
	private String cu3;
	private String cu4;
	private float serie;
	private String impreso;
	private String efe_tipagr;
	private String efe_docagr;
	private String efe_nefagr;
	private String efe_genagr;
	private String efe_ren;
	private String numefedev;
	private int moneda;
	private float cotiza;
	private float impmon;
	private int diasmax;
	private String fecini;
	
	
	public Efecto() {
		this.num="";
		this.cue="";
		this.con="";
		this.tip="";
		this.ban="";
		this.fac="";
		this.rem="";
		this.dev="";
		this.xx1="";
		this.xx2="";
		this.xx3="";
		this.cueapu="";
		this.rie="";
		this.rut="";
		this.cu1="";
		this.cu2="";
		this.cu3="";
		this.cu4="";
		this.impreso="";
		this.efe_tipagr="";
		this.efe_docagr="";
		this.efe_nefagr="";
		this.efe_genagr="";
		this.efe_ren="";
		this.numefedev="";
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
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	public String getVto() {
		return vto;
	}
	public void setVto(String vto) {
		this.vto = vto;
	}
	public String getFac() {
		return fac;
	}
	public void setFac(String fac) {
		this.fac = fac;
	}
	public String getRem() {
		return rem;
	}
	public void setRem(String rem) {
		this.rem = rem;
	}
	public String getFre() {
		return fre;
	}
	public void setFre(String fre) {
		this.fre = fre;
	}
	public String getFpa() {
		return fpa;
	}
	public void setFpa(String fpa) {
		this.fpa = fpa;
	}
	public String getDev() {
		return dev;
	}
	public void setDev(String dev) {
		this.dev = dev;
	}
	public String getXx1() {
		return xx1;
	}
	public void setXx1(String xx1) {
		this.xx1 = xx1;
	}
	public String getXx2() {
		return xx2;
	}
	public void setXx2(String xx2) {
		this.xx2 = xx2;
	}
	public String getXx3() {
		return xx3;
	}
	public void setXx3(String xx3) {
		this.xx3 = xx3;
	}
	public float getImpeu() {
		return impeu;
	}
	public void setImpeu(float impeu) {
		this.impeu = impeu;
	}
	public float getPageu() {
		return pageu;
	}
	public void setPageu(float pageu) {
		this.pageu = pageu;
	}
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
	public float getImprem() {
		return imprem;
	}
	public void setImprem(float imprem) {
		this.imprem = imprem;
	}
	public String getCueapu() {
		return cueapu;
	}
	public void setCueapu(String cueapu) {
		this.cueapu = cueapu;
	}
	public float getImpdev() {
		return impdev;
	}
	public void setImpdev(float impdev) {
		this.impdev = impdev;
	}
	public float getImpgas() {
		return impgas;
	}
	public void setImpgas(float impgas) {
		this.impgas = impgas;
	}
	public String getRie() {
		return rie;
	}
	public void setRie(String rie) {
		this.rie = rie;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getCu1() {
		return cu1;
	}
	public void setCu1(String cu1) {
		this.cu1 = cu1;
	}
	public String getCu2() {
		return cu2;
	}
	public void setCu2(String cu2) {
		this.cu2 = cu2;
	}
	public String getCu3() {
		return cu3;
	}
	public void setCu3(String cu3) {
		this.cu3 = cu3;
	}
	public String getCu4() {
		return cu4;
	}
	public void setCu4(String cu4) {
		this.cu4 = cu4;
	}
	public float getSerie() {
		return serie;
	}
	public void setSerie(float serie) {
		this.serie = serie;
	}
	public String getImpreso() {
		return impreso;
	}
	public void setImpreso(String impreso) {
		this.impreso = impreso;
	}
	public String getEfe_tipagr() {
		return efe_tipagr;
	}
	public void setEfe_tipagr(String efe_tipagr) {
		this.efe_tipagr = efe_tipagr;
	}
	public String getEfe_docagr() {
		return efe_docagr;
	}
	public void setEfe_docagr(String efe_docagr) {
		this.efe_docagr = efe_docagr;
	}
	public String getEfe_nefagr() {
		return efe_nefagr;
	}
	public void setEfe_nefagr(String efe_nefagr) {
		this.efe_nefagr = efe_nefagr;
	}
	public String getEfe_genagr() {
		return efe_genagr;
	}
	public void setEfe_genagr(String efe_genagr) {
		this.efe_genagr = efe_genagr;
	}
	public String getEfe_ren() {
		return efe_ren;
	}
	public void setEfe_ren(String efe_ren) {
		this.efe_ren = efe_ren;
	}
	public String getNumefedev() {
		return numefedev;
	}
	public void setNumefedev(String numefedev) {
		this.numefedev = numefedev;
	}
	public int getMoneda() {
		return moneda;
	}
	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}
	public float getCotiza() {
		return cotiza;
	}
	public void setCotiza(float cotiza) {
		this.cotiza = cotiza;
	}
	public float getImpmon() {
		return impmon;
	}
	public void setImpmon(float impmon) {
		this.impmon = impmon;
	}
	public int getDiasmax() {
		return diasmax;
	}
	public void setDiasmax(int diasmax) {
		this.diasmax = diasmax;
	}
	public String getFecini() {
		return fecini;
	}
	public void setFecini(String fecini) {
		this.fecini = fecini;
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
		Efecto other = (Efecto) obj;
		return Objects.equals(num, other.num);
	}
	
	@Override
	public String toString() {
		return "Efecto [num=" + num + ", fec=" + fec + ", cue=" + cue + ", con=" + con + ", tip=" + tip + ", ban=" + ban
				+ ", vto=" + vto + ", fac=" + fac + ", rem=" + rem + ", fre=" + fre + ", fpa=" + fpa + ", dev=" + dev
				+ ", xx1=" + xx1 + ", xx2=" + xx2 + ", xx3=" + xx3 + ", impeu=" + impeu + ", pageu=" + pageu + ", car="
				+ car + ", imprem=" + imprem + ", cueapu=" + cueapu + ", impdev=" + impdev + ", impgas=" + impgas
				+ ", rie=" + rie + ", rut=" + rut + ", cu1=" + cu1 + ", cu2=" + cu2 + ", cu3=" + cu3 + ", cu4=" + cu4
				+ ", serie=" + serie + ", impreso=" + impreso + ", efe_tipagr=" + efe_tipagr + ", efe_docagr="
				+ efe_docagr + ", efe_nefagr=" + efe_nefagr + ", efe_genagr=" + efe_genagr + ", efe_ren=" + efe_ren
				+ ", numefedev=" + numefedev + ", moneda=" + moneda + ", cotiza=" + cotiza + ", impmon=" + impmon
				+ ", diasmax=" + diasmax + ", fecini=" + fecini + "]";
	}
	
}
