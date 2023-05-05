package Odevler;

import java.util.Scanner;

public class _1_Soru_8 {
    public static void main(String[] args) {
        //Girilen bir sayının kaç basamak olduğunu bulunuz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bİr sayı giriniz = ");
        int sayi = oku.nextInt();
        int sayac = 0;
        while (sayi > 0){
            sayi /= 10;
            sayac++;
        }
        System.out.println("Girilen sayı " + sayac + " basamaklıdır.");
    }
}
