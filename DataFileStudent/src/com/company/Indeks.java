package com.company;

import java.util.ArrayList;
import java.util.List;

public class Indeks extends Dokument {

    private int godinaUpisa;
    private String smer;
    private List<Integer> ocene = new ArrayList();


    public Indeks(int godinaUpisa, String smer, List<Integer> ocene) {
        this.godinaUpisa = godinaUpisa;
        this.smer = smer;
        this.ocene = ocene;
    }

    public Indeks(long brojDokumenta, int godinaUpisa, String smer, List<Integer> ocene) {
        super(brojDokumenta);
        this.godinaUpisa = godinaUpisa;
        this.smer = smer;
        this.ocene = ocene;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public List<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(List<Integer> ocene) {
        this.ocene = ocene;
    }

    // metoda za prosek
    public double izracunajProsek(){
        double suma =0;
        for(int ocena : ocene){
            suma +=ocena;
        }
        double  pro = (suma/ocene.size());
        return pro;

    }

    @Override
    public String toString() {
        return ispis() + " prosecna ocena " + izracunajProsek();
    }

    // retur 2019 123455
    @Override
    public String ispis() {
        return this.godinaUpisa+ " / "+ getBrojDokumenta();
    }
}
