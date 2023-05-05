package Odevler;

import java.util.Scanner;

public class _4_Soru_7 {
    public static void main(String[] args) {
        //powerOfThree isminde bir method oluşturun.
        //Parametre olarak int Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin.
        // 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Scanner oku = new Scanner(System.in);

        System.out.println("Bir sayı giriniz = ");
        int sayi = oku.nextInt();
        System.out.println(powerOfThree(sayi));
    }

    public static boolean powerOfThree(int a) {
        boolean bool = false;
        for (int i = 1; i <= a; i++) {

            if (a==i*i*i)
                bool = true;

        }

        return bool;
    }
}
