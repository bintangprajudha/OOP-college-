package org.example;

public class Main {
    static void main() {

        Dokter dt1 = new Dokter("Grisha", "Mata");
        Dokter dt2 = new Dokter("Faye", "Gigi");
        Dokter dt3 = new Dokter("Zeke", "Teling");

        Pasien ps1 = new Pasien("Historia", 20);
        Pasien ps2 = new Pasien("Sasha", 37);
        Pasien ps3 = new Pasien("Petra", 55);

        Pemesanan[] pm = new Pemesanan[5];
        pm[0] = new Pemesanan(dt1, ps1, "Selasa");
        pm[1] = new Pemesanan(dt2, ps1, "Kamis");
        pm[2] = new Pemesanan(dt2, ps2, "Selasa");
        pm[3] = new Pemesanan(dt3, ps2, "Jumat");
        pm[4] = new Pemesanan(dt1, ps3, "Senin");

        int idx = 1;
        for(Pemesanan p : pm) {
                System.out.println("Urutan ke-" + idx);
                System.out.println("Nama Dokter : " + p.getDokter().getNama());
                System.out.println("Spesialis   : " + p.getDokter().getSpesialis());
                System.out.println("Nama Pasien : " + p.getPasien().getNama() + " (" + p.getPasien().getUmur() + ")");
                System.out.println("Hari        : " + p.getHari());
                System.out.println();
                idx++;
        }


    }
}
