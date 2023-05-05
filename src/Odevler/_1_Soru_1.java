package Odevler;

import java.util.Scanner;

public class _1_Soru_1 {
    public static void main(String[] args) {
        //Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;
        while (sayac <= 20){
            System.out.print(sayac + ".sayıyı giriniz = ");
            int sayi = oku.nextInt();
            toplam = toplam + sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
