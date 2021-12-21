package Latihan_2;

import java.util.Scanner;

import javax.crypto.interfaces.DHPublicKey;

import java.util.InputMismatchException;
public class aplikasiPembelianHewanTernak {
private static void satu(int pil) {
    int umur ,jumlah; 
    Scanner a= new Scanner(System.in); 
    System.out.print("Masukan jumlah hewan : ");
    jumlah = a.nextInt(); 
    System.out.print("Masukan Umur Kambing Jawa : ");
    umur = a.nextInt(); 
    if(umur <= 3) {
        umurTigaBulan(jumlah,pil,umur);
    }else if(umur > 3 && umur <= 6 ) {
        umurEnamBulan(jumlah,pil,umur); 
    }else {
        umurDiatasEnamBulan(jumlah,pil,umur);
    }

}
private static void umurTigaBulan(int jumlah, int pil,int umur) {
    int harga , total_harga,diskonn;
    double diskon; 
    //harga kambing jawa 
    if (pil == 1 ) {
        if(jumlah <  3 ) {
            harga = 600000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
    
        }else if (jumlah > 2 && jumlah < 6) {
            harga = 600000; 
            diskon = 0.05 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if(jumlah > 5 && jumlah < 10  ) {
            harga = 600000; 
            diskon = 0.07 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else {
            harga = 600000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }
    }else{ //harga domba 
        if(jumlah <  3 ) {
            harga = 450000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if (jumlah > 2 && jumlah < 6) {
            harga = 450000; 
            diskon = 0.05 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if(jumlah > 5 && jumlah < 10  ) {
            harga = 450000; 
            diskon = 0.07 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else {
            harga = 450000;  
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }
    }
}
private static void umurEnamBulan(int jumlah,int pil,int umur ) {
    int harga , total_harga,diskonn;
    double diskon; 
//harga kambing jawa 
    if (pil == 1) {
        if(jumlah <  3 ) {
            harga = 2000000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if (jumlah > 2 && jumlah < 6) {
            harga = 2000000; 
            diskon = 0.05 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if(jumlah > 5 && jumlah < 10  ) {
            harga = 2000000; 
            diskon = 0.07 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn;
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga); 
        }else {
            harga = 2000000; 
            total_harga = harga * jumlah ;
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga); 
        }
    } else {//harga domba 
        if(jumlah <  3 ) {
            harga = 1500000; 
            total_harga = harga * jumlah ;
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga); 
    
        }else if (jumlah > 2 && jumlah < 6) {
            harga = 1500000; 
            diskon = 0.05 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn;
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga); 
        }else if(jumlah > 5 && jumlah < 10  ) {
            harga = 1500000; 
            diskon = 0.07 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn;
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga); 
        }else {
            harga = 1500000; 
            total_harga = harga * jumlah ;
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga); 
        }
    }
}
private static void umurDiatasEnamBulan(int jumlah,int pil, int umur) {
    int harga , total_harga,diskonn;
    double diskon; 
//harga kambing jawa 
    if (pil == 1 ) {
        if(jumlah <  3 ) {
            harga = 3000000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
    
        }else if (jumlah > 2 && jumlah < 6) {
            harga = 3000000; 
            diskon = 0.05 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if(jumlah > 5 && jumlah < 10  ) {
            harga = 3000000; 
            diskon = 0.07 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else {
            harga = 2000000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }
    } else {//harga domba 
        if(jumlah <  3 ) {
            harga = 2000000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
    
        }else if (jumlah > 2 && jumlah < 6) {
            harga = 2000000; 
            diskon = 0.05 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else if(jumlah > 5 && jumlah < 10  ) {
            harga = 2000000; 
            diskon = 0.07 * harga  ;
            diskonn = (int) diskon; 
            total_harga = harga * jumlah - diskonn; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }else {
            harga = 2000000; 
            total_harga = harga * jumlah ; 
            tampilkanPembayaran(total_harga,jumlah,umur,pil,harga);
        }
    }
}
private static void dua(int pil) {
    int umur ,jumlah; 
    Scanner a= new Scanner(System.in); 
    System.out.print("Masukan jumlah hewan : ");
    jumlah = a.nextInt(); 
    System.out.print("Masukan Umur Kambing Jawa : ");
    umur = a.nextInt(); 
    if(umur <= 3) {
        umurTigaBulan(jumlah,pil,umur);
    }else if(umur > 3 && umur <= 6 ) {
        umurEnamBulan(jumlah,pil,umur); 
    }else {
        umurDiatasEnamBulan(jumlah,pil,umur);
    }

}
 private static void menuProgram() {
     int pil = 0 ; 
     int loop = 0; 
     while(loop == 0 ) {
         System.out.println("Halo Selamat Datang !! ");
         System.out.println("Daftar Harga Kambing : ");
         System.out.println("No.       Id_Jenis     Jenis_Kambing/Domba      ≤3 Bulan           ≤6 Bulan          >6 Bulan");
         System.out.println("1.           K1           Kambing Jawa          Rp. 600.000        Rp. 2.000.000     Rp. 3.000.000");
         System.out.println("2.           D1           Domba                 Rp. 450.000        Rp. 1.500.000     Rp. 2.000.000");
         System.out.println("3.Keluar ");
         System.out.print("Masukan pilihan anda(masukan angka 1-2) : ");
         Scanner scan = new Scanner(System.in); 
         try{
             pil = scan.nextInt(); 
             loop = 1; 
         }catch(InputMismatchException e){
             System.out.println("Masukan angka !!"); 
             loop =0 ; 
         }
         pilihan(pil); 
     }
    }
    private static void pilihan(int pil) {
        switch (pil) {
            case 1:
                satu(pil);
                break;
            case 2:
                dua(pil);
                break;
            case 3:
                keluar();
                break;
        }
    }
    private static void tampilkanPembayaran(int total_harga, int jumlah , int umur,int pil,int harga ) {
        System.out.println("");
        System.out.println("");
        System.out.println("Informasi Pembayaran  : "); 
        System.out.println("========================================");
        if(pil == 1 ) {
            System.out.println("Jenis Hewan : Kambing Jawa ");
        }else {
            System.out.println("Jenis Hewan : Domba");
        }
        System.out.println("Jumlah Ekor : "+ jumlah);
        System.out.println("Umur Hewan  : "+ umur);
        System.out.println("Harga : Rp. " + harga);
        System.out.println("Total Pembayaran : " + harga + " x" + jumlah + " = Rp." + total_harga );

    }
    private static void keluar() {
        String keluar = "y"; 
        System.out.print("Apakah anda ingin keluar ? (y/t) : "); 
        keluar = new Scanner(System.in).nextLine();
        if(keluar.equalsIgnoreCase("y")){
            System.exit(0);
        }else {
            menuProgram();
        }
    }
    public static void main(String[] args) {
        menuProgram();
    }
}
