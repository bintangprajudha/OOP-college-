package org.example;

public class Mahasiswa {
    String nama;
    Prodi prodi;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }
    public String getNama() {
        return this.nama;
    }
    public String getProdi() {
        return this.prodi.getNama();
    }

    public void displayMahasiswa(){
        System.out.println("Nama: "+ this.getNama());
        System.out.println("Prodi: "+ this.getProdi());
    }
}
