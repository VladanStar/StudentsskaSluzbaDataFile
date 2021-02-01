package com.company;

public class Student implements Comparable {

    private String ime;
    private Indeks indeks;
    private int uzrast;
    private int godinaStudija;

    public Student() {
    }

    public Student(String ime, Indeks indeks, int uzrast, int godinaStudija) {
        this.ime = ime;
        this.indeks = indeks;
        this.uzrast = uzrast;
        this.godinaStudija = godinaStudija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Indeks getIndeks() {
        return indeks;
    }

    public void setIndeks(Indeks indeks) {
        this.indeks = indeks;
    }

    public int getUzrast() {
        return uzrast;
    }

    public void setUzrast(int uzrast) {
        this.uzrast = uzrast;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", indeks=" + indeks.toString() +
                ", uzrast=" + uzrast +
                ", godinaStudija=" + godinaStudija +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student drugiStudent = (Student)o;
        if(this.getIndeks().izracunajProsek()>drugiStudent.getIndeks().izracunajProsek()){
            return  1;
        }
        else if(this.getIndeks().izracunajProsek()< drugiStudent.getIndeks().izracunajProsek()){
            return -1;
        }
        return 0;
    }
}
