package Modelo;

import java.util.Objects;

	//XX sera sustituido por los dos ultimos digitos del año en curso para los asientos
	public class Articulo {
		private String cod;
		private String nom;
		private String fam;
		private String obs;
		private float min;
		private float max;
		private String med;
		private String uni;
		private String cla;
		private int iva;
		private String ubi;
		private String rea;
		private String rep;
		private float cos;
		private float pba;
		private String dtocom1;
		private String dtocom2;
		private String dtoven1;
		private String dtoven2;
		private float dt1;
		private float dt2;
		private float dt3;
		private float dt4;
		private float dt5;
		private float co1;
		private float co2;
		private float co3;
		private float co4;
		private float co5;
		private float pmc;
		private float upc;
		private String ufc;
		private String pro;
		private float pmv;
		private float upv;
		private String ufv;
		private float exi;
		private float vai;
		private float ent;
		private float ptc;
		private float sal;
		private float ptv;
		private float ma1;
		private float ma2;
		private float ma3;
		private float ma4;
		private float ma5;
		private float d01;
		private float d02;
		private float d03;
		private float d04;
		private float d05;
		private String cuc;
		private String cuv;
		private String bar;
		private float p21;
		private float p22;
		private float p23;
		private float p24;
		private float p25;
		private int iv2;
		private String ima;
		private String abr;
		private float coi;
		private int di1;
		private int di2;
		private int sec;
		private String tem;
		private float ide;
		private String tra;
		private String coe;
		private String eim;
		private int gru;
		private String pos;
		private String fot;
		private String trazab;
		private String medida;
		private int num_med;
		private float med_1;
		private float med_2;
		private float med_3;
		private float bultos;
		private float paquet;
		private String impues;
		private String art_imp;
		private String sum_imp;
		private float fac_can;
		private float fac_imp;
		private String fec_cre;
		private String obsole;
		private String per_com;
		private String per_ven;
		private float peso;
		private float volumen;
		private String men_sto;
		private String con_sto;
		private String marca1;
		private String marca2;
		private String ped_tex;
		private String ped_cos;
		private String env;
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
		private String ctadevcom;
		private String ctadevven;
		private String ctadtocom;
		private String ctadtoven;
		private float meses;
		private String imaweb;
		private String fabpro;
		private String fabtip;
		private String nse;
		private String historia;
		private float art_minped;
		private String art_subfam;
		private String art_marca;
		private String web_nov;
		private String web_fealno;
		private String web_des;
		private float coefici;
		private String web_sub;
		private String web_actd;
		private String web_acth;
		private String divs1;
		private String divs2;
		private float web_cat1;
		private float web_cat2;
		private float web_cat3;
		private String ntv;
		private String agr;
		private String com;
		private String hor;
		private float come;
		private int tim;
		private float dos;
		private float num_pro;
		private float num_com;
		private String csi;
		private String inc_pre;
		private float inc_red;
		private float web_orcat1;
		private float web_orcat2;
		private float web_orcat3;
		private String web_metat;
		private String web_metad;
		private String web_urla;
		private String web_h1;
		private String web_h2_1;
		private String web_h2_2;
		private String sincro;
		
		public Articulo() {
			this.cod="";
			this.nom="";
			this.fam="";
			this.obs="";
			this.med="";
			this.uni="";
			this.cla="";
			this.ubi="";
			this.rea="";
			this.rep="";
			this.dtocom1="";
			this.dtocom2="";
			this.dtoven1="";
			this.dtoven2="";
			this.pro="";
			this.cuc="";
			this.cuv="";
			this.bar="";
			this.ima="";
			this.abr="";
			this.tem="";
			this.tra="";
			this.coe="";
			this.eim="";
			this.pos="";
			this.fot="";
			this.trazab="";
			this.medida="";
			this.impues="";
			this.art_imp="";
			this.sum_imp="";
			this.obsole="";
			this.per_com="";
			this.per_ven="";
			this.men_sto="";
			this.con_sto="";
			this.marca1="";
			this.marca2="";
			this.ped_tex="";
			this.ped_cos="";
			this.env="";
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
			this.ctadevcom="";
			this.ctadevven="";
			this.ctadtocom="";
			this.ctadtoven="";
			this.imaweb="";
			this.fabpro="";
			this.fabtip="";
			this.nse="";
			this.art_subfam="";
			this.art_marca="";
			this.web_nov="";
			this.web_des="";
			this.web_sub="";
			this.ntv="";
			this.agr="";
			this.com="";
			this.hor="";
			this.csi="";
			this.inc_pre="";
			this.web_metat="";
			this.web_metad="";
			this.web_urla="";
			this.web_h1="";
			this.web_h2_1="";
			this.web_h2_2="";
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
		public String getFam() {
			return fam;
		}
		public void setFam(String fam) {
			this.fam = fam;
		}
		public String getObs() {
			return obs;
		}
		public void setObs(String obs) {
			this.obs = obs;
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
		public String getMed() {
			return med;
		}
		public void setMed(String med) {
			this.med = med;
		}
		public String getUni() {
			return uni;
		}
		public void setUni(String uni) {
			this.uni = uni;
		}
		public String getCla() {
			return cla;
		}
		public void setCla(String cla) {
			this.cla = cla;
		}
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			this.iva = iva;
		}
		public String getUbi() {
			return ubi;
		}
		public void setUbi(String ubi) {
			this.ubi = ubi;
		}
		public String getRea() {
			return rea;
		}
		public void setRea(String rea) {
			this.rea = rea;
		}
		public String getRep() {
			return rep;
		}
		public void setRep(String rep) {
			this.rep = rep;
		}
		public float getCos() {
			return cos;
		}
		public void setCos(float cos) {
			this.cos = cos;
		}
		public float getPba() {
			return pba;
		}
		public void setPba(float pba) {
			this.pba = pba;
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
		public float getPmc() {
			return pmc;
		}
		public void setPmc(float pmc) {
			this.pmc = pmc;
		}
		public float getUpc() {
			return upc;
		}
		public void setUpc(float upc) {
			this.upc = upc;
		}
		public String getUfc() {
			return ufc;
		}
		public void setUfc(String ufc) {
			this.ufc = ufc;
		}
		public String getPro() {
			return pro;
		}
		public void setPro(String pro) {
			this.pro = pro;
		}
		public float getPmv() {
			return pmv;
		}
		public void setPmv(float pmv) {
			this.pmv = pmv;
		}
		public float getUpv() {
			return upv;
		}
		public void setUpv(float upv) {
			this.upv = upv;
		}
		public String getUfv() {
			return ufv;
		}
		public void setUfv(String ufv) {
			this.ufv = ufv;
		}
		public float getExi() {
			return exi;
		}
		public void setExi(float exi) {
			this.exi = exi;
		}
		public float getVai() {
			return vai;
		}
		public void setVai(float vai) {
			this.vai = vai;
		}
		public float getEnt() {
			return ent;
		}
		public void setEnt(float ent) {
			this.ent = ent;
		}
		public float getPtc() {
			return ptc;
		}
		public void setPtc(float ptc) {
			this.ptc = ptc;
		}
		public float getSal() {
			return sal;
		}
		public void setSal(float sal) {
			this.sal = sal;
		}
		public float getPtv() {
			return ptv;
		}
		public void setPtv(float ptv) {
			this.ptv = ptv;
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
		public String getBar() {
			return bar;
		}
		public void setBar(String bar) {
			this.bar = bar;
		}
		public float getP21() {
			return p21;
		}
		public void setP21(float p21) {
			this.p21 = p21;
		}
		public float getP22() {
			return p22;
		}
		public void setP22(float p22) {
			this.p22 = p22;
		}
		public float getP23() {
			return p23;
		}
		public void setP23(float p23) {
			this.p23 = p23;
		}
		public float getP24() {
			return p24;
		}
		public void setP24(float p24) {
			this.p24 = p24;
		}
		public float getP25() {
			return p25;
		}
		public void setP25(float p25) {
			this.p25 = p25;
		}
		public int getIv2() {
			return iv2;
		}
		public void setIv2(int iv2) {
			this.iv2 = iv2;
		}
		public String getIma() {
			return ima;
		}
		public void setIma(String ima) {
			this.ima = ima;
		}
		public String getAbr() {
			return abr;
		}
		public void setAbr(String abr) {
			this.abr = abr;
		}
		public float getCoi() {
			return coi;
		}
		public void setCoi(float coi) {
			this.coi = coi;
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
		public int getSec() {
			return sec;
		}
		public void setSec(int sec) {
			this.sec = sec;
		}
		public String getTem() {
			return tem;
		}
		public void setTem(String tem) {
			this.tem = tem;
		}
		public float getIde() {
			return ide;
		}
		public void setIde(float ide) {
			this.ide = ide;
		}
		public String getTra() {
			return tra;
		}
		public void setTra(String tra) {
			this.tra = tra;
		}
		public String getCoe() {
			return coe;
		}
		public void setCoe(String coe) {
			this.coe = coe;
		}
		public String getEim() {
			return eim;
		}
		public void setEim(String eim) {
			this.eim = eim;
		}
		public int getGru() {
			return gru;
		}
		public void setGru(int gru) {
			this.gru = gru;
		}
		public String getPos() {
			return pos;
		}
		public void setPos(String pos) {
			this.pos = pos;
		}
		public String getFot() {
			return fot;
		}
		public void setFot(String fot) {
			this.fot = fot;
		}
		public String getTrazab() {
			return trazab;
		}
		public void setTrazab(String trazab) {
			this.trazab = trazab;
		}
		public String getMedida() {
			return medida;
		}
		public void setMedida(String medida) {
			this.medida = medida;
		}
		public int getNum_med() {
			return num_med;
		}
		public void setNum_med(int num_med) {
			this.num_med = num_med;
		}
		public float getMed_1() {
			return med_1;
		}
		public void setMed_1(float med_1) {
			this.med_1 = med_1;
		}
		public float getMed_2() {
			return med_2;
		}
		public void setMed_2(float med_2) {
			this.med_2 = med_2;
		}
		public float getMed_3() {
			return med_3;
		}
		public void setMed_3(float med_3) {
			this.med_3 = med_3;
		}
		public float getBultos() {
			return bultos;
		}
		public void setBultos(float bultos) {
			this.bultos = bultos;
		}
		public float getPaquet() {
			return paquet;
		}
		public void setPaquet(float paquet) {
			this.paquet = paquet;
		}
		public String getImpues() {
			return impues;
		}
		public void setImpues(String impues) {
			this.impues = impues;
		}
		public String getArt_imp() {
			return art_imp;
		}
		public void setArt_imp(String art_imp) {
			this.art_imp = art_imp;
		}
		public String getSum_imp() {
			return sum_imp;
		}
		public void setSum_imp(String sum_imp) {
			this.sum_imp = sum_imp;
		}
		public float getFac_can() {
			return fac_can;
		}
		public void setFac_can(float fac_can) {
			this.fac_can = fac_can;
		}
		public float getFac_imp() {
			return fac_imp;
		}
		public void setFac_imp(float fac_imp) {
			this.fac_imp = fac_imp;
		}
		public String getFec_cre() {
			return fec_cre;
		}
		public void setFec_cre(String fec_cre) {
			this.fec_cre = fec_cre;
		}
		public String getObsole() {
			return obsole;
		}
		public void setObsole(String obsole) {
			this.obsole = obsole;
		}
		public String getPer_com() {
			return per_com;
		}
		public void setPer_com(String per_com) {
			this.per_com = per_com;
		}
		public String getPer_ven() {
			return per_ven;
		}
		public void setPer_ven(String per_ven) {
			this.per_ven = per_ven;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
		}
		public float getVolumen() {
			return volumen;
		}
		public void setVolumen(float volumen) {
			this.volumen = volumen;
		}
		public String getMen_sto() {
			return men_sto;
		}
		public void setMen_sto(String men_sto) {
			this.men_sto = men_sto;
		}
		public String getCon_sto() {
			return con_sto;
		}
		public void setCon_sto(String con_sto) {
			this.con_sto = con_sto;
		}
		public String getMarca1() {
			return marca1;
		}
		public void setMarca1(String marca1) {
			this.marca1 = marca1;
		}
		public String getMarca2() {
			return marca2;
		}
		public void setMarca2(String marca2) {
			this.marca2 = marca2;
		}
		public String getPed_tex() {
			return ped_tex;
		}
		public void setPed_tex(String ped_tex) {
			this.ped_tex = ped_tex;
		}
		public String getPed_cos() {
			return ped_cos;
		}
		public void setPed_cos(String ped_cos) {
			this.ped_cos = ped_cos;
		}
		public String getEnv() {
			return env;
		}
		public void setEnv(String env) {
			this.env = env;
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
		public float getMeses() {
			return meses;
		}
		public void setMeses(float meses) {
			this.meses = meses;
		}
		public String getImaweb() {
			return imaweb;
		}
		public void setImaweb(String imaweb) {
			this.imaweb = imaweb;
		}
		public String getFabpro() {
			return fabpro;
		}
		public void setFabpro(String fabpro) {
			this.fabpro = fabpro;
		}
		public String getFabtip() {
			return fabtip;
		}
		public void setFabtip(String fabtip) {
			this.fabtip = fabtip;
		}
		public String getNse() {
			return nse;
		}
		public void setNse(String nse) {
			this.nse = nse;
		}
		public String getHistoria() {
			return historia;
		}
		public void setHistoria(String historia) {
			this.historia = historia;
		}
		public float getArt_minped() {
			return art_minped;
		}
		public void setArt_minped(float art_minped) {
			this.art_minped = art_minped;
		}
		public String getArt_subfam() {
			return art_subfam;
		}
		public void setArt_subfam(String art_subfam) {
			this.art_subfam = art_subfam;
		}
		public String getArt_marca() {
			return art_marca;
		}
		public void setArt_marca(String art_marca) {
			this.art_marca = art_marca;
		}
		public String getWeb_nov() {
			return web_nov;
		}
		public void setWeb_nov(String web_nov) {
			this.web_nov = web_nov;
		}
		public String getWeb_fealno() {
			return web_fealno;
		}
		public void setWeb_fealno(String web_fealno) {
			this.web_fealno = web_fealno;
		}
		public String getWeb_des() {
			return web_des;
		}
		public void setWeb_des(String web_des) {
			this.web_des = web_des;
		}
		public float getCoefici() {
			return coefici;
		}
		public void setCoefici(float coefici) {
			this.coefici = coefici;
		}
		public String getWeb_sub() {
			return web_sub;
		}
		public void setWeb_sub(String web_sub) {
			this.web_sub = web_sub;
		}
		public String getWeb_actd() {
			return web_actd;
		}
		public void setWeb_actd(String web_actd) {
			this.web_actd = web_actd;
		}
		public String getWeb_acth() {
			return web_acth;
		}
		public void setWeb_acth(String web_acth) {
			this.web_acth = web_acth;
		}
		public String getDivs1() {
			return divs1;
		}
		public void setDivs1(String divs1) {
			this.divs1 = divs1;
		}
		public String getDivs2() {
			return divs2;
		}
		public void setDivs2(String divs2) {
			this.divs2 = divs2;
		}
		public float getWeb_cat1() {
			return web_cat1;
		}
		public void setWeb_cat1(float web_cat1) {
			this.web_cat1 = web_cat1;
		}
		public float getWeb_cat2() {
			return web_cat2;
		}
		public void setWeb_cat2(float web_cat2) {
			this.web_cat2 = web_cat2;
		}
		public float getWeb_cat3() {
			return web_cat3;
		}
		public void setWeb_cat3(float web_cat3) {
			this.web_cat3 = web_cat3;
		}
		public String getNtv() {
			return ntv;
		}
		public void setNtv(String ntv) {
			this.ntv = ntv;
		}
		public String getAgr() {
			return agr;
		}
		public void setAgr(String agr) {
			this.agr = agr;
		}
		public String getCom() {
			return com;
		}
		public void setCom(String com) {
			this.com = com;
		}
		public String getHor() {
			return hor;
		}
		public void setHor(String hor) {
			this.hor = hor;
		}
		public float getCome() {
			return come;
		}
		public void setCome(float come) {
			this.come = come;
		}
		public int getTim() {
			return tim;
		}
		public void setTim(int tim) {
			this.tim = tim;
		}
		public float getDos() {
			return dos;
		}
		public void setDos(float dos) {
			this.dos = dos;
		}
		public float getNum_pro() {
			return num_pro;
		}
		public void setNum_pro(float num_pro) {
			this.num_pro = num_pro;
		}
		public float getNum_com() {
			return num_com;
		}
		public void setNum_com(float num_com) {
			this.num_com = num_com;
		}
		public String getCsi() {
			return csi;
		}
		public void setCsi(String csi) {
			this.csi = csi;
		}
		public String getInc_pre() {
			return inc_pre;
		}
		public void setInc_pre(String inc_pre) {
			this.inc_pre = inc_pre;
		}
		public float getInc_red() {
			return inc_red;
		}
		public void setInc_red(float inc_red) {
			this.inc_red = inc_red;
		}
		public float getWeb_orcat1() {
			return web_orcat1;
		}
		public void setWeb_orcat1(float web_orcat1) {
			this.web_orcat1 = web_orcat1;
		}
		public float getWeb_orcat2() {
			return web_orcat2;
		}
		public void setWeb_orcat2(float web_orcat2) {
			this.web_orcat2 = web_orcat2;
		}
		public float getWeb_orcat3() {
			return web_orcat3;
		}
		public void setWeb_orcat3(float web_orcat3) {
			this.web_orcat3 = web_orcat3;
		}
		public String getWeb_metat() {
			return web_metat;
		}
		public void setWeb_metat(String web_metat) {
			this.web_metat = web_metat;
		}
		public String getWeb_metad() {
			return web_metad;
		}
		public void setWeb_metad(String web_metad) {
			this.web_metad = web_metad;
		}
		public String getWeb_urla() {
			return web_urla;
		}
		public void setWeb_urla(String web_urla) {
			this.web_urla = web_urla;
		}
		public String getWeb_h1() {
			return web_h1;
		}
		public void setWeb_h1(String web_h1) {
			this.web_h1 = web_h1;
		}
		public String getWeb_h2_1() {
			return web_h2_1;
		}
		public void setWeb_h2_1(String web_h2_1) {
			this.web_h2_1 = web_h2_1;
		}
		public String getWeb_h2_2() {
			return web_h2_2;
		}
		public void setWeb_h2_2(String web_h2_2) {
			this.web_h2_2 = web_h2_2;
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
			Articulo other = (Articulo) obj;
			return Objects.equals(cod, other.cod);
		}
		@Override
		public String toString() {
			return "AlmacenXX [cod=" + cod + ", nom=" + nom + ", fam=" + fam + ", obs=" + obs + ", min=" + min + ", max="
					+ max + ", med=" + med + ", uni=" + uni + ", cla=" + cla + ", iva=" + iva + ", ubi=" + ubi + ", rea="
					+ rea + ", rep=" + rep + ", cos=" + cos + ", pba=" + pba + ", dtocom1=" + dtocom1 + ", dtocom2="
					+ dtocom2 + ", dtoven1=" + dtoven1 + ", dtoven2=" + dtoven2 + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3="
					+ dt3 + ", dt4=" + dt4 + ", dt5=" + dt5 + ", co1=" + co1 + ", co2=" + co2 + ", co3=" + co3 + ", co4="
					+ co4 + ", co5=" + co5 + ", pmc=" + pmc + ", upc=" + upc + ", ufc=" + ufc + ", pro=" + pro + ", pmv="
					+ pmv + ", upv=" + upv + ", ufv=" + ufv + ", exi=" + exi + ", vai=" + vai + ", ent=" + ent + ", ptc="
					+ ptc + ", sal=" + sal + ", ptv=" + ptv + ", ma1=" + ma1 + ", ma2=" + ma2 + ", ma3=" + ma3 + ", ma4="
					+ ma4 + ", ma5=" + ma5 + ", d01=" + d01 + ", d02=" + d02 + ", d03=" + d03 + ", d04=" + d04 + ", d05="
					+ d05 + ", cuc=" + cuc + ", cuv=" + cuv + ", bar=" + bar + ", p21=" + p21 + ", p22=" + p22 + ", p23="
					+ p23 + ", p24=" + p24 + ", p25=" + p25 + ", iv2=" + iv2 + ", ima=" + ima + ", abr=" + abr + ", coi="
					+ coi + ", di1=" + di1 + ", di2=" + di2 + ", sec=" + sec + ", tem=" + tem + ", ide=" + ide + ", tra="
					+ tra + ", coe=" + coe + ", eim=" + eim + ", gru=" + gru + ", pos=" + pos + ", fot=" + fot + ", trazab="
					+ trazab + ", medida=" + medida + ", num_med=" + num_med + ", med_1=" + med_1 + ", med_2=" + med_2
					+ ", med_3=" + med_3 + ", bultos=" + bultos + ", paquet=" + paquet + ", impues=" + impues + ", art_imp="
					+ art_imp + ", sum_imp=" + sum_imp + ", fac_can=" + fac_can + ", fac_imp=" + fac_imp + ", fec_cre="
					+ fec_cre + ", obsole=" + obsole + ", per_com=" + per_com + ", per_ven=" + per_ven + ", peso=" + peso
					+ ", volumen=" + volumen + ", men_sto=" + men_sto + ", con_sto=" + con_sto + ", marca1=" + marca1
					+ ", marca2=" + marca2 + ", ped_tex=" + ped_tex + ", ped_cos=" + ped_cos + ", env=" + env + ", v01="
					+ v01 + ", v02=" + v02 + ", v03=" + v03 + ", v04=" + v04 + ", v05=" + v05 + ", v06=" + v06 + ", v07="
					+ v07 + ", v08=" + v08 + ", v09=" + v09 + ", v10=" + v10 + ", v11=" + v11 + ", v12=" + v12
					+ ", ctadevcom=" + ctadevcom + ", ctadevven=" + ctadevven + ", ctadtocom=" + ctadtocom + ", ctadtoven="
					+ ctadtoven + ", meses=" + meses + ", imaweb=" + imaweb + ", fabpro=" + fabpro + ", fabtip=" + fabtip
					+ ", nse=" + nse + ", historia=" + historia + ", art_minped=" + art_minped + ", art_subfam="
					+ art_subfam + ", art_marca=" + art_marca + ", web_nov=" + web_nov + ", web_fealno=" + web_fealno
					+ ", web_des=" + web_des + ", coefici=" + coefici + ", web_sub=" + web_sub + ", web_actd=" + web_actd
					+ ", web_acth=" + web_acth + ", divs1=" + divs1 + ", divs2=" + divs2 + ", web_cat1=" + web_cat1
					+ ", web_cat2=" + web_cat2 + ", web_cat3=" + web_cat3 + ", ntv=" + ntv + ", agr=" + agr + ", com=" + com
					+ ", hor=" + hor + ", come=" + come + ", tim=" + tim + ", dos=" + dos + ", num_pro=" + num_pro
					+ ", num_com=" + num_com + ", csi=" + csi + ", inc_pre=" + inc_pre + ", inc_red=" + inc_red
					+ ", web_orcat1=" + web_orcat1 + ", web_orcat2=" + web_orcat2 + ", web_orcat3=" + web_orcat3
					+ ", web_metat=" + web_metat + ", web_metad=" + web_metad + ", web_urla=" + web_urla + ", web_h1="
					+ web_h1 + ", web_h2_1=" + web_h2_1 + ", web_h2_2=" + web_h2_2 + ", sincro=" + sincro + "]";
		}

	}

