package Modelo;

import java.util.Objects;

public class Cliente {
	private String cod;
	private String nom;
	private String sno;
	private String dir;
	private String pob;
	private int npro;
	private String pro;
	private String nif;
	private String te1;
	private String te2;
	private String fax;
	private String mov;
	private String per;
	private String car;
	private String ter;
	private String req;
	private String red;
	private float dto;
	private int com;
	private float fin;
	private float fac;
	private int tar;
	private int forpag;
	private int di1;
	private int di2;
	private int di3;
	private int mnp;
	private String m30;
	private int vto;
	private float inc;
	private float rie;
	private String rut;
	private String age;
	private int nco;
	private String alv;
	private String fa1;
	private String fa2;
	private String tra;
	private String mar;
	private float dt2;
	private String tia;
	private int fo2;
	private int d1b;
	private int d2b;
	private int d3b;
	private int mnb;
	private float imp;
	private int tre;
	private float ret;
	private String fgl;
	private float ifg;
	private String web;
	private String doc;
	private String fpd;
	private float pais;
	private String ext;
	private String ob1;
	private String ob2;
	private int rediva1;
	private int rediva2;
	private int rediva3;
	private int rediva4;
	private int rediva5;
	private int avi0ped;
	private String avi1ped;
	private String avi2ped;
	private int avi0alb;
	private String avi1alb;
	private String avi2alb;
	private int avi0fac;
	private String avi1fac;
	private String avi2fac;
	private int avi0rec;
	private String avi1rec;
	private String avi2rec;
	private int avi0pre;
	private String avi1pre;
	private String avi2pre;
	private String ivainc;
	private String fot;
	private String env;
	private String xxx;
	private String fcr_crm;
	private float tip_crm;
	private String ftr_crm;
	private float tco_crm;
	private String ref_crm;
	private String vis_crm;
	private float pvi_crm;
	private String lla_crm;
	private float pll_crm;
	private String ru1_crm;
	private String ru2_crm;
	private String ru3_crm;
	private float sec_crm;
	private String dias_crm;
	private String tpl_crm;
	private String fna_crm;
	private float imprap;
	private float dtorap;
	private String tar_art;
	private String tar_fam;
	private String efactura;
	private int perrap;
	private String facedir;
	private String facepob;
	private int facenpro;
	private String facepro;
	private float facepais;
	private String facenom;
	private String faceape1;
	private String faceape2;
	private String facefoj;
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
	private String cli_facalb;
	private String cln_tarsub;
	private String cln_tarmar;
	private int cln_idioma;
	private int moneda;
	private int avi0dep;
	private String avi_dep;
	private String avi_ped;
	private String avi_pre;
	private String avi_alb;
	private String avi_fac;
	private String avi_rec;
	private String web_acc;
	private String web_psw;
	private String obs_doc;
	private String actividad;
	private String emailweb;
	private String web_exepor;
	private int tip_rem;
	private String fec_man;
	private String cri_caja;
	private String facemed;
	private String faceiban;
	private String facever;
	private String facepol;
	private String por_efac;
	private String web_codact;
	private String sincro;
	
	
	
	
	
