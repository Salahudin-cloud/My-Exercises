#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main() {
    int pill, harga_total ,bayar, harga, kembali  , kelas_pill,jumlah_penumpang, jumlah_bayar, kembalian,day,month,tahun ;
    char nama[20], kelas_1[] = "Ekonomi" , kelas_2[] = "Bisnis", tujuan_1[] = "Magelang-jakarta", tujuan_2[] = "Magelang-surabaya",
        tujuan_3[] = "Magelang-Bali" , tujuan_4[] = "Magelang-Bandung",tanggal[20] ;
    struct tm *local;
    time_t now ;
    now = time(NULL);
    local = localtime(&now);

    day = local->tm_mday;
    month = local->tm_mon+1;
    tahun = 1900+local->tm_year;
    puts("=============================");
    puts("        Selamat Datang !     ");
    puts("=============================");
    puts("Daftar Wisata : ");
    puts("  No.    ID      Tujuan                 Kelas Ekonomi         kelas Bisnis");
    puts("  1.     WSJ     Magelang-Jakarta       Rp 500.000/orang      Rp 1.100.000/orang");
    puts("  2.     WSS     Magelang-Surabaya      Rp 600.000/orang      Rp 1.400.000/orang");
    puts("  3.     WSB     Magelang-Bali          Rp 900.000/orang      Rp 2.000.000/orang");
    puts("  4.     WSP     Magelang-Bandung       Rp 800.000/orang      Rp 1.800.000/orang");
    puts("================================================================================");
    puts("Keterangan : ");
    puts("untuk memilih kelas silahkakn masukan : ");
    puts("1.kelas Ekonomi ");
    puts("2.kelas bisnis ");
    printf("masukan nama : ");
    gets(nama);
    printf("masukan tanggal penerbangan anda dengan format(DD/MM/YY) : ");
    gets(tanggal);
    printf("masukan pilihan anda (masukan No):");
    scanf("%i",&pill);
    printf("masukan pilihan kelas anda (masukan No):");
    scanf("%i",&kelas_pill);
    printf("masukan jumlah penumpang : ");
    scanf("%i",&jumlah_penumpang);
    if(pill == 1 ) {
        if(kelas_pill == 1 ) {
            harga = 500000;
        }else{
            harga = 11000000;
        }
        jumlah_bayar = harga *jumlah_penumpang ;
        printf("total pembayaran : %i\n", jumlah_bayar);
        printf("masukan pembayaran  :");
        scanf("%i",&bayar);

        kembalian = bayar - jumlah_bayar;
    }else if(pill == 2 ) {
        if(kelas_pill == 1 ) {
            harga = 600000;
        }else{
            harga = 14000000;
        }
        jumlah_bayar = harga *jumlah_penumpang ;
        printf("total pembayaran : %i\n", jumlah_bayar);
        printf("masukan pembayaran  :");
        scanf("%i",&bayar);

        kembalian = bayar - jumlah_bayar;
    }else if(pill == 3 ) {
        if(kelas_pill == 1 ) {
            harga = 900000;
        }else{
            harga = 20000000;
        }
        jumlah_bayar = harga *jumlah_penumpang ;
        printf("total pembayaran : %i\n", jumlah_bayar);
        printf("masukan pembayaran  :");
        scanf("%i",&bayar);

        kembalian = bayar - jumlah_bayar;
    }else if(pill == 4) {
        if(kelas_pill == 1 ) {
            harga = 800000;
        }else{
            harga = 18000000;
        }
        jumlah_bayar = harga *jumlah_penumpang ;
        printf("total pembayaran : %i\n", jumlah_bayar);
        printf("masukan pembayaran  :");
        scanf("%i",&bayar);

        kembalian = bayar - jumlah_bayar;
    }else {
        printf("error");
    }
    puts("===================================================================");
    puts("FORM DETAIL PEMESANAN :");
    puts("===================================================================");
    printf("Nama Penumpang           : %s\n",nama);
    if(pill == 1) {
        printf("Tujuan Wisata            : %s \n",tujuan_1);
    }else if(pill == 2 ) {
        printf("Tujuan Wisata            : %s \n",tujuan_2);
    }else if(pill == 3 ) {
        printf("Tujuan Wisata            : %s \n",tujuan_3);
    }else {
        printf("Tujuan Wisata            : %s \n",tujuan_4);
    }
    printf("Tanggal Pembelian Tiket  : %02d/%02d/%d\n",day,month,tahun);
    printf("Tanggal Penerbangan      : %s\n",tanggal);
    if(kelas_pill == 1 ) {
        printf("Kelas                    : %s \n",kelas_1);
    }else {
        printf("Kelas                    : %s \n",kelas_2);
    }
    printf("Harga                    : Rp %i/orang\n", harga);
    printf("Jumlah Orang             : %i\n",jumlah_penumpang);
    puts("====================================================================");
    puts("DETAIL PEMBAYARAN :");
    puts("====================================================================");
    printf("Jumlah Bayar :Rp %i\n",jumlah_bayar);
    printf("Bayar        :Rp %i\n",bayar);
    printf("Kembali      :Rp %i\n",kembalian);
return 0 ;
}
