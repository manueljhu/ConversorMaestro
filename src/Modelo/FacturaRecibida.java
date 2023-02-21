package Modelo;

import java.util.Objects;

public class FacturaRecibida {
	private String num;
	private String fea;
	private String doc;
	private String nuf;
	private String fee;
	private String gas;
	private String cue;
	private String li1;
	private String li2;
	private float dt1;
	private float dt2;
	private String fuc;
	private String forpag;
	private float fin;
	private String alm;
	private String com;
	private String nom;
	private String nif;
	private String tra;
	private float ba1eu;
	private float iv1eu;
	private float re1eu;
	private float ba2eu;
	private float iv2eu;
	private float re2eu;
	private float ba3eu;
	private float iv3eu;
	private float re3eu;
	private float ba4eu;
	private float iv4eu;
	private float re4eu;
	private float ba5eu;
	private float iv5eu;
	private float re5eu;
	private float exeeu;
	private float ulceu;
	private float toceu;
	private float enteu;
	private float imceu;
	private float imreu;
	private int tre;
	private float pre;
	private float ireeu;
	private String ivainc;
	private float entped;
	private String tip;
	private String aut;
	private int negativa;
	private String fecope;
	private String mod303;
	private String mod303a;
	private String mod303b;
	private String mod303c;
	private String mod347;
	private int usuario_bloqueo;
	private String rec_deb_pag;
	private String rec_incluir;
	private String rec_antes_dto;
	private String rec_iva_inc;
	private int moneda;
	private float cotiza;
	private float basmon;
	private float totmon;
	private float entmon;
	private String obs_doc;
	private String recargo;
	private int diasmax;
	private String fecini;
	private float suplidos;
	private float iva1;
	private float iva2;
	private float iva3;
	private float iva4;
	private float iva5;
	private float rec1;
	private float rec2;
	private float rec3;
	private float rec4;
	private float rec5;
	private String tipivaok;
	private String exento;
	private String cri_caja;
	private String ded_cie;
	private String siiest;
	private String siiact;
	private String siitipfra;
	private String siifrarec;
	private String siitiprec;
	private String siidesfra;
	private String siinifemi;
	private float siicuoded;
	private String siifecper;
	private String siidatrec;
	private String siidatagr;
	private float siibasrec;
	private float siicuorec;
	private float siirecrec;
	private float siibascos;
	private String siiiss;
	private String siidatdes;
	private String siifrarec1;
	private String siifrarec2;
	private String siinumacu;
	private String siinumresf;
	private String siidesman;
	private String patron;
	private String siirefext;
	private String siinomensu;
	private String siinifensu;
	private String siifraiden;
	private String siimacro;
	private String siiregprev;
	private String aeattipfac;
	private String aeattipgas;
	private float aeatimpcon;
	
	
	public FacturaRecibida() {
		this.num="";
		this.doc="";
		this.nuf="";
		this.gas="";
		this.cue="";
		this.li1="";
		this.li2="";
		this.forpag="";
		this.alm="";
		this.com="";
		this.nom="";
		this.nif="";
		this.tra="";
		this.ivainc="";
		this.tip="";
		this.aut="";
		this.mod303="";
		this.mod303a="";
		this.mod303b="";
		this.mod303c="";
		this.mod347="";
		this.rec_deb_pag="";
		this.rec_incluir="";
		this.rec_antes_dto="";
		this.rec_iva_inc="";
		this.recargo="";
		this.tipivaok="";
		this.exento="";
		this.cri_caja="";
		this.ded_cie="";
		this.siiest="";
		this.siiact="";
		this.siitipfra="";
		this.siifrarec="";
		this.siitiprec="";
		this.siidesfra="";
		this.siinifemi="";
		this.siifrarec1="";
		this.siifrarec2="";
		this.siinumacu="";
		this.siinumresf="";
		this.patron="";
		this.siirefext="";
		this.siinomensu="";
		this.siinifensu="";
		this.siifraiden="";
		this.siimacro="";
		this.siiregprev="";
		this.aeattipfac="";
		this.aeattipgas="";

	}
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getFea() {
		return fea;
	}
	public void setFea(String fea) {
		this.fea = fea;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getNuf() {
		return nuf;
	}
	public void setNuf(String nuf) {
		this.nuf = nuf;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	public String getCue() {
		return cue;
	}
	public void setCue(String cue) {
		this.cue = cue;
	}
	public String getLi1() {
		return li1;
	}
	public void setLi1(String li1) {
		this.li1 = li1;
	}
	public String getLi2() {
		return li2;
	}
	public void setLi2(String li2) {
		this.li2 = li2;
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
	public String getFuc() {
		return fuc;
	}
	public void setFuc(String fuc) {
		this.fuc = fuc;
	}
	public String getForpag() {
		return forpag;
	}
	public void setForpag(String forpag) {
		this.forpag = forpag;
	}
	public float getFin() {
		return fin;
	}
	public void setFin(float fin) {
		this.fin = fin;
	}
	public String getAlm() {
		return alm;
	}
	public void setAlm(String alm) {
		this.alm = alm;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getTra() {
		return tra;
	}
	public void setTra(String tra) {
		this.tra = tra;
	}
	public float getBa1eu() {
		return ba1eu;
	}
	public void setBa1eu(float ba1eu) {
		this.ba1eu = ba1eu;
	}
	public float getIv1eu() {
		return iv1eu;
	}
	public void setIv1eu(float iv1eu) {
		this.iv1eu = iv1eu;
	}
	public float getRe1eu() {
		return re1eu;
	}
	public void setRe1eu(float re1eu) {
		this.re1eu = re1eu;
	}
	public float getBa2eu() {
		return ba2eu;
	}
	public void setBa2eu(float ba2eu) {
		this.ba2eu = ba2eu;
	}
	public float getIv2eu() {
		return iv2eu;
	}
	public void setIv2eu(float iv2eu) {
		this.iv2eu = iv2eu;
	}
	public float getRe2eu() {
		return re2eu;
	}
	public void setRe2eu(float re2eu) {
		this.re2eu = re2eu;
	}
	public float getBa3eu() {
		return ba3eu;
	}
	public void setBa3eu(float ba3eu) {
		this.ba3eu = ba3eu;
	}
	public float getIv3eu() {
		return iv3eu;
	}
	public void setIv3eu(float iv3eu) {
		this.iv3eu = iv3eu;
	}
	public float getRe3eu() {
		return re3eu;
	}
	public void setRe3eu(float re3eu) {
		this.re3eu = re3eu;
	}
	public float getBa4eu() {
		return ba4eu;
	}
	public void setBa4eu(float ba4eu) {
		this.ba4eu = ba4eu;
	}
	public float getIv4eu() {
		return iv4eu;
	}
	public void setIv4eu(float iv4eu) {
		this.iv4eu = iv4eu;
	}
	public float getRe4eu() {
		return re4eu;
	}
	public void setRe4eu(float re4eu) {
		this.re4eu = re4eu;
	}
	public float getBa5eu() {
		return ba5eu;
	}
	public void setBa5eu(float ba5eu) {
		this.ba5eu = ba5eu;
	}
	public float getIv5eu() {
		return iv5eu;
	}
	public void setIv5eu(float iv5eu) {
		this.iv5eu = iv5eu;
	}
	public float getRe5eu() {
		return re5eu;
	}
	public void setRe5eu(float re5eu) {
		this.re5eu = re5eu;
	}
	public float getExeeu() {
		return exeeu;
	}
	public void setExeeu(float exeeu) {
		this.exeeu = exeeu;
	}
	public float getUlceu() {
		return ulceu;
	}
	public void setUlceu(float ulceu) {
		this.ulceu = ulceu;
	}
	public float getToceu() {
		return toceu;
	}
	public void setToceu(float toceu) {
		this.toceu = toceu;
	}
	public float getEnteu() {
		return enteu;
	}
	public void setEnteu(float enteu) {
		this.enteu = enteu;
	}
	public float getImceu() {
		return imceu;
	}
	public void setImceu(float imceu) {
		this.imceu = imceu;
	}
	public float getImreu() {
		return imreu;
	}
	public void setImreu(float imreu) {
		this.imreu = imreu;
	}
	public int getTre() {
		return tre;
	}
	public void setTre(int tre) {
		this.tre = tre;
	}
	public float getPre() {
		return pre;
	}
	public void setPre(float pre) {
		this.pre = pre;
	}
	public float getIreeu() {
		return ireeu;
	}
	public void setIreeu(float ireeu) {
		this.ireeu = ireeu;
	}
	public String getIvainc() {
		return ivainc;
	}
	public void setIvainc(String ivainc) {
		this.ivainc = ivainc;
	}
	public float getEntped() {
		return entped;
	}
	public void setEntped(float entped) {
		this.entped = entped;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getAut() {
		return aut;
	}
	public void setAut(String aut) {
		this.aut = aut;
	}
	public int getNegativa() {
		return negativa;
	}
	public void setNegativa(int negativa) {
		this.negativa = negativa;
	}
	public String getFecope() {
		return fecope;
	}
	public void setFecope(String fecope) {
		this.fecope = fecope;
	}
	public String getMod303() {
		return mod303;
	}
	public void setMod303(String mod303) {
		this.mod303 = mod303;
	}
	public String getMod303a() {
		return mod303a;
	}
	public void setMod303a(String mod303a) {
		this.mod303a = mod303a;
	}
	public String getMod303b() {
		return mod303b;
	}
	public void setMod303b(String mod303b) {
		this.mod303b = mod303b;
	}
	public String getMod303c() {
		return mod303c;
	}
	public void setMod303c(String mod303c) {
		this.mod303c = mod303c;
	}
	public String getMod347() {
		return mod347;
	}
	public void setMod347(String mod347) {
		this.mod347 = mod347;
	}
	public int getUsuario_bloqueo() {
		return usuario_bloqueo;
	}
	public void setUsuario_bloqueo(int usuario_bloqueo) {
		this.usuario_bloqueo = usuario_bloqueo;
	}
	public String getRec_deb_pag() {
		return rec_deb_pag;
	}
	public void setRec_deb_pag(String rec_deb_pag) {
		this.rec_deb_pag = rec_deb_pag;
	}
	public String getRec_incluir() {
		return rec_incluir;
	}
	public void setRec_incluir(String rec_incluir) {
		this.rec_incluir = rec_incluir;
	}
	public String getRec_antes_dto() {
		return rec_antes_dto;
	}
	public void setRec_antes_dto(String rec_antes_dto) {
		this.rec_antes_dto = rec_antes_dto;
	}
	public String getRec_iva_inc() {
		return rec_iva_inc;
	}
	public void setRec_iva_inc(String rec_iva_inc) {
		this.rec_iva_inc = rec_iva_inc;
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
	public float getBasmon() {
		return basmon;
	}
	public void setBasmon(float basmon) {
		this.basmon = basmon;
	}
	public float getTotmon() {
		return totmon;
	}
	public void setTotmon(float totmon) {
		this.totmon = totmon;
	}
	public float getEntmon() {
		return entmon;
	}
	public void setEntmon(float entmon) {
		this.entmon = entmon;
	}
	public String getObs_doc() {
		return obs_doc;
	}
	public void setObs_doc(String obs_doc) {
		this.obs_doc = obs_doc;
	}
	public String getRecargo() {
		return recargo;
	}
	public void setRecargo(String recargo) {
		this.recargo = recargo;
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
	public float getSuplidos() {
		return suplidos;
	}
	public void setSuplidos(float suplidos) {
		this.suplidos = suplidos;
	}
	public float getIva1() {
		return iva1;
	}
	public void setIva1(float iva1) {
		this.iva1 = iva1;
	}
	public float getIva2() {
		return iva2;
	}
	public void setIva2(float iva2) {
		this.iva2 = iva2;
	}
	public float getIva3() {
		return iva3;
	}
	public void setIva3(float iva3) {
		this.iva3 = iva3;
	}
	public float getIva4() {
		return iva4;
	}
	public void setIva4(float iva4) {
		this.iva4 = iva4;
	}
	public float getIva5() {
		return iva5;
	}
	public void setIva5(float iva5) {
		this.iva5 = iva5;
	}
	public float getRec1() {
		return rec1;
	}
	public void setRec1(float rec1) {
		this.rec1 = rec1;
	}
	public float getRec2() {
		return rec2;
	}
	public void setRec2(float rec2) {
		this.rec2 = rec2;
	}
	public float getRec3() {
		return rec3;
	}
	public void setRec3(float rec3) {
		this.rec3 = rec3;
	}
	public float getRec4() {
		return rec4;
	}
	public void setRec4(float rec4) {
		this.rec4 = rec4;
	}
	public float getRec5() {
		return rec5;
	}
	public void setRec5(float rec5) {
		this.rec5 = rec5;
	}
	public String getTipivaok() {
		return tipivaok;
	}
	public void setTipivaok(String tipivaok) {
		this.tipivaok = tipivaok;
	}
	public String getExento() {
		return exento;
	}
	public void setExento(String exento) {
		this.exento = exento;
	}
	public String getCri_caja() {
		return cri_caja;
	}
	public void setCri_caja(String cri_caja) {
		this.cri_caja = cri_caja;
	}
	public String getDed_cie() {
		return ded_cie;
	}
	public void setDed_cie(String ded_cie) {
		this.ded_cie = ded_cie;
	}
	public String getSiiest() {
		return siiest;
	}
	public void setSiiest(String siiest) {
		this.siiest = siiest;
	}
	public String getSiiact() {
		return siiact;
	}
	public void setSiiact(String siiact) {
		this.siiact = siiact;
	}
	public String getSiitipfra() {
		return siitipfra;
	}
	public void setSiitipfra(String siitipfra) {
		this.siitipfra = siitipfra;
	}
	public String getSiifrarec() {
		return siifrarec;
	}
	public void setSiifrarec(String siifrarec) {
		this.siifrarec = siifrarec;
	}
	public String getSiitiprec() {
		return siitiprec;
	}
	public void setSiitiprec(String siitiprec) {
		this.siitiprec = siitiprec;
	}
	public String getSiidesfra() {
		return siidesfra;
	}
	public void setSiidesfra(String siidesfra) {
		this.siidesfra = siidesfra;
	}
	public String getSiinifemi() {
		return siinifemi;
	}
	public void setSiinifemi(String siinifemi) {
		this.siinifemi = siinifemi;
	}
	public float getSiicuoded() {
		return siicuoded;
	}
	public void setSiicuoded(float siicuoded) {
		this.siicuoded = siicuoded;
	}
	public String getSiifecper() {
		return siifecper;
	}
	public void setSiifecper(String siifecper) {
		this.siifecper = siifecper;
	}
	public String getSiidatrec() {
		return siidatrec;
	}
	public void setSiidatrec(String siidatrec) {
		this.siidatrec = siidatrec;
	}
	public String getSiidatagr() {
		return siidatagr;
	}
	public void setSiidatagr(String siidatagr) {
		this.siidatagr = siidatagr;
	}
	public float getSiibasrec() {
		return siibasrec;
	}
	public void setSiibasrec(float siibasrec) {
		this.siibasrec = siibasrec;
	}
	public float getSiicuorec() {
		return siicuorec;
	}
	public void setSiicuorec(float siicuorec) {
		this.siicuorec = siicuorec;
	}
	public float getSiirecrec() {
		return siirecrec;
	}
	public void setSiirecrec(float siirecrec) {
		this.siirecrec = siirecrec;
	}
	public float getSiibascos() {
		return siibascos;
	}
	public void setSiibascos(float siibascos) {
		this.siibascos = siibascos;
	}
	public String getSiiiss() {
		return siiiss;
	}
	public void setSiiiss(String siiiss) {
		this.siiiss = siiiss;
	}
	public String getSiidatdes() {
		return siidatdes;
	}
	public void setSiidatdes(String siidatdes) {
		this.siidatdes = siidatdes;
	}
	public String getSiifrarec1() {
		return siifrarec1;
	}
	public void setSiifrarec1(String siifrarec1) {
		this.siifrarec1 = siifrarec1;
	}
	public String getSiifrarec2() {
		return siifrarec2;
	}
	public void setSiifrarec2(String siifrarec2) {
		this.siifrarec2 = siifrarec2;
	}
	public String getSiinumacu() {
		return siinumacu;
	}
	public void setSiinumacu(String siinumacu) {
		this.siinumacu = siinumacu;
	}
	public String getSiinumresf() {
		return siinumresf;
	}
	public void setSiinumresf(String siinumresf) {
		this.siinumresf = siinumresf;
	}
	public String getSiidesman() {
		return siidesman;
	}
	public void setSiidesman(String siidesman) {
		this.siidesman = siidesman;
	}
	public String getPatron() {
		return patron;
	}
	public void setPatron(String patron) {
		this.patron = patron;
	}
	public String getSiirefext() {
		return siirefext;
	}
	public void setSiirefext(String siirefext) {
		this.siirefext = siirefext;
	}
	public String getSiinomensu() {
		return siinomensu;
	}
	public void setSiinomensu(String siinomensu) {
		this.siinomensu = siinomensu;
	}
	public String getSiinifensu() {
		return siinifensu;
	}
	public void setSiinifensu(String siinifensu) {
		this.siinifensu = siinifensu;
	}
	public String getSiifraiden() {
		return siifraiden;
	}
	public void setSiifraiden(String siifraiden) {
		this.siifraiden = siifraiden;
	}
	public String getSiimacro() {
		return siimacro;
	}
	public void setSiimacro(String siimacro) {
		this.siimacro = siimacro;
	}
	public String getSiiregprev() {
		return siiregprev;
	}
	public void setSiiregprev(String siiregprev) {
		this.siiregprev = siiregprev;
	}
	public String getAeattipfac() {
		return aeattipfac;
	}
	public void setAeattipfac(String aeattipfac) {
		this.aeattipfac = aeattipfac;
	}
	public String getAeattipgas() {
		return aeattipgas;
	}
	public void setAeattipgas(String aeattipgas) {
		this.aeattipgas = aeattipgas;
	}
	public float getAeatimpcon() {
		return aeatimpcon;
	}
	public void setAeatimpcon(float aeatimpcon) {
		this.aeatimpcon = aeatimpcon;
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
		FacturaRecibida other = (FacturaRecibida) obj;
		return Objects.equals(num, other.num);
	}
	@Override
	public String toString() {
		return "FacturaRecibida [num=" + num + ", fea=" + fea + ", doc=" + doc + ", nuf=" + nuf + ", fee=" + fee
				+ ", gas=" + gas + ", cue=" + cue + ", li1=" + li1 + ", li2=" + li2 + ", dt1=" + dt1 + ", dt2=" + dt2
				+ ", fuc=" + fuc + ", forpag=" + forpag + ", fin=" + fin + ", alm=" + alm + ", com=" + com + ", nom="
				+ nom + ", nif=" + nif + ", tra=" + tra + ", ba1eu=" + ba1eu + ", iv1eu=" + iv1eu + ", re1eu=" + re1eu
				+ ", ba2eu=" + ba2eu + ", iv2eu=" + iv2eu + ", re2eu=" + re2eu + ", ba3eu=" + ba3eu + ", iv3eu=" + iv3eu
				+ ", re3eu=" + re3eu + ", ba4eu=" + ba4eu + ", iv4eu=" + iv4eu + ", re4eu=" + re4eu + ", ba5eu=" + ba5eu
				+ ", iv5eu=" + iv5eu + ", re5eu=" + re5eu + ", exeeu=" + exeeu + ", ulceu=" + ulceu + ", toceu=" + toceu
				+ ", enteu=" + enteu + ", imceu=" + imceu + ", imreu=" + imreu + ", tre=" + tre + ", pre=" + pre
				+ ", ireeu=" + ireeu + ", ivainc=" + ivainc + ", entped=" + entped + ", tip=" + tip + ", aut=" + aut
				+ ", negativa=" + negativa + ", fecope=" + fecope + ", mod303=" + mod303 + ", mod303a=" + mod303a
				+ ", mod303b=" + mod303b + ", mod303c=" + mod303c + ", mod347=" + mod347 + ", usuario_bloqueo="
				+ usuario_bloqueo + ", rec_deb_pag=" + rec_deb_pag + ", rec_incluir=" + rec_incluir + ", rec_antes_dto="
				+ rec_antes_dto + ", rec_iva_inc=" + rec_iva_inc + ", moneda=" + moneda + ", cotiza=" + cotiza
				+ ", basmon=" + basmon + ", totmon=" + totmon + ", entmon=" + entmon + ", obs_doc=" + obs_doc
				+ ", recargo=" + recargo + ", diasmax=" + diasmax + ", fecini=" + fecini + ", suplidos=" + suplidos
				+ ", iva1=" + iva1 + ", iva2=" + iva2 + ", iva3=" + iva3 + ", iva4=" + iva4 + ", iva5=" + iva5
				+ ", rec1=" + rec1 + ", rec2=" + rec2 + ", rec3=" + rec3 + ", rec4=" + rec4 + ", rec5=" + rec5
				+ ", tipivaok=" + tipivaok + ", exento=" + exento + ", cri_caja=" + cri_caja + ", ded_cie=" + ded_cie
				+ ", siiest=" + siiest + ", siiact=" + siiact + ", siitipfra=" + siitipfra + ", siifrarec=" + siifrarec
				+ ", siitiprec=" + siitiprec + ", siidesfra=" + siidesfra + ", siinifemi=" + siinifemi + ", siicuoded="
				+ siicuoded + ", siifecper=" + siifecper + ", siidatrec=" + siidatrec + ", siidatagr=" + siidatagr
				+ ", siibasrec=" + siibasrec + ", siicuorec=" + siicuorec + ", siirecrec=" + siirecrec + ", siibascos="
				+ siibascos + ", siiiss=" + siiiss + ", siidatdes=" + siidatdes + ", siifrarec1=" + siifrarec1
				+ ", siifrarec2=" + siifrarec2 + ", siinumacu=" + siinumacu + ", siinumresf=" + siinumresf
				+ ", siidesman=" + siidesman + ", patron=" + patron + ", siirefext=" + siirefext + ", siinomensu="
				+ siinomensu + ", siinifensu=" + siinifensu + ", siifraiden=" + siifraiden + ", siimacro=" + siimacro
				+ ", siiregprev=" + siiregprev + ", aeattipfac=" + aeattipfac + ", aeattipgas=" + aeattipgas
				+ ", aeatimpcon=" + aeatimpcon + "]";
	}
}
