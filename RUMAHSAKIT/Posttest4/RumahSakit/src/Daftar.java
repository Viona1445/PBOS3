package posttest3;

public class Daftar {
    String nama;
    String Penyakit;
    String judul;
    int urut;
    int jumlahAnggota;
    int jumlahArtis;

    public Daftar(String nama, String penyakit, String judul, int urut){
        this.nama = nama;
        this.agensi = agensi;
        this.judul = judul;
        this.urut = urut;

        this.jumlahAnggota = jumlahAnggota;

        this.jumlahArtis = jumlahArtis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAgensi(String agensi) {
        this.agensi = agensi;
    }

    public String getAgensi() {
        return agensi;
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

    public void setJumlahArtis(int jumlahPasien) {
        this.jumlahPasien = jumlahArtis;
    }

    public int getJumlahArtis() {
        return jumlahArtis;
    }
}
