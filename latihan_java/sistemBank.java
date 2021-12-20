package kasus;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

import java.util.InputMismatchException;

public class sistemBank {
    private static int antrian[] = new int[5];
    private static int isi = 0;

    // cek penyimpanan
    private static boolean cekPenyimpanan() {
        if (isi < antrian.length) {
            return true;
        } else {
            return false;
        }
    }

    // membuat antian
    private static void membuatAntrian() {
        int loop = 0;
        int foo = 0;
        while (loop == 0) {
            System.out.print("masukan data : ");
            Scanner fooX = new Scanner(System.in);
            try {
                foo = fooX.nextInt();
                loop = 1;
            } catch (InputMismatchException e) {
                System.out.print("Data harus angka!!");
                loop = 0;
            }
        }
        antrian[isi] = foo;
        isi++;
    }

    // menghapus satu antrian
    private static void hapusAntrian() {
        isi--;
        for (int i = 0; i < isi; i++) {
            antrian[i] = antrian[i + 1];
        }
        System.out.print("satu data berhasil dihapus !!");
    }

    // menghapus semu data
    private static void hapusSemuaAntrian() {
        isi = 0;
    }

    // menu aplikasi
    private static void menuAplikasi() {
        int menuPilihan = 0;
        int pilih = 0;
        while (menuPilihan == 0) {
            System.out.println("Program Antrian Bank : ");
            System.out.println("1.Tambah antrian");
            System.out.println("2.hapus 1 antrian ");
            System.out.println("3.hapus semua antrian");
            System.out.println("4.Ststus antrian ");
            System.out.println("5.isi antrian ");
            System.out.println("6.keluar");
            System.out.print("masukan pilihan anda(1-4): ");
            Scanner pilihX = new Scanner(System.in);
            try {
                pilih = pilihX.nextInt();
                menuPilihan = 1;
            } catch (InputMismatchException e) {
                System.out.println("Data harus angka!!");
                menuPilihan = 0;
            }
        }
        System.out.println("");
        pilihan(pilih);
    }

    // menampilkan isi antrian
    private static void isiAntrian() {
        System.out.print("isi dalam antrian : ");
        for (int i = 0; i < isi; i++) {
            System.out.println("[" + i + "=>" + antrian[i] + "]");
        }
        System.out.println("");
    }

    // handle pilihan user
    private static void pilihan(int pilihan) {
        switch (pilihan) {
            case 1:
                // cek isi penyimpanan antrian
                boolean cek = cekPenyimpanan();
                if (cek) {
                    membuatAntrian();
                } else {
                    System.out.print("antrian penuh, silahkan kosongkan!!");
                }
                break;

            case 2:
                hapusAntrian();
                break;
            case 3:
                hapusSemuaAntrian();
                break;
            case 4:
                System.out.println("Status Antrian : ");
                System.out.println("Antrian : " + antrian.length);
                System.out.println("isi : " + isi);
                break;
            case 5:
                isiAntrian();
                break;
            case 6:
                keluar();
                break;
        }
        menuAplikasi();
    }

    private static void keluar() {
        String keluar = "y";
        System.out.print("Apakah anda ingiin keluar (Y/T)? : ");
        keluar = new Scanner(System.in).nextLine();
        if (keluar.equals("y")) {
            System.exit(0);
        } else {
            menuAplikasi();
        }
    }

    public static void main(String[] args) {
        menuAplikasi();
    }
}
