package _Nots_;

public class _Methods {
    public static void main(String[] args) {
    int sayi = 15;

    String str = "Armut";

    methodsTanim(sayi,str); //methods çağırma.
    /**
     Aynı proje içinde tüm classlarda kullanabilirim.

     PaketAdı.ClassAdı.MethodAdı();
     _Nots_.Methods.methodsTanim(sayi,str);
     **/
    }

    public static void methodsTanim(int a,String b){ //döndüreceği derğer/isim/alıcağı parametreler

        System.out.println(a+" "+b);
    }

    public static void methods1(){ //Herhangi bir değer döndürmüyo.

    }
    public static int methods2(){ //int değer döndürür.
        int a = 0;
        return a; // çağırılınca a değerini döndürür.
    }
    public static String methods3(){ //String değer söndürür.
        String a = "Elma";
        return a;
    }

            /** Girilelecek Parametre Sayısı Belli Değilse **/
    // ... ile ilgili kurallar
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı
    // gelen kaç sayı olursa olsun hepsini al sizi şeklinde metoda al

    public static int methods4(int...sayilar){ //Gelen parametreleri dizi haline getirir.
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        return toplam;
    }

                /** Parametre Sayısına Ve Tipime Göre Ayırma **/
    //aynı isimde farklı method parametre sayısına veya tipine göre ayırt edilir.

    public static int toplamBul(int a,int b){ //çağırılırken 2 parametre girilirse bu çalışır.
        int toplam = a + b;
        return toplam;
    }
    public static int toplamBul(int a,int b,int c) { //çağırılırken 3 parametre girilirse bu çalışır.
        int toplam =a + b + c ;
        return toplam;
    }
    public static String toplamBul(String ad, String soyad) { //çağırılırken String bir parametre girilirse bu çalışır.
        return ad+" "+soyad;
    }

}




