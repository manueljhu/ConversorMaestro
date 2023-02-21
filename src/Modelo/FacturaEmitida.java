package Modelo;

import java.util.Objects;

public class FacturaEmitida {
	
	private String num;
	private String fea;
	private String doc;
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
	private String den;
	private String rut;
	private String obr;
	private String ivainc;
	private String tra;
	private float entped;
	private float impuesto;
	private String tip;
	private String web;
	private String aut;
	private String comis;
	private int negativa;
	private String fecope;
	private String efacgen;
	private String efacenv;
	private String sno;
	private String dir;
	private String pob;
	private int npro;
	private String pro;
	private float pais;
	private String mod303;
	private String mod303a;
	private String mod303b;
	private String mod303c;
	private String mod347;
	private int usuario_bloqueo;
	private String emi_deb_pag;
	private String emi_incluir;
	private String emi_antes_dto;
	private String emi_iva_inc;
	private int moneda;
	private float cotiza;
	private float basmon;
	private float totmon;
	private float entmon;
	private String obs_doc;
	private String recargo;
	private String retgar;
	private float porretgar;
	private float impretgar;
	private String tipretgar;
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
	private String numtic;
	private String cri_caja;
	private String ded_cie;
	private String cen_adm;
	private String siiest;
	private String siiact;
	private String siitipfra;
	private String siifraemi;
	private String siitiprec;
	private String siitipsuj;
	private String siitipnsu;
	private String siitipexe;
	private String siidesfra;
	private float siiimpnsu;
	private float siiimptai;
	private float siiimpexe;
	private String siinifemi;
	private String siiemiter;
	private String siicupon;
	private String siivardes;
	private String siidatrec;
	private String siidatinm;
	private String siidatagr;
	private float siibasrec;
	private float siicuorec;
	private float siirecrec;
	private float siibascos;
	private float siitraiva;
	private float siientexe;
	private String siientcexe;
	private String siienttsuj;
	private float siientnsu;
	private float siienttai;
	private String siientdes;
	private float siiserexe;
	private String siisercexe;
	private String siisertsuj;
	private float siisernsu;
	private float siisertai;
	private String siiserdes;
	private String siidatdes;
	private String siifraemi1;
	private String siifraemi2;
	private String siinumacu;
	private String siinumresf;
	private String siinemiter;
	private String siidesman;
	private String patron;
	private String siirefext;
	private String siinomensu;
	private String siinifensu;
	private String siidesnoid;
	private String siifraiden;
	private String siimergas;
	private String siidesexen;
	private String siimacro;
	private String siiregprev;
	private String siientdexe;
	private String siiserdexe;
	private String aeattipfac;
	private String aeattiping;
	private float aeatimpcon;
	
