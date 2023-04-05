package posttest5;

public abstract class Grup extends Daftar {
    int jumlahAnggota;

    public Grup(String nama, String agensi, String judul, int urut, int jumlahAnggota) {
        super(nama, agensi, judul, urut);
        this.jumlahAnggota = jumlahAnggota;
    }

    public Grup() {
        super();
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public String pembukaan(String greet) {
        return greet;
    }

}
