package posttest5;

public abstract class SoloDuo extends Daftar{
    int jumlahArtis;

    public SoloDuo(String nama, String agensi, String judul, int urut, int jumlahArtis){
        super(nama, agensi, judul, urut);
        this.jumlahArtis = jumlahArtis;
    }

    public SoloDuo() {

    }

    public void setJumlahArtis(int jumlahArtis) {
        this.jumlahArtis = jumlahArtis;
    }

    public int getJumlahArtis() {
        return jumlahArtis;
    }

}
