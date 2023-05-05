package Odevler;

import java.util.Scanner;

public class _3_Soru_2 {
    public static void main(String[] args) {
        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.

        String str1 = "Hello World";
        String str2 = "";

        int length = str1.length();

        for (int i = length - 1 ; i >= 0 ; i--) {
            str2 = str2 + str1.charAt(i);
        }

        System.out.println("Stringin tersi: " + str2);
    }
}
