package com.company;

public abstract  class Dokument {

    private long brojDokumenta;

    public Dokument() {
    }

    public Dokument(long brojDokumenta) {
        this.brojDokumenta = brojDokumenta;
    }

    public long getBrojDokumenta() {
        return brojDokumenta;
    }

    public void setBrojDokumenta(long brojDokumenta) {
        this.brojDokumenta = brojDokumenta;
    }
    public abstract String ispis();
}
