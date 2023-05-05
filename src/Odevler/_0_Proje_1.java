package Odevler;

import java.util.Scanner;

public class _0_Proje_1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String Y ;
        String sifre1;
        String sifre2;

        System.out.print("Merhaba, Lütfen isminizi giriniz...:");
        String ad= oku.next();

        System.out.print(bykHrf(ad)+" Hoşgeldin, soyismini girer misiniz?");
        String soyAd = oku.next();

        for (int i = 0; i >=0 ; i++) {
            System.out.print(bykHrf(ad)+" "+bykHrf(soyAd)+" isminiz doğru ise devam etmek icin 'Y' tusuna basiniz...");
            Y = oku.next();
            if (Y.toUpperCase().equals("Y") == true) {
                System.out.println("İsim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");
                break;
            }
            System.out.println("Tercihinizi doğru yapmadınız... Lütfen tekrar deneyin...");
        }
        System.out.print("Lutfen kullanıcı adınızı belirleyin...:");
        String kulAd = oku.next();

        for (int i = 0; i >= 0 ; i++) {
            System.out.print("Lütfen sifrenizi belirleyiniz...:");
            sifre1 = oku.next();
            System.out.print("Sifrenizi tekrar giriniz...:");
            sifre2= oku.next();

            if (sifre1.equals(sifre2)== true){
                System.out.println("Tebrikler... " + kulAd+ " kullanıcı adıyla sisteme kayıt oldunuz...");
                break;
            }
            System.out.println("Yanlış veya hatalı bir şifre girdiniz, Lütfen tekrar deneyiniz...");
        }


    }
    public static String bykHrf(String a)
    {
        return (((a.substring(0,1)).toUpperCase())+a.substring(1));
    }
}
