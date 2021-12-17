#include<stdio.h>

int main () {
int pil,umur, harga ,jumlah,total_harga;
float diskon ;
/*
mrmilih hewan dengan ketentuan :
1.kambing jawa
2.domba
*/
printf("masukan pilihan anda : ");
scanf("%i", &pil);
if(pil == 1 ) {
    printf("masukan umur hewan = ");
    scanf("%i", &umur);
    printf("masukan jumlah ekor  = ");
    scanf("%i", &jumlah);
    if(umur <= 3) {
        harga = 600000;
        if(jumlah  == 1 || jumlah == 2 ) {
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 3 && jumlah <= 5) {
            diskon = 0.05 * harga ;
            total_harga = harga * jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 6 && jumlah <= 9  ) {
            diskon = 0.07 *harga ;
            total_harga = harga *jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else{
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }
    }else if (umur <= 6 ) {
            harga = 2000000;
            if(jumlah  == 1 || jumlah == 2 ) {
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 3 && jumlah <= 5) {
            diskon = 0.05 * harga ;
            total_harga = harga * jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 6 && jumlah <= 9  ) {
            diskon = 0.07 *harga ;
            total_harga = harga *jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else{
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }
    }else {
        harga = 3000000;
        if(jumlah  == 1 || jumlah == 2 ) {
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 3 && jumlah <= 5) {
            diskon = 0.05 * harga ;
            total_harga = harga * jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 6 && jumlah <= 9  ) {
            diskon = 0.07 *harga ;
            total_harga = harga *jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else{
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }
    }
}else if (pil == 2){
    printf("masukan umur hewan = ");
    scanf("%i", &umur);
    printf("masukan jumlah ekor  = ");
    scanf("%i", &jumlah);
    if(umur <= 3) {
        harga = 450000;
        if(jumlah  == 1 || jumlah == 2 ) {
            diskon = 0 ;
            total_harga = harga * jumlah ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 3 && jumlah <= 5) {
            diskon = 0.05 * harga ;
            total_harga = harga * jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else if (jumlah >= 6 && jumlah <= 9  ) {
            diskon = 0.07 *harga ;
            total_harga = harga *jumlah - diskon ;
            printf("harga yang harus dibayar = %i",total_harga);
        }else{
            diskon = 0 ;
            total_harga = harga * jumlah ;

        }
    }else if (umur <= 6 ) {
            harga = 1500000;
            if(jumlah  == 1 || jumlah == 2 ) {
            diskon = 0 ;
            total_harga = harga * jumlah ;
        }else if (jumlah >= 3 && jumlah <= 5) {
            diskon = 0.05 * harga ;
            total_harga = harga * jumlah - diskon ;

        }else if (jumlah >= 6 && jumlah <= 9  ) {
            diskon = 0.07 *harga ;
            total_harga = harga *jumlah - diskon ;

        }else{
            diskon = 0 ;
            total_harga = harga * jumlah ;

        }
    }else {
        harga = 2000000;
        if(jumlah  == 1 || jumlah == 2 ) {
            diskon = 0 ;
            total_harga = harga * jumlah ;

        }else if (jumlah >= 3 && jumlah <= 5) {
            diskon = 0.05 * harga ;
            total_harga = harga * jumlah - diskon ;

        }else if (jumlah >= 6 && jumlah <= 9  ) {
            diskon = 0.07 *harga ;
            total_harga = harga *jumlah - diskon ;

        }else{
            diskon = 0 ;
            total_harga = harga * jumlah ;
        }
    }
}else{
    printf("error");
}
puts("==========================================================");
puts(" Pertenakan Mari Berkaya                                  ");
puts(" Jl. Sawi No 26E                                          ");
puts(" Desa Suka Maju-Ciberengkok                               ");
puts(" Telp 0813 3365 4561                                      ");
puts("==========================================================");
puts(" Data Konsumen : ");
printf(" total Harga  : Rp%i", total_harga);

return 0;
}
