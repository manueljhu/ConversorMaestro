package Modelo;

import java.util.Objects;

//XX sera sustituido por los dos ultimos digitos del año en curso para los asientos
public class AlmacenXX {

	private String cod;
	private float exi;
	private float ent;
	private float sal;
	private String ubi;
	private float ide;
	private float min;
	private float max;
	
		
	public AlmacenXX() {
		this.cod="";
		this.ubi="";
	}
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public float getExi() {
		return exi;
	}
	public void setExi(float exi) {
		this.exi = exi;
	}
	public float getEnt() {
		return ent;
	}
	public void setEnt(float ent) {
		this.ent = ent;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getUbi() {
		return ubi;
	}
	public void setUbi(String ubi) {
		this.ubi = ubi;
	}
	public float getIde() {
		return ide;
	}
	public void setIde(float ide) {
		this.ide = ide;
	}
	public float getMin() {
		return min;
	}
	public void setMin(float min) {
		this.min = min;
	}
	public float getMax() {
		return max;
	}
	public void setMax(float max) {
		this.max = max;
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
		AlmacenXX other = (AlmacenXX) obj;
		return Objects.equals(cod, other.cod);
	}

	@Override
	public String toString() {
		return "AlmacenXX [cod=" + cod + ", exi=" + exi + ", ent=" + ent + ", sal=" + sal + ", ubi=" + ubi + ", ide="
				+ ide + ", min=" + min + ", max=" + max + "]";
	}
	
}
