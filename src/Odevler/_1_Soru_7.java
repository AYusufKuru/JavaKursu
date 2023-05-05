package Odevler;

import java.util.Scanner;

public class _1_Soru_7 {
    public static void main(String[] args) {
        //Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.
        Scanner oku = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz = ");
        int sayi = oku.nextInt();
        int sayac = 1;
            while (sayac <= 100){
                int birlerBasamak = sayi % 10;
                 sayi = (int)sayi / 10;
                System.out.println(sayac +" basamağı = " + birlerBasamak);
                sayac = sayac * 10;
            }
    }
}
