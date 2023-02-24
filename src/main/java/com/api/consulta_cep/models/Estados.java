package com.api.consulta_cep.models;
import java.util.ArrayList;


public class Estados {
    

	ArrayList<String> regiaoNorte = new ArrayList<String>(){
        {
         add("AM");
         add("RR");
         add("AP");
         add("PA");
         add("TO");
         add("RO");
        }

    };
    ArrayList<String> regiaoNordeste = new ArrayList<String>(){
        {
            add("MA");
            add("PI");
            add("CE");
            add("RN");
            add("PE");
            add("PB");
            add("SE");
            add("AL");
            add("BA");
        }
    };
    ArrayList<String> regiaoCentroOeste = new ArrayList<String>(){
        {
         add("MT");
         add("MS");
         add("GO");
         add("DF");
        }

    };
    ArrayList<String> regiaoSudeste = new ArrayList<String>(){
        {
         add("SP");
         add("RJ");
         add("ES");
         add("MG");
        }

    };
    ArrayList<String> regiaoSul = new ArrayList<String>(){
        {
         add("RS");
         add("SC");
         add("PR");
        }

    };


    public ArrayList<String> getRegiaoSul() {
		return regiaoSul;
	}
    public ArrayList<String> getRegiaoNorte() {
		return regiaoNorte;
	}
    public ArrayList<String> getRegiaoNordeste() {
		return regiaoNordeste;
	}
    public ArrayList<String> getRegiaoSudeste() {
		return regiaoSudeste;
	}
    public ArrayList<String> getRegiaoCentroOeste() {
		return regiaoCentroOeste;
	}

}
