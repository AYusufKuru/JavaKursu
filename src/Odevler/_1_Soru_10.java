package Odevler;

import java.util.Scanner;

public class _1_Soru_10 {
    public static void main(String[] args) {
        //Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = input.nextInt();
        int sayi2 = sayi;
        int tersi = 0;

        while (sayi > 0){
            tersi *= 10;
            tersi += sayi % 10;
            sayi /= 10;
        }
        if (sayi2 == tersi)
            System.out.println("Sayı simetrik sayıdır.");
        else
            System.out.println("Sayı simetrik sayı değildir.");

    }


}
