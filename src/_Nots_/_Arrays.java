package _Nots_;


import java.util.Arrays;

public class _Arrays {


    public static void main(String[] args) {

                                /*** Arrays ***/

        String[] strArray = new String[5];  //---> Uzunluk vererek dizi tanımlama.
        int[] intArray = {45,3,567};        //---> Elemanları vererek tanımlama.
        int[] intArray2 = {45,3,567};

        strArray[2] = "Armut";              //---> İndex'e girilen elemanı ekler veya değiştirir.;
        String a = strArray[3];             //---> İndexteki elemanı verir.;

                                /*** 2D Arrays ***/

        String [][] tabloArray = new String[3][20];     //---> 3 satir 20 stunlu bir tablo oluşturur.
        int[][] tablo ={                                //---> Elemanları vererek tanımlama.
                {2,3,76},
                {23,54,76,65},   //--->Farkli sayida stun girebilir ama yalinizca diziyi bu sekilde tanimlarsak.
                {11,67,87}
        };

        tabloArray[2][15] = "Elma";                     //---> 2. satırın 15.elemanına girilen elemanı ekler.

                                /*** Arrays Methods ***/

        Arrays.sort(intArray);                 //---> Diziyi sayisal veya sözel sıralar.
        Arrays.toString(intArray);             //---> Diziyi stringe çevirir.
        Arrays.equals(intArray,intArray2);     //---> Dizilerin eşitliğini kontrol eder.(true-false)

    }
}
