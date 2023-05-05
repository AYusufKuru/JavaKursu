package Odevler;

import java.util.Scanner;

public class _1_Soru_9 {
    public static void main(String[] args) {
        // Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = input.nextInt();
        int tersi = 0;

        while (sayi > 0){
            tersi *= 10;
            tersi += sayi % 10;
            sayi /= 10;
        }
        System.out.println("sayının tersi " + tersi);
    }
}
