package Odevler;

import java.util.Arrays;

public class _3_Soru_11 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int [] sayilar = {12,2,5,15,8};
        Arrays.sort(sayilar);
        System.out.println(sayilar[sayilar.length-1]);
    }
}
