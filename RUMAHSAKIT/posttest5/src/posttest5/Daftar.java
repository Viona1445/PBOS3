package posttest5;

public abstract class Daftar {
    String nama;
    String agensi;
    String judul;
    int urut;
    int jumlahAnggota;
    int jumlahArtis;

    public Daftar(String nama, String agensi, String judul, int urut){
        this.nama = nama;
        this.agensi = agensi;
        this.judul = judul;
        this.urut = urut;

        this.jumlahAnggota = jumlahAnggota;

        this.jumlahArtis = jumlahArtis;
    }

    public Daftar() {
        
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

    abstract void setJumlahAnggota(int jumlahAnggota);

    abstract int getJumlahAnggota();

    abstract void setJumlahArtis(int jumlahArtis);

    abstract int getJumlahArtis();

}


