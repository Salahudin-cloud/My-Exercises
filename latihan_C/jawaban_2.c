#include<stdio.h>

int main () {
int panjang , lebar , tinggi , alas , jari_jari, luas_persegi_panjang , luas_segitiga;
const float pi = 3.14 ;
float luas_lingkaran, luas_gabungan ;

printf("Menghitung Luas Gabungan \n");
printf("1.menghitung luas persegi panjang \n");
printf("masukan panjang : ");
scanf("%i", &panjang);
printf("masukan lebar : ");
scanf("%i", &lebar);
luas_persegi_panjang = panjang * lebar ;
printf("luas persegi panjang adalah  %i\n", luas_persegi_panjang);
printf("2.menghitung luas segitiga sama sisi \n");
printf("masukan alas : ");
scanf("%i", &alas);
printf("masukan tinggi : ");
scanf("%i", &tinggi);
luas_segitiga = alas * tinggi / 2  ;
printf("luas segitiga adalah  %i\n", luas_segitiga);
printf("3.menghitung luas lingkaran \n");
printf("masukan jari-jari : ");
scanf("%i", &jari_jari);
luas_lingkaran = jari_jari * jari_jari * pi;
printf("luas persegi panjang adalah  %f\n", luas_lingkaran);

luas_gabungan = luas_persegi_panjang + luas_lingkaran + luas_segitiga ;

printf("luas gabungan adalah  %f", luas_gabungan);



return 0;
}
