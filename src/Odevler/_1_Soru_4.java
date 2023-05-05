package Odevler;

import java.util.Scanner;

public class _1_Soru_4 {
    public static void main(String[] args) {
        //Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;

        while (sayac <= 20){
            System.out.println(sayac + ". sayıyı giriniz = ");
            int sayi = oku.nextInt();

            if (sayi > 10){
                if (sayi < 30){
                    toplam = toplam + sayi;
                    sayac++;
                }
                else {
                    sayac++;
                }
            }
            else {
                sayac++;
            }

        }
        System.out.println("toplam = " + toplam);
    }
}
