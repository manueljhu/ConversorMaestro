package Modelo;

import java.util.Objects;

// Datos bancarios de cliente y proveedores
public class DataBan {
	private String cla;
	private String cod;
	private String dir;
	private String pob;
	private int npro;
	private String pro;
	private float pais;
	private String iban;
	private String bic;
	private String cu1;
	private String cu2;
	private String cu3;
	private String cu4;
	private String hab;
	private String bban;
	private String trem;
	private String epri;
	private String nman;
	private String fman;
	
	public DataBan() {
		 this.cla="";
		 this.cod="";
		 this.dir="";
		 this.pob="";
		 this.pro="";
		 this.iban="";
		 this.bic="";
		 this.cu1="";
		 this.cu2="";
		 this.cu3="";
		 this.cu4="";
		 this.hab="";
		 this.bban="";
		 this.trem="";
		 this.epri="";
		 this.nman="";
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
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
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
	public String getHab() {
		return hab;
	}
	public void setHab(String hab) {
		this.hab = hab;
	}
	public String getBban() {
		return bban;
	}
	public void setBban(String bban) {
		this.bban = bban;
	}
	public String getTrem() {
		return trem;
	}
	public void setTrem(String trem) {
		this.trem = trem;
	}
	public String getEpri() {
		return epri;
	}
	public void setEpri(String epri) {
		this.epri = epri;
	}
	public String getNman() {
		return nman;
	}
	public void setNman(String nman) {
		this.nman = nman;
	}
	public String getFman() {
		return fman;
	}
	public void setFman(String fman) {
		this.fman = fman;
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
		DataBan other = (DataBan) obj;
		return Objects.equals(cla, other.cla) && Objects.equals(cod, other.cod);
	}
	@Override
	public String toString() {
		return "Banco [cla=" + cla + ", cod=" + cod + ", dir=" + dir + ", pob=" + pob + ", npro=" + npro + ", pro="
				+ pro + ", pais=" + pais + ", iban=" + iban + ", bic=" + bic + ", cu1=" + cu1 + ", cu2=" + cu2
				+ ", cu3=" + cu3 + ", cu4=" + cu4 + ", hab=" + hab + ", bban=" + bban + ", trem=" + trem + ", epri="
				+ epri + ", nman=" + nman + ", fman=" + fman + "]";
	}
}
