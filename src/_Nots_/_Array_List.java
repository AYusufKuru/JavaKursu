package _Nots_;

import java.util.ArrayList;
import java.util.Arrays;

public class _Array_List {
    public static void main(String[] args) {

        // ArrayList : boyutunu başta vermeye gerek yok, boyutu başlangıçta 0,
        // eleman ekledikçe artar, sildikçe kısalır.

                       /**   Tanımlama  **/
        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Elma", "Armut", "Muz"));


        isimler.add("Kiraz");                   //---> Eleman ekleme.
        isimler.add(1,"Ayva");     //---> Verılen ındex'e ekler, diğerleri'1 er sıra kayar.

        isimler.set(1,"Zafer");                 //---> Verilen indexdeki elemanı değiştirir.

        isimler.remove(1);                //---> İndexteki değeri siler.
        isimler.remove("Elma");              //---> Girilen değeri diziden siler.

        isimler.contains("Metin");              //---> Girilen değerin listede olup olmadığını kontrol eder(true-false)

        isimler.size();                         //---> Listenin uzunluğunu alma.

        isimler.indexOf("Aynur");               //---> Girilen değerin index numarasını verir.

        isimler.get(0);                         //---> Girilen indexteki elemanı verir.

        isimler.clear();                        //---> Listeyi temizler.

    }


}
