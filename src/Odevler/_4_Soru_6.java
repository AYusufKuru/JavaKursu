package Odevler;

import java.util.Arrays;

public class _4_Soru_6 {
    public static void main(String[] args) {
        //Girilen bir diziyi tersten yazdıran bir metod yazınız.
        String[] array = {"Elma","Armut","Kiraz","Muz","Ayva"};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static String[] reverseArray(String[] array) {
        String[] reverseArray = new String[array.length];
        int sayac = array.length-1;
        for (int i = 0; i < array.length; i++) {

            reverseArray[i] = array[sayac];
            sayac--;
        }
        return reverseArray;
    }
}
