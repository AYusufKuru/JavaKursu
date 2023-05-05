package Odevler;

import java.util.Scanner;

public class _1_Soru_2 {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
        Scanner oku = new Scanner(System.in);

        int sayac = 1;
        int teksayac = 0;
        while (sayac <=20){
            System.out.print(sayac + ". sayıyı giriniz = ");
            int sayi = oku.nextInt();
            if (sayi % 2 == 1){
                teksayac++;
                sayac++;
            }
            else
                sayac++;
        }
        System.out.println(teksayac + " tane tek sayı girdiniz.");
    }
}
