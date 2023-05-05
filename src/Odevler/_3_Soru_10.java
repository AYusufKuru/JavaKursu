package Odevler;

import java.util.Arrays;

public class _3_Soru_10 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int [] sayilar = {14 , 19 , 5 , 21};
        Arrays.sort(sayilar);
        System.out.println(sayilar[0]);
    }
}
