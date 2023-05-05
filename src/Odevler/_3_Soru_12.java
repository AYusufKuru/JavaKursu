package Odevler;

import java.util.Arrays;

public class _3_Soru_12 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.

        String[] strArray = {"Apple" , "Orange" , "Banana" , "Pineapple"};
        Arrays.sort(strArray);
        int sayilar = Arrays.binarySearch(strArray,"Apple");
        if (sayilar >= 0)
            System.out.println("ture");
        else
            System.out.println("false");

                /**loops kullanarak**/
                boolean bool = false;
        for (int i = 0; i < strArray.length-1; i++) {

            if (strArray[i] == "Apple"){
                System.out.println("true");
                bool = true;
            }
        }
        if (bool == false)
            System.out.println("false");
    }
}
