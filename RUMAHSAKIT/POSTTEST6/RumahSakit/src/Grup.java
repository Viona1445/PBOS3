package RumahSakit;

public class Grup extends Daftar{
    int jumlahAnggota;

    public Grup(String nama, String Penyakit, String judul, int urut, int jumlahAnggota){
        super(nama, penyakit, judul, urut);
        this.jumlahAnggota = jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }
}
