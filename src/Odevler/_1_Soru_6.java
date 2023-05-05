package Odevler;

import java.util.Scanner;

public class _1_Soru_6 {
    public static void main(String[] args) {
        //Bir sayı bulmaca oyunu yapılmak isteniyor
        // bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //   Eğer bilirse tebrikler yazsın.
        Scanner oku = new Scanner(System.in);
        int tutulanSayi = (int)(Math.random() * 10) + 10;
        int sayac = 1;
        boolean sonuc = false;
        System.out.println("10 ile 20 arasında bir tahminde bulunun.");
        System.out.println("Tutulan sayı = " + tutulanSayi);
        while (sayac < 4){

            System.out.print(sayac + ". Tahmininizi giriniz = ");
            int sayi = oku.nextInt();
            if (sayi == tutulanSayi) {
                sonuc = true;
                break;
            }
            else
                sayac++;
        }

        if (sonuc == false)
            System.out.println("Bilemediniz...");
        else
             System.out.println("Tebrikler bildiniz.");
    }
}
