package Odevler;

public class _3_Soru_3 {
    public static void main(String[] args) {
        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        int[] sayilar = {25,30,30,35,100};
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            
            toplam += sayilar[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
