package org.example;

public class Pemesanan {
    Dokter dokter;
    Pasien pasien;
    String hari;

    public Pemesanan(Dokter dokter, Pasien pasien, String hari) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.hari = hari;
    }


    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public Dokter getDokter() {
        return dokter;
    }
    public Pasien getPasien() {
        return pasien;
    }


    public String getHari() {
        return hari;
    }
}
