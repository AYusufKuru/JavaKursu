package Odevler;

import java.util.Arrays;

public class _4_Soru_8 {
    public static void main(String[] args) {
        //`append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.
        int[] array1 = {2, 4, 6};
        int[] array2 = {14, 26, 33, 45, 57};
        int[] array3 = {732, 128, 233, 136, 642};
        System.out.println(Arrays.toString(append(array1,array2,array3)));
    }

    public static int[] append(int[] sayilar1 , int [] sayilar2 , int[] sayilar3) {

        int[] array = new int[sayilar1.length+ sayilar2.length+sayilar3.length];

        for(int i=0; i<sayilar1.length; i++) {
            array[i] = sayilar1[i];
        }
        for(int i=0; i<sayilar2.length; i++) {
            array[sayilar1.length+i] = sayilar2[i];
        }
        for(int i=0; i<sayilar3.length; i++) {
            array[sayilar1.length+sayilar2.length+i] = sayilar3[i];
        }
        return array;
        }

}
