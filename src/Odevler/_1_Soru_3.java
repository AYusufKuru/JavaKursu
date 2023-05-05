package Odevler;

import java.util.Scanner;

public class _1_Soru_3 {
    public static void main(String[] args) {
        //Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayı giriniz = ");
        int sayi = oku.nextInt();
        int sayac = 1;
        int toplam = 0;

        while(sayac < sayi){
            toplam = toplam + sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