	public FacturaEmitida() {

		this.num="";
		this.doc="";
		this.gas="";
		this.cue="";
		this.li1="";
		this.li2="";
		this.forpag="";
		this.alm="";
		this.com="";
		this.nom="";
		this.nif="";
		this.den="";
		this.rut="";
		this.obr="";
		this.ivainc="";
		this.tra="";
		this.tip="";
		this.web="";
		this.aut="";
		this.comis="";
		this.efacgen="";
		this.efacenv="";
		this.sno="";
		this.dir="";
		this.pob="";
		this.pro="";
		this.mod303="";
		this.mod303a="";
		this.mod303b="";
		this.mod303c="";
		this.mod347="";
		this.emi_deb_pag="";
		this.emi_incluir="";
		this.emi_antes_dto="";
		this.emi_iva_inc="";
		this.recargo="";
		this.retgar="";
		this.tipretgar="";
		this.tipivaok="";
		this.exento="";
		this.numtic="";
		this.cri_caja="";
		this.ded_cie="";
		this.cen_adm="";
		this.siiest="";
		this.siiact="";
		this.siitipfra="";
		this.siifraemi="";
		this.siitiprec="";
		this.siitipsuj="";
		this.siitipnsu="";
		this.siitipexe="";
		this.siidesfra="";
		this.siinifemi="";
		this.siiemiter="";
		this.siicupon="";
		this.siivardes="";
		this.siientcexe="";
		this.siienttsuj="";
		this.siisercexe="";
		this.siisertsuj="";
		this.siifraemi1="";
		this.siifraemi2="";
		this.siinumacu="";
		this.siinumresf="";
		this.siinemiter="";
		this.patron="";
		this.siirefext="";
		this.siinomensu="";
		this.siinifensu="";
		this.siidesnoid="";
		this.siifraiden="";
		this.siimergas="";
		this.siimacro="";
		this.siiregprev="";
		this.aeattipfac="";
		this.aeattiping="";

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
	public String getDen() {
		return den;
	}
	public void setDen(String den) {
		this.den = den;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getObr() {
		return obr;
	}
	public void setObr(String obr) {
		this.obr = obr;
	}
	public String getIvainc() {
		return ivainc;
	}
	public void setIvainc(String ivainc) {
		this.ivainc = ivainc;
	}
	public String getTra() {
		return tra;
	}
	public void setTra(String tra) {
		this.tra = tra;
	}
	public float getEntped() {
		return entped;
	}
	public void setEntped(float entped) {
		this.entped = entped;
	}
	public float getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getAut() {
		return aut;
	}
	public void setAut(String aut) {
		this.aut = aut;
	}
	public String getComis() {
		return comis;
	}
	public void setComis(String comis) {
		this.comis = comis;
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
	public String getEfacgen() {
		return efacgen;
	}
	public void setEfacgen(String efacgen) {
		this.efacgen = efacgen;
	}
	public String getEfacenv() {
		return efacenv;
	}
	public void setEfacenv(String efacenv) {
		this.efacenv = efacenv;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
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
	public String getEmi_deb_pag() {
		return emi_deb_pag;
	}
	public void setEmi_deb_pag(String emi_deb_pag) {
		this.emi_deb_pag = emi_deb_pag;
	}
	public String getEmi_incluir() {
		return emi_incluir;
	}
	public void setEmi_incluir(String emi_incluir) {
		this.emi_incluir = emi_incluir;
	}
	public String getEmi_antes_dto() {
		return emi_antes_dto;
	}
	public void setEmi_antes_dto(String emi_antes_dto) {
		this.emi_antes_dto = emi_antes_dto;
	}
	public String getEmi_iva_inc() {
		return emi_iva_inc;
	}
	public void setEmi_iva_inc(String emi_iva_inc) {
		this.emi_iva_inc = emi_iva_inc;
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
	public String getRetgar() {
		return retgar;
	}
	public void setRetgar(String retgar) {
		this.retgar = retgar;
	}
	public float getPorretgar() {
		return porretgar;
	}
	public void setPorretgar(float porretgar) {
		this.porretgar = porretgar;
	}
	public float getImpretgar() {
		return impretgar;
	}
	public void setImpretgar(float impretgar) {
		this.impretgar = impretgar;
	}
	public String getTipretgar() {
		return tipretgar;
	}
	public void setTipretgar(String tipretgar) {
		this.tipretgar = tipretgar;
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
	public String getNumtic() {
		return numtic;
	}
	public void setNumtic(String numtic) {
		this.numtic = numtic;
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
	public String getCen_adm() {
		return cen_adm;
	}
	public void setCen_adm(String cen_adm) {
		this.cen_adm = cen_adm;
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
	public String getSiifraemi() {
		return siifraemi;
	}
	public void setSiifraemi(String siifraemi) {
		this.siifraemi = siifraemi;
	}
	public String getSiitiprec() {
		return siitiprec;
	}
	public void setSiitiprec(String siitiprec) {
		this.siitiprec = siitiprec;
	}
	public String getSiitipsuj() {
		return siitipsuj;
	}
	public void setSiitipsuj(String siitipsuj) {
		this.siitipsuj = siitipsuj;
	}
	public String getSiitipnsu() {
		return siitipnsu;
	}
	public void setSiitipnsu(String siitipnsu) {
		this.siitipnsu = siitipnsu;
	}
	public String getSiitipexe() {
		return siitipexe;
	}
	public void setSiitipexe(String siitipexe) {
		this.siitipexe = siitipexe;
	}
	public String getSiidesfra() {
		return siidesfra;
	}
	public void setSiidesfra(String siidesfra) {
		this.siidesfra = siidesfra;
	}
	public float getSiiimpnsu() {
		return siiimpnsu;
	}
	public void setSiiimpnsu(float siiimpnsu) {
		this.siiimpnsu = siiimpnsu;
	}
	public float getSiiimptai() {
		return siiimptai;
	}
	public void setSiiimptai(float siiimptai) {
		this.siiimptai = siiimptai;
	}
	public float getSiiimpexe() {
		return siiimpexe;
	}
	public void setSiiimpexe(float siiimpexe) {
		this.siiimpexe = siiimpexe;
	}
	public String getSiinifemi() {
		return siinifemi;
	}
	public void setSiinifemi(String siinifemi) {
		this.siinifemi = siinifemi;
	}
	public String getSiiemiter() {
		return siiemiter;
	}
	public void setSiiemiter(String siiemiter) {
		this.siiemiter = siiemiter;
	}
	public String getSiicupon() {
		return siicupon;
	}
	public void setSiicupon(String siicupon) {
		this.siicupon = siicupon;
	}
	public String getSiivardes() {
		return siivardes;
	}
	public void setSiivardes(String siivardes) {
		this.siivardes = siivardes;
	}
	public String getSiidatrec() {
		return siidatrec;
	}
	public void setSiidatrec(String siidatrec) {
		this.siidatrec = siidatrec;
	}
	public String getSiidatinm() {
		return siidatinm;
	}
	public void setSiidatinm(String siidatinm) {
		this.siidatinm = siidatinm;
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
	public float getSiitraiva() {
		return siitraiva;
	}
	public void setSiitraiva(float siitraiva) {
		this.siitraiva = siitraiva;
	}
	public float getSiientexe() {
		return siientexe;
	}
	public void setSiientexe(float siientexe) {
		this.siientexe = siientexe;
	}
	public String getSiientcexe() {
		return siientcexe;
	}
	public void setSiientcexe(String siientcexe) {
		this.siientcexe = siientcexe;
	}
	public String getSiienttsuj() {
		return siienttsuj;
	}
	public void setSiienttsuj(String siienttsuj) {
		this.siienttsuj = siienttsuj;
	}
	public float getSiientnsu() {
		return siientnsu;
	}
	public void setSiientnsu(float siientnsu) {
		this.siientnsu = siientnsu;
	}
	public float getSiienttai() {
		return siienttai;
	}
	public void setSiienttai(float siienttai) {
		this.siienttai = siienttai;
	}
	public String getSiientdes() {
		return siientdes;
	}
	public void setSiientdes(String siientdes) {
		this.siientdes = siientdes;
	}
	public float getSiiserexe() {
		return siiserexe;
	}
	public void setSiiserexe(float siiserexe) {
		this.siiserexe = siiserexe;
	}
	public String getSiisercexe() {
		return siisercexe;
	}
	public void setSiisercexe(String siisercexe) {
		this.siisercexe = siisercexe;
	}
	public String getSiisertsuj() {
		return siisertsuj;
	}
	public void setSiisertsuj(String siisertsuj) {
		this.siisertsuj = siisertsuj;
	}
	public float getSiisernsu() {
		return siisernsu;
	}
	public void setSiisernsu(float siisernsu) {
		this.siisernsu = siisernsu;
	}
	public float getSiisertai() {
		return siisertai;
	}
	public void setSiisertai(float siisertai) {
		this.siisertai = siisertai;
	}
	public String getSiiserdes() {
		return siiserdes;
	}
	public void setSiiserdes(String siiserdes) {
		this.siiserdes = siiserdes;
	}
	public String getSiidatdes() {
		return siidatdes;
	}
	public void setSiidatdes(String siidatdes) {
		this.siidatdes = siidatdes;
	}
	public String getSiifraemi1() {
		return siifraemi1;
	}
	public void setSiifraemi1(String siifraemi1) {
		this.siifraemi1 = siifraemi1;
	}
	public String getSiifraemi2() {
		return siifraemi2;
	}
	public void setSiifraemi2(String siifraemi2) {
		this.siifraemi2 = siifraemi2;
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
	public String getSiinemiter() {
		return siinemiter;
	}
	public void setSiinemiter(String siinemiter) {
		this.siinemiter = siinemiter;
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
	public String getSiidesnoid() {
		return siidesnoid;
	}
	public void setSiidesnoid(String siidesnoid) {
		this.siidesnoid = siidesnoid;
	}
	public String getSiifraiden() {
		return siifraiden;
	}
	public void setSiifraiden(String siifraiden) {
		this.siifraiden = siifraiden;
	}
	public String getSiimergas() {
		return siimergas;
	}
	public void setSiimergas(String siimergas) {
		this.siimergas = siimergas;
	}
	public String getSiidesexen() {
		return siidesexen;
	}
	public void setSiidesexen(String siidesexen) {
		this.siidesexen = siidesexen;
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
	public String getSiientdexe() {
		return siientdexe;
	}
	public void setSiientdexe(String siientdexe) {
		this.siientdexe = siientdexe;
	}
	public String getSiiserdexe() {
		return siiserdexe;
	}
	public void setSiiserdexe(String siiserdexe) {
		this.siiserdexe = siiserdexe;
	}
	public String getAeattipfac() {
		return aeattipfac;
	}
	public void setAeattipfac(String aeattipfac) {
		this.aeattipfac = aeattipfac;
	}
	public String getAeattiping() {
		return aeattiping;
	}
	public void setAeattiping(String aeattiping) {
		this.aeattiping = aeattiping;
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
		FacturaEmitida other = (FacturaEmitida) obj;
		return Objects.equals(num, other.num);
	}
	
	@Override
	public String toString() {
		return "FacturaEmitida [num=" + num + ", fea=" + fea + ", doc=" + doc + ", fee=" + fee + ", gas=" + gas
				+ ", cue=" + cue + ", li1=" + li1 + ", li2=" + li2 + ", dt1=" + dt1 + ", dt2=" + dt2 + ", fuc=" + fuc
				+ ", forpag=" + forpag + ", fin=" + fin + ", alm=" + alm + ", com=" + com + ", nom=" + nom + ", nif="
				+ nif + ", ba1eu=" + ba1eu + ", iv1eu=" + iv1eu + ", re1eu=" + re1eu + ", ba2eu=" + ba2eu + ", iv2eu="
				+ iv2eu + ", re2eu=" + re2eu + ", ba3eu=" + ba3eu + ", iv3eu=" + iv3eu + ", re3eu=" + re3eu + ", ba4eu="
				+ ba4eu + ", iv4eu=" + iv4eu + ", re4eu=" + re4eu + ", ba5eu=" + ba5eu + ", iv5eu=" + iv5eu + ", re5eu="
				+ re5eu + ", exeeu=" + exeeu + ", ulceu=" + ulceu + ", toceu=" + toceu + ", enteu=" + enteu + ", imceu="
				+ imceu + ", imreu=" + imreu + ", tre=" + tre + ", pre=" + pre + ", ireeu=" + ireeu + ", den=" + den
				+ ", rut=" + rut + ", obr=" + obr + ", ivainc=" + ivainc + ", tra=" + tra + ", entped=" + entped
				+ ", impuesto=" + impuesto + ", tip=" + tip + ", web=" + web + ", aut=" + aut + ", comis=" + comis
				+ ", negativa=" + negativa + ", fecope=" + fecope + ", efacgen=" + efacgen + ", efacenv=" + efacenv
				+ ", sno=" + sno + ", dir=" + dir + ", pob=" + pob + ", npro=" + npro + ", pro=" + pro + ", pais="
				+ pais + ", mod303=" + mod303 + ", mod303a=" + mod303a + ", mod303b=" + mod303b + ", mod303c=" + mod303c
				+ ", mod347=" + mod347 + ", usuario_bloqueo=" + usuario_bloqueo + ", emi_deb_pag=" + emi_deb_pag
				+ ", emi_incluir=" + emi_incluir + ", emi_antes_dto=" + emi_antes_dto + ", emi_iva_inc=" + emi_iva_inc
				+ ", moneda=" + moneda + ", cotiza=" + cotiza + ", basmon=" + basmon + ", totmon=" + totmon
				+ ", entmon=" + entmon + ", obs_doc=" + obs_doc + ", recargo=" + recargo + ", retgar=" + retgar
				+ ", porretgar=" + porretgar + ", impretgar=" + impretgar + ", tipretgar=" + tipretgar + ", suplidos="
				+ suplidos + ", iva1=" + iva1 + ", iva2=" + iva2 + ", iva3=" + iva3 + ", iva4=" + iva4 + ", iva5="
				+ iva5 + ", rec1=" + rec1 + ", rec2=" + rec2 + ", rec3=" + rec3 + ", rec4=" + rec4 + ", rec5=" + rec5
				+ ", tipivaok=" + tipivaok + ", exento=" + exento + ", numtic=" + numtic + ", cri_caja=" + cri_caja
				+ ", ded_cie=" + ded_cie + ", cen_adm=" + cen_adm + ", siiest=" + siiest + ", siiact=" + siiact
				+ ", siitipfra=" + siitipfra + ", siifraemi=" + siifraemi + ", siitiprec=" + siitiprec + ", siitipsuj="
				+ siitipsuj + ", siitipnsu=" + siitipnsu + ", siitipexe=" + siitipexe + ", siidesfra=" + siidesfra
				+ ", siiimpnsu=" + siiimpnsu + ", siiimptai=" + siiimptai + ", siiimpexe=" + siiimpexe + ", siinifemi="
				+ siinifemi + ", siiemiter=" + siiemiter + ", siicupon=" + siicupon + ", siivardes=" + siivardes
				+ ", siidatrec=" + siidatrec + ", siidatinm=" + siidatinm + ", siidatagr=" + siidatagr + ", siibasrec="
				+ siibasrec + ", siicuorec=" + siicuorec + ", siirecrec=" + siirecrec + ", siibascos=" + siibascos
				+ ", siitraiva=" + siitraiva + ", siientexe=" + siientexe + ", siientcexe=" + siientcexe
				+ ", siienttsuj=" + siienttsuj + ", siientnsu=" + siientnsu + ", siienttai=" + siienttai
				+ ", siientdes=" + siientdes + ", siiserexe=" + siiserexe + ", siisercexe=" + siisercexe
				+ ", siisertsuj=" + siisertsuj + ", siisernsu=" + siisernsu + ", siisertai=" + siisertai
				+ ", siiserdes=" + siiserdes + ", siidatdes=" + siidatdes + ", siifraemi1=" + siifraemi1
				+ ", siifraemi2=" + siifraemi2 + ", siinumacu=" + siinumacu + ", siinumresf=" + siinumresf
				+ ", siinemiter=" + siinemiter + ", siidesman=" + siidesman + ", patron=" + patron + ", siirefext="
				+ siirefext + ", siinomensu=" + siinomensu + ", siinifensu=" + siinifensu + ", siidesnoid=" + siidesnoid
				+ ", siifraiden=" + siifraiden + ", siimergas=" + siimergas + ", siidesexen=" + siidesexen
				+ ", siimacro=" + siimacro + ", siiregprev=" + siiregprev + ", siientdexe=" + siientdexe
				+ ", siiserdexe=" + siiserdexe + ", aeattipfac=" + aeattipfac + ", aeattiping=" + aeattiping
				+ ", aeatimpcon=" + aeatimpcon + "]";
	}	
}
