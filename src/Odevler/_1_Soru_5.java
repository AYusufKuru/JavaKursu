package Odevler;

public class _1_Soru_5 {
    public static void main(String[] args) {
        //100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.
        int sayac = 0;
        int toplam = 0;
        while (sayac < 100){
            if (sayac % 10 == 5){
                toplam++;
                sayac++;
            }
            else
                sayac++;
        }
        System.out.println("Girilen sayılardan " + toplam + " tanesinin 1 ler basamağı 5 tir");
    }
}
