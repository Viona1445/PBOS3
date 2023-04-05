package posttest5;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public final class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //arraylist grup
        ArrayList<Daftar> listGrup = new ArrayList<>();

        //arraylist soloduo
        ArrayList<Daftar> listSoldu = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);

        Boolean ulang;
        String option;
        final String greet = "Berikut adalah list penampilan hari ini";
        Grup gr = new Grup() {
            @Override
            void setJumlahArtis(int jumlahArtis) {

            }

            @Override
            int getJumlahArtis() {
                return 0;
            }
        };
        SoloDuo sd = new SoloDuo() {
            @Override
            void setJumlahAnggota(int jumlahAnggota) {

            }

            @Override
            int getJumlahAnggota() {
                return 0;
            }
        };

        ulang = true;
        while (ulang) {
            menuAwal();
            System.out.println("""
                    === Penampilan Hari Ini ===
                    1. Tambah Data
                    2. Lihat Data
                    3. Edit Data
                    4. Hapus Data
                    5. Exit
                    """);
            System.out.println("Masukkan Pilihan : ");
            int pilih = Integer.parseInt(input.readLine());
            switch (pilih) {
                case 1:
                    //tambah data
                    System.out.println("=== Tambah Data ====");
                    System.out.println("""
                            1. Tambah Data Grup
                            2. Tambah Data Solo & Duo
                            """);
                    int select = Integer.parseInt(input.readLine());

                    if (select == 1) {
                        //Tambah Data Grup
                        System.out.println("Nama Artis : ");
                        String nama = input.readLine();

                        System.out.println("Nama Agensi : ");
                        String agensi = input.readLine();

                        System.out.println("Judul Lagu : ");
                        String judul = input.readLine();

                        System.out.println("Urutan Tampil : ");
                        int urut = Integer.parseInt(input.readLine());

                        System.out.println("Jumlah Anggota : ");
                        int jumlahAnggota = Integer.parseInt(input.readLine());

                        listGrup.add(new Grup(nama, agensi, judul, urut, jumlahAnggota) {
                            @Override
                            void setJumlahArtis(int jumlahArtis) {

                            }

                            @Override
                            int getJumlahArtis() {
                                return 0;
                            }
                        });
                    } else {
                        //Tambah Data Solo & Duo
                        System.out.println("Nama Artis : ");
                        String nama = input.readLine();

                        System.out.println("Nama Agensi : ");
                        String agensi = input.readLine();

                        System.out.println("Judul Lagu : ");
                        String judul = input.readLine();

                        System.out.println("Urutan Tampil : ");
                        int urut = Integer.parseInt(input.readLine());

                        System.out.println("Jumlah Artis : ");
                        int jumlahArtis = Integer.parseInt(input.readLine());

                        listSoldu.add(new SoloDuo(nama, agensi, judul, urut, jumlahArtis) {
                            @Override
                            void setJumlahAnggota(int jumlahAnggota) {

                            }

                            @Override
                            int getJumlahAnggota() {
                                return 0;
                            }
                        });

                    }
                    break;
                case 2:
                    //Lihat Data
                    System.out.println("=== Lihat Data ====");
                    System.out.println("""
                            1. Lihat Data Grup
                            2. Lihat Data Solo & Duo
                            """);
                    int slc = Integer.parseInt(input.readLine());

                    System.out.println(gr.pembukaan(greet));

                    if (slc == 1) {
                        //Lihat data grup
                        for (int i = 0; i < listGrup.size(); i++) {
                            System.out.print(i + 1 + "\t");
                            System.out.print("Nama Grup : " + listGrup.get(i).getNama() + "\n");
                            System.out.print("Nama Agensi : " + listGrup.get(i).getAgensi() + "\n");
                            System.out.print("Judul Lagu : " + listGrup.get(i).getJudul() + "\n");
                            System.out.print("Urutan Tampil : " + listGrup.get(i).getUrut() + "\n");
                            System.out.print("Jumlah Anggota : " + listGrup.get(i).getJumlahAnggota() + "\n");
                        }
                    } else {
                        for (int i = 0; i < listSoldu.size(); i++) {
                            System.out.print(i + 1 + "\t");
                            System.out.print("Nama Artis : " + listSoldu.get(i).getNama() + "\n");
                            System.out.print("Nama Agensi : " + listSoldu.get(i).getAgensi() + "\n");
                            System.out.print("Judul Lagu : " + listSoldu.get(i).getJudul() + "\n");
                            System.out.print("Urutan Tampil : " + listSoldu.get(i).getUrut() + "\n");
                            System.out.print("Jumlah Artis : " + listSoldu.get(i).getJumlahArtis() + "\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("=== Edit Data ====");
                    System.out.println("""
                            1. Edit Data Grup
                            2. Edit Data Solo & Duo
                            """);
                    int sel = Integer.parseInt(input.readLine());

                    if (sel == 1) {
                        //edit data grup
                        System.out.println("Masukkan nama grup yang ingin diedit : ");
                        String cariGrup = input.readLine();

                        for (int i = 0; i < listGrup.size(); i++) {
                            if (listGrup.get(i).getNama().equals(cariGrup)) {
                                System.out.println("Nama Grup : ");
                                listGrup.get(i).setNama(input.readLine());

                                System.out.println("Nama Agensi : ");
                                listGrup.get(i).setAgensi(input.readLine());

                                System.out.println("Judul Lagu : ");
                                listGrup.get(i).setJudul(input.readLine());

                                System.out.println("Urutan Tampil : ");
                                listGrup.get(i).setUrut(Integer.parseInt(input.readLine()));

                                System.out.println("Jumlah Anggota : ");
                                listGrup.get(i).setJumlahAnggota(Integer.parseInt(input.readLine()));
                            } else {
                                System.out.println("Nama Grup yang anda masukkan tidak ada di daftar!!!");
                            }
                        }
                    } else {
                        System.out.println("Masukkan nama Artis yang ingin diedit : ");
                        String cariSoldu = input.readLine();

                        for (int i = 0; i < listSoldu.size(); i++) {
                            if (listSoldu.get(i).getNama().equals(cariSoldu)) {
                                System.out.println("Nama Artis : ");
                                listSoldu.get(i).setNama(input.readLine());

                                System.out.println("Nama Agensi : ");
                                listSoldu.get(i).setAgensi(input.readLine());

                                System.out.println("Judul Lagu : ");
                                listSoldu.get(i).setJudul(input.readLine());

                                System.out.println("Urutan Tampil : ");
                                listSoldu.get(i).setUrut(Integer.parseInt(input.readLine()));

                                System.out.println("Jumlah Artis : ");
                                listSoldu.get(i).setJumlahArtis(Integer.parseInt(input.readLine()));
                            } else {
                                System.out.println("Nama Artis yang anda masukkan tidak ada di daftar!!!");
                            }
                        }
                    } break;
                case 4:
                    System.out.println("=== Hapus Data ====");
                    System.out.println("""
                            1. Hapus Data Grup
                            2. Hapus Data Solo & Duo
                            """);
                    int del = Integer.parseInt(input.readLine());

                    if (del == 1) {
                        System.out.println("Masukkan nama Grup yang ingin dihapus : ");
                        String hapusGrup = input.readLine();

                        for (int i = 0; i < listGrup.size(); i++) {
                            if (listGrup.get(i).getNama().equals(hapusGrup)) {
                                listGrup.remove(i);
                            }
                        }
                    } else {
                        System.out.println("Masukkan nama Artis yang ingin dihapus : ");
                        String hapusSoldu = input.readLine();

                        for (int i = 0; i < listSoldu.size(); i++) {
                            if (listSoldu.get(i).getNama().equals(hapusSoldu)) {
                                listSoldu.remove(i);
                            }
                        }
                    } break;
                case 5:
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);
                    break;
            }
        }
    }


    public static final String menuAwal() {
        int option;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("\n\n");
        System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n");
        System.out.println("           || SISTEM || MANAJEMEN || RUMAH SAKIT ||             ");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                           "██ ▄▄▀██ ██ ██ ▄▀▄ █ ▄▄▀██ ██ ████ ▄▄▄ █ ▄▄▀██ █▀▄█▄ ▄█▄▄ ▄▄██\n" +
                           "██ ▀▀▄██ ██ ██ █ █ █ ▀▀ ██ ▄▄ ████▄▄▄▀▀█ ▀▀ ██ ▄▀███ ████ ████\n" +
                           "██ ██ ██▄▀▀▄██ ███ █ ██ ██ ██ ████ ▀▀▀ █ ██ ██ ██ █▀ ▀███ ████\n" +
                           "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n");
        System.out.println("1. Penampilan Hari Ini");
        System.out.println("2. Exit Program");
        System.out.print("Masukan Pilihan : ");
        option = Integer.parseInt(input.nextLine());
        if (option == 1){
            new Main();
        }else{
            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
            System.exit(0);
        }
        //return option;
        return null;
    }
}