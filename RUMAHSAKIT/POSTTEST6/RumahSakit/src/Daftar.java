package RumahSakit;

public class Daftar {
    String nama;
    String Penyakit;
    String judul;
    int urut;
    int jumlahAnggota;
    int jumlahArtis;

    public Daftar(String nama, String penyakit, String judul, int urut){
        this.nama = nama;
        this.penyakit = penyakit;
        this.judul = judul;
        this.urut = urut;

        this.jumlahAnggota = jumlahAnggota;

        this.jumlahArtis = jumlahPasien;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setpenynakit(String agensi) {
        this.penyakit = penyakit;
    }

    public String setpenyakit() {
        return penyakit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setUrut(int urut) {
        this.urut = urut;
    }

    public int getUrut() {
        return urut;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahPasien(int jumlahPasien) {
        this.jumlahPasien = jumlahPasien;
    }

    public int getJumlahPasien() {
        return jumlahPasien;
    }
}
