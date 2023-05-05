package Odevler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _3_Soru_9 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int [] sayilar = {15 , 25, 22, 18, 30};
        Arrays.sort(sayilar);
        System.out.println(sayilar[sayilar.length-2]);
    }
}
