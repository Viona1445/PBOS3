package RumahSakit;

public class SoloDuo extends Daftar{
    int jumlahPasien;

    public SoloDuo(String nama, String Penyakit, String judul, int urut, int jumlahArtis){
        super(nama, penyakit, judul, urut);
        this.jumlahPasien = jumlahPasien;
    }

    public void setJumlahPasien(int jumlahPenyakit) {
        this.jumlahPasien = jumlahPasien;
    }

    public int getJumlahPasien() {
        return jumlahPasien;
    }
}
