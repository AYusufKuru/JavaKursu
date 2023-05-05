package D_Proje_1;

import java.util.Scanner;

public class Proje_1_2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz = ");
        String isim = oku.next();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        System.out.print(isim + " hoş geldin,soyismini girer misin? = ");
        String soyisim = oku.next();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        String adSoyad = isim + " " + soyisim;

        System.out.println("İsminiz ve Soyisminiz = " + adSoyad);
        String dogruMu;
        do {
            System.out.print("girilen isim ve soy isim doğru  ise 'Y' yazınız = ");
            dogruMu = oku.next();
            if (!dogruMu.equalsIgnoreCase("Y"))
                System.out.println("tercihinizi doğru yapmadınız lütfen tekrar deneyin");

        } while (!dogruMu.equalsIgnoreCase("Y"));
        System.out.println("isim ve soyisim başarılı bir şekilde kayıt edilmiştir.");
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı belirleyiniz = ");
        String kullaniciAdi = oku2.nextLine();

        String sifre;
        String sifreTekrar;
        do {
            System.out.print("Lütfen şifrenizi belirleyiniz = ");
            sifre = oku2.nextLine();

            System.out.print("Şifrenizi tekrar giriniz = ");
            sifreTekrar = oku2.nextLine();
            if (!sifre.equals(sifreTekrar))
                System.out.println("Yanlis veya hatali bir sifre girdiniz,lutfen tekrar deneyin");
        } while (!sifre.equals(sifreTekrar));
        System.out.println("Tebrikler " + kullaniciAdi + " ile sisteme kayıt oldunuz.");

    }
}