	public Cliente() {
		this.cod="";
		this.nom="";
		this.sno="";
		this.dir="";
		this.pob="";
		this.pro="";
		this.nif="";
		this.te1="";
		this.te2="";
		this.fax="";
		this.mov="";
		this.per="";
		this.car="";
		this.ter="";
		this.req="";
		this.red="";
		this.m30="";
		this.rut="";
		this.age="";
		this.alv="";
		this.fa1="";
		this.fa2="";
		this.tra="";
		this.mar="";
		this.tia="";
		this.fgl="";
		this.web="";
		this.doc="";
		this.fpd="";
		this.ext="";
		this.ob1="";
		this.ob2="";
		this.avi1ped="";
		this.avi2ped="";
		this.avi1alb="";
		this.avi2alb="";
		this.avi1fac="";
		this.avi2fac="";
		this.avi1rec="";
		this.avi2rec="";
		this.avi1pre="";
		this.avi2pre="";
		this.ivainc="";
		this.fot="";
		this.env="";
		this.xxx="";
		this.ref_crm="";
		this.vis_crm="";
		this.lla_crm="";
		this.ru1_crm="";
		this.ru2_crm="";
		this.ru3_crm="";
		this.dias_crm="";
		this.tpl_crm="";
		this.tar_art="";
		this.tar_fam="";
		this.efactura="";
		this.facedir="";
		this.facepob="";
		this.facepro="";
		this.facenom="";
		this.faceape1="";
		this.faceape2="";
		this.facefoj="";
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
		this.cli_facalb="";
		this.cln_tarsub="";
		this.cln_tarmar="";
		this.web_acc="";
		this.web_psw="";
		this.actividad="";
		this.emailweb="";
		this.web_exepor="";
		this.cri_caja="";
		this.facemed="";
		this.faceiban="";
		this.facever="";
		this.facepol="";
		this.por_efac="";
		this.web_codact="";
		this.sincro="";

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
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getTer() {
		return ter;
	}
	public void setTer(String ter) {
		this.ter = ter;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	public String getRed() {
		return red;
	}
	public void setRed(String red) {
		this.red = red;
	}
	public float getDto() {
		return dto;
	}
	public void setDto(float dto) {
		this.dto = dto;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public float getFin() {
		return fin;
	}
	public void setFin(float fin) {
		this.fin = fin;
	}
	public float getFac() {
		return fac;
	}
	public void setFac(float fac) {
		this.fac = fac;
	}
	public int getTar() {
		return tar;
	}
	public void setTar(int tar) {
		this.tar = tar;
	}
	public int getForpag() {
		return forpag;
	}
	public void setForpag(int forpag) {
		this.forpag = forpag;
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
	public int getDi3() {
		return di3;
	}
	public void setDi3(int di3) {
		this.di3 = di3;
	}
	public int getMnp() {
		return mnp;
	}
	public void setMnp(int mnp) {
		this.mnp = mnp;
	}
	public String getM30() {
		return m30;
	}
	public void setM30(String m30) {
		this.m30 = m30;
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
	public float getRie() {
		return rie;
	}
	public void setRie(float rie) {
		this.rie = rie;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getNco() {
		return nco;
	}
	public void setNco(int nco) {
		this.nco = nco;
	}
	public String getAlv() {
		return alv;
	}
	public void setAlv(String alv) {
		this.alv = alv;
	}
	public String getFa1() {
		return fa1;
	}
	public void setFa1(String fa1) {
		this.fa1 = fa1;
	}
	public String getFa2() {
		return fa2;
	}
	public void setFa2(String fa2) {
		this.fa2 = fa2;
	}
	public String getTra() {
		return tra;
	}
	public void setTra(String tra) {
		this.tra = tra;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public float getDt2() {
		return dt2;
	}
	public void setDt2(float dt2) {
		this.dt2 = dt2;
	}
	public String getTia() {
		return tia;
	}
	public void setTia(String tia) {
		this.tia = tia;
	}
	public int getFo2() {
		return fo2;
	}
	public void setFo2(int fo2) {
		this.fo2 = fo2;
	}
	public int getD1b() {
		return d1b;
	}
	public void setD1b(int d1b) {
		this.d1b = d1b;
	}
	public int getD2b() {
		return d2b;
	}
	public void setD2b(int d2b) {
		this.d2b = d2b;
	}
	public int getD3b() {
		return d3b;
	}
	public void setD3b(int d3b) {
		this.d3b = d3b;
	}
	public int getMnb() {
		return mnb;
	}
	public void setMnb(int mnb) {
		this.mnb = mnb;
	}
	public float getImp() {
		return imp;
	}
	public void setImp(float imp) {
		this.imp = imp;
	}
	public int getTre() {
		return tre;
	}
	public void setTre(int tre) {
		this.tre = tre;
	}
	public float getRet() {
		return ret;
	}
	public void setRet(float ret) {
		this.ret = ret;
	}
	public String getFgl() {
		return fgl;
	}
	public void setFgl(String fgl) {
		this.fgl = fgl;
	}
	public float getIfg() {
		return ifg;
	}
	public void setIfg(float ifg) {
		this.ifg = ifg;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getFpd() {
		return fpd;
	}
	public void setFpd(String fpd) {
		this.fpd = fpd;
	}
	public float getPais() {
		return pais;
	}
	public void setPais(float pais) {
		this.pais = pais;
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
	public int getRediva1() {
		return rediva1;
	}
	public void setRediva1(int rediva1) {
		this.rediva1 = rediva1;
	}
	public int getRediva2() {
		return rediva2;
	}
	public void setRediva2(int rediva2) {
		this.rediva2 = rediva2;
	}
	public int getRediva3() {
		return rediva3;
	}
	public void setRediva3(int rediva3) {
		this.rediva3 = rediva3;
	}
	public int getRediva4() {
		return rediva4;
	}
	public void setRediva4(int rediva4) {
		this.rediva4 = rediva4;
	}
	public int getRediva5() {
		return rediva5;
	}
	public void setRediva5(int rediva5) {
		this.rediva5 = rediva5;
	}
	public int getAvi0ped() {
		return avi0ped;
	}
	public void setAvi0ped(int avi0ped) {
		this.avi0ped = avi0ped;
	}
	public String getAvi1ped() {
		return avi1ped;
	}
	public void setAvi1ped(String avi1ped) {
		this.avi1ped = avi1ped;
	}
	public String getAvi2ped() {
		return avi2ped;
	}
	public void setAvi2ped(String avi2ped) {
		this.avi2ped = avi2ped;
	}
	public int getAvi0alb() {
		return avi0alb;
	}
	public void setAvi0alb(int avi0alb) {
		this.avi0alb = avi0alb;
	}
	public String getAvi1alb() {
		return avi1alb;
	}
	public void setAvi1alb(String avi1alb) {
		this.avi1alb = avi1alb;
	}
	public String getAvi2alb() {
		return avi2alb;
	}
	public void setAvi2alb(String avi2alb) {
		this.avi2alb = avi2alb;
	}
	public int getAvi0fac() {
		return avi0fac;
	}
	public void setAvi0fac(int avi0fac) {
		this.avi0fac = avi0fac;
	}
	public String getAvi1fac() {
		return avi1fac;
	}
	public void setAvi1fac(String avi1fac) {
		this.avi1fac = avi1fac;
	}
	public String getAvi2fac() {
		return avi2fac;
	}
	public void setAvi2fac(String avi2fac) {
		this.avi2fac = avi2fac;
	}
	public int getAvi0rec() {
		return avi0rec;
	}
	public void setAvi0rec(int avi0rec) {
		this.avi0rec = avi0rec;
	}
	public String getAvi1rec() {
		return avi1rec;
	}
	public void setAvi1rec(String avi1rec) {
		this.avi1rec = avi1rec;
	}
	public String getAvi2rec() {
		return avi2rec;
	}
	public void setAvi2rec(String avi2rec) {
		this.avi2rec = avi2rec;
	}
	public int getAvi0pre() {
		return avi0pre;
	}
	public void setAvi0pre(int avi0pre) {
		this.avi0pre = avi0pre;
	}
	public String getAvi1pre() {
		return avi1pre;
	}
	public void setAvi1pre(String avi1pre) {
		this.avi1pre = avi1pre;
	}
	public String getAvi2pre() {
		return avi2pre;
	}
	public void setAvi2pre(String avi2pre) {
		this.avi2pre = avi2pre;
	}
	public String getIvainc() {
		return ivainc;
	}
	public void setIvainc(String ivainc) {
		this.ivainc = ivainc;
	}
	public String getFot() {
		return fot;
	}
	public void setFot(String fot) {
		this.fot = fot;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getXxx() {
		return xxx;
	}
	public void setXxx(String xxx) {
		this.xxx = xxx;
	}
	public String getFcr_crm() {
		return fcr_crm;
	}
	public void setFcr_crm(String fcr_crm) {
		this.fcr_crm = fcr_crm;
	}
	public float getTip_crm() {
		return tip_crm;
	}
	public void setTip_crm(float tip_crm) {
		this.tip_crm = tip_crm;
	}
	public String getFtr_crm() {
		return ftr_crm;
	}
	public void setFtr_crm(String ftr_crm) {
		this.ftr_crm = ftr_crm;
	}
	public float getTco_crm() {
		return tco_crm;
	}
	public void setTco_crm(float tco_crm) {
		this.tco_crm = tco_crm;
	}
	public String getRef_crm() {
		return ref_crm;
	}
	public void setRef_crm(String ref_crm) {
		this.ref_crm = ref_crm;
	}
	public String getVis_crm() {
		return vis_crm;
	}
	public void setVis_crm(String vis_crm) {
		this.vis_crm = vis_crm;
	}
	public float getPvi_crm() {
		return pvi_crm;
	}
	public void setPvi_crm(float pvi_crm) {
		this.pvi_crm = pvi_crm;
	}
	public String getLla_crm() {
		return lla_crm;
	}
	public void setLla_crm(String lla_crm) {
		this.lla_crm = lla_crm;
	}
	public float getPll_crm() {
		return pll_crm;
	}
	public void setPll_crm(float pll_crm) {
		this.pll_crm = pll_crm;
	}
	public String getRu1_crm() {
		return ru1_crm;
	}
	public void setRu1_crm(String ru1_crm) {
		this.ru1_crm = ru1_crm;
	}
	public String getRu2_crm() {
		return ru2_crm;
	}
	public void setRu2_crm(String ru2_crm) {
		this.ru2_crm = ru2_crm;
	}
	public String getRu3_crm() {
		return ru3_crm;
	}
	public void setRu3_crm(String ru3_crm) {
		this.ru3_crm = ru3_crm;
	}
	public float getSec_crm() {
		return sec_crm;
	}
	public void setSec_crm(float sec_crm) {
		this.sec_crm = sec_crm;
	}
	public String getDias_crm() {
		return dias_crm;
	}
	public void setDias_crm(String dias_crm) {
		this.dias_crm = dias_crm;
	}
	public String getTpl_crm() {
		return tpl_crm;
	}
	public void setTpl_crm(String tpl_crm) {
		this.tpl_crm = tpl_crm;
	}
	public String getFna_crm() {
		return fna_crm;
	}
	public void setFna_crm(String fna_crm) {
		this.fna_crm = fna_crm;
	}
	public float getImprap() {
		return imprap;
	}
	public void setImprap(float imprap) {
		this.imprap = imprap;
	}
	public float getDtorap() {
		return dtorap;
	}
	public void setDtorap(float dtorap) {
		this.dtorap = dtorap;
	}
	public String getTar_art() {
		return tar_art;
	}
	public void setTar_art(String tar_art) {
		this.tar_art = tar_art;
	}
	public String getTar_fam() {
		return tar_fam;
	}
	public void setTar_fam(String tar_fam) {
		this.tar_fam = tar_fam;
	}
	public String getEfactura() {
		return efactura;
	}
	public void setEfactura(String efactura) {
		this.efactura = efactura;
	}
	public int getPerrap() {
		return perrap;
	}
	public void setPerrap(int perrap) {
		this.perrap = perrap;
	}
	public String getFacedir() {
		return facedir;
	}
	public void setFacedir(String facedir) {
		this.facedir = facedir;
	}
	public String getFacepob() {
		return facepob;
	}
	public void setFacepob(String facepob) {
		this.facepob = facepob;
	}
	public int getFacenpro() {
		return facenpro;
	}
	public void setFacenpro(int facenpro) {
		this.facenpro = facenpro;
	}
	public String getFacepro() {
		return facepro;
	}
	public void setFacepro(String facepro) {
		this.facepro = facepro;
	}
	public float getFacepais() {
		return facepais;
	}
	public void setFacepais(float facepais) {
		this.facepais = facepais;
	}
	public String getFacenom() {
		return facenom;
	}
	public void setFacenom(String facenom) {
		this.facenom = facenom;
	}
	public String getFaceape1() {
		return faceape1;
	}
	public void setFaceape1(String faceape1) {
		this.faceape1 = faceape1;
	}
	public String getFaceape2() {
		return faceape2;
	}
	public void setFaceape2(String faceape2) {
		this.faceape2 = faceape2;
	}
	public String getFacefoj() {
		return facefoj;
	}
	public void setFacefoj(String facefoj) {
		this.facefoj = facefoj;
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
	public String getCli_facalb() {
		return cli_facalb;
	}
	public void setCli_facalb(String cli_facalb) {
		this.cli_facalb = cli_facalb;
	}
	public String getCln_tarsub() {
		return cln_tarsub;
	}
	public void setCln_tarsub(String cln_tarsub) {
		this.cln_tarsub = cln_tarsub;
	}
	public String getCln_tarmar() {
		return cln_tarmar;
	}
	public void setCln_tarmar(String cln_tarmar) {
		this.cln_tarmar = cln_tarmar;
	}
	public int getCln_idioma() {
		return cln_idioma;
	}
	public void setCln_idioma(int cln_idioma) {
		this.cln_idioma = cln_idioma;
	}
	public int getMoneda() {
		return moneda;
	}
	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}
	public int getAvi0dep() {
		return avi0dep;
	}
	public void setAvi0dep(int avi0dep) {
		this.avi0dep = avi0dep;
	}
	public String getAvi_dep() {
		return avi_dep;
	}
	public void setAvi_dep(String avi_dep) {
		this.avi_dep = avi_dep;
	}
	public String getAvi_ped() {
		return avi_ped;
	}
	public void setAvi_ped(String avi_ped) {
		this.avi_ped = avi_ped;
	}
	public String getAvi_pre() {
		return avi_pre;
	}
	public void setAvi_pre(String avi_pre) {
		this.avi_pre = avi_pre;
	}
	public String getAvi_alb() {
		return avi_alb;
	}
	public void setAvi_alb(String avi_alb) {
		this.avi_alb = avi_alb;
	}
	public String getAvi_fac() {
		return avi_fac;
	}
	public void setAvi_fac(String avi_fac) {
		this.avi_fac = avi_fac;
	}
	public String getAvi_rec() {
		return avi_rec;
	}
	public void setAvi_rec(String avi_rec) {
		this.avi_rec = avi_rec;
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
	public String getObs_doc() {
		return obs_doc;
	}
	public void setObs_doc(String obs_doc) {
		this.obs_doc = obs_doc;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public String getEmailweb() {
		return emailweb;
	}
	public void setEmailweb(String emailweb) {
		this.emailweb = emailweb;
	}
	public String getWeb_exepor() {
		return web_exepor;
	}
	public void setWeb_exepor(String web_exepor) {
		this.web_exepor = web_exepor;
	}
	public int getTip_rem() {
		return tip_rem;
	}
	public void setTip_rem(int tip_rem) {
		this.tip_rem = tip_rem;
	}
	public String getFec_man() {
		return fec_man;
	}
	public void setFec_man(String fec_man) {
		this.fec_man = fec_man;
	}
	public String getCri_caja() {
		return cri_caja;
	}
	public void setCri_caja(String cri_caja) {
		this.cri_caja = cri_caja;
	}
	public String getFacemed() {
		return facemed;
	}
	public void setFacemed(String facemed) {
		this.facemed = facemed;
	}
	public String getFaceiban() {
		return faceiban;
	}
	public void setFaceiban(String faceiban) {
		this.faceiban = faceiban;
	}
	public String getFacever() {
		return facever;
	}
	public void setFacever(String facever) {
		this.facever = facever;
	}
	public String getFacepol() {
		return facepol;
	}
	public void setFacepol(String facepol) {
		this.facepol = facepol;
	}
	public String getPor_efac() {
		return por_efac;
	}
	public void setPor_efac(String por_efac) {
		this.por_efac = por_efac;
	}
	public String getWeb_codact() {
		return web_codact;
	}
	public void setWeb_codact(String web_codact) {
		this.web_codact = web_codact;
	}
	public String getSincro() {
		return sincro;
	}
	public void setSincro(String sincro) {
		this.sincro = sincro;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(cod, other.cod);
	}
	@Override
	public String toString() {
		return "Cliente [cod=" + cod + ", nom=" + nom + ", sno=" + sno + ", dir=" + dir + ", pob=" + pob + ", npro="
				+ npro + ", pro=" + pro + ", nif=" + nif + ", te1=" + te1 + ", te2=" + te2 + ", fax=" + fax + ", mov="
				+ mov + ", per=" + per + ", car=" + car + ", ter=" + ter + ", req=" + req + ", red=" + red + ", dto="
				+ dto + ", com=" + com + ", fin=" + fin + ", fac=" + fac + ", tar=" + tar + ", forpag=" + forpag
				+ ", di1=" + di1 + ", di2=" + di2 + ", di3=" + di3 + ", mnp=" + mnp + ", m30=" + m30 + ", vto=" + vto
				+ ", inc=" + inc + ", rie=" + rie + ", rut=" + rut + ", age=" + age + ", nco=" + nco + ", alv=" + alv
				+ ", fa1=" + fa1 + ", fa2=" + fa2 + ", tra=" + tra + ", mar=" + mar + ", dt2=" + dt2 + ", tia=" + tia
				+ ", fo2=" + fo2 + ", d1b=" + d1b + ", d2b=" + d2b + ", d3b=" + d3b + ", mnb=" + mnb + ", imp=" + imp
				+ ", tre=" + tre + ", ret=" + ret + ", fgl=" + fgl + ", ifg=" + ifg + ", web=" + web + ", doc=" + doc
				+ ", fpd=" + fpd + ", pais=" + pais + ", ext=" + ext + ", ob1=" + ob1 + ", ob2=" + ob2 + ", rediva1="
				+ rediva1 + ", rediva2=" + rediva2 + ", rediva3=" + rediva3 + ", rediva4=" + rediva4 + ", rediva5="
				+ rediva5 + ", avi0ped=" + avi0ped + ", avi1ped=" + avi1ped + ", avi2ped=" + avi2ped + ", avi0alb="
				+ avi0alb + ", avi1alb=" + avi1alb + ", avi2alb=" + avi2alb + ", avi0fac=" + avi0fac + ", avi1fac="
				+ avi1fac + ", avi2fac=" + avi2fac + ", avi0rec=" + avi0rec + ", avi1rec=" + avi1rec + ", avi2rec="
				+ avi2rec + ", avi0pre=" + avi0pre + ", avi1pre=" + avi1pre + ", avi2pre=" + avi2pre + ", ivainc="
				+ ivainc + ", fot=" + fot + ", env=" + env + ", xxx=" + xxx + ", fcr_crm=" + fcr_crm + ", tip_crm="
				+ tip_crm + ", ftr_crm=" + ftr_crm + ", tco_crm=" + tco_crm + ", ref_crm=" + ref_crm + ", vis_crm="
				+ vis_crm + ", pvi_crm=" + pvi_crm + ", lla_crm=" + lla_crm + ", pll_crm=" + pll_crm + ", ru1_crm="
				+ ru1_crm + ", ru2_crm=" + ru2_crm + ", ru3_crm=" + ru3_crm + ", sec_crm=" + sec_crm + ", dias_crm="
				+ dias_crm + ", tpl_crm=" + tpl_crm + ", fna_crm=" + fna_crm + ", imprap=" + imprap + ", dtorap="
				+ dtorap + ", tar_art=" + tar_art + ", tar_fam=" + tar_fam + ", efactura=" + efactura + ", perrap="
				+ perrap + ", facedir=" + facedir + ", facepob=" + facepob + ", facenpro=" + facenpro + ", facepro="
				+ facepro + ", facepais=" + facepais + ", facenom=" + facenom + ", faceape1=" + faceape1 + ", faceape2="
				+ faceape2 + ", facefoj=" + facefoj + ", v01=" + v01 + ", v02=" + v02 + ", v03=" + v03 + ", v04=" + v04
				+ ", v05=" + v05 + ", v06=" + v06 + ", v07=" + v07 + ", v08=" + v08 + ", v09=" + v09 + ", v10=" + v10
				+ ", v11=" + v11 + ", v12=" + v12 + ", historia=" + historia + ", lopd_ori=" + lopd_ori
				+ ", lopd_otr_o=" + lopd_otr_o + ", lopd_ces=" + lopd_ces + ", lopd_otr_c=" + lopd_otr_c
				+ ", cli_facalb=" + cli_facalb + ", cln_tarsub=" + cln_tarsub + ", cln_tarmar=" + cln_tarmar
				+ ", cln_idioma=" + cln_idioma + ", moneda=" + moneda + ", avi0dep=" + avi0dep + ", avi_dep=" + avi_dep
				+ ", avi_ped=" + avi_ped + ", avi_pre=" + avi_pre + ", avi_alb=" + avi_alb + ", avi_fac=" + avi_fac
				+ ", avi_rec=" + avi_rec + ", web_acc=" + web_acc + ", web_psw=" + web_psw + ", obs_doc=" + obs_doc
				+ ", actividad=" + actividad + ", emailweb=" + emailweb + ", web_exepor=" + web_exepor + ", tip_rem="
				+ tip_rem + ", fec_man=" + fec_man + ", cri_caja=" + cri_caja + ", facemed=" + facemed + ", faceiban="
				+ faceiban + ", facever=" + facever + ", facepol=" + facepol + ", por_efac=" + por_efac
				+ ", web_codact=" + web_codact + ", sincro=" + sincro + "]";
	}
	
	
	
	
}
