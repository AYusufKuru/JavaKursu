package _Nots_;

public class _String_Methods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Merhaba DÜnya";

        str1.length();        //--Stringin uzunluğunu verir.
        str1.concat(str2);    //--Değerleri birleştirir. concat("Dünya") şeklinde de yazılabilir
        str1.contains("a");  //--Değerin olup olmadığını kontrol eder.(true-false)
        str2.charAt(3);       //--3. index'teki karakteri verir.(char döndürür)

        str1.toUpperCase();   //--Bütün harflari büyük harfe döndürür.
        str2.toLowerCase();   //--Bütün harflari küçük harfe döndürür.

        str2.replace("a","b");  //--a lari b ile değiştirir.
        str1.replaceFirst("er", "d");  //--sadece ilk değeri değiştirir.

        str1.startsWith("Hel"); //--Değeri ile başlayıp başlamadığını kontrol eder.(true-false)
        str2.endsWith("ya");    //-- Değeri ile bitip bitmediğini kontrol eder.(true- false)

        str1.isEmpty();       //--Boş olup olmadığına bakar.(true-false)
        str1.substring(3, 9); //--3 nolu indexten başlar 9 nolu indexe kadar olan yeri alır.(9 hariç)
        str1.substring(3); // 3 den başlayıp sona kadar gider.

        str1.equals(str2);    //--Eşit olup olmadığını kontrol eder.(true- false)
        str1.equalsIgnoreCase(str2); //--Büyük küçük harf fark etmez.

        str1.indexOf("llo",2); //--Değeri aramaya 2 nolu indexten başlar.
        str1.indexOf("o");    //--Değerin index numarısını verir;
        str1.lastIndexOf("b");  //--Aramaya sondan başlar.

        /****************************---replaceAll---****************************************/
        String text="Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali
        System.out.println("abn -> _  = " + text.replaceAll("[abn]","_"));
        // a veya b veya n leri _ yap    ->  Merh___ Dü_y_123

        System.out.println("A-Z -> _  = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar büyük harfleri _ yap  ->  _erhaba _ünya123

        System.out.println("0-9 -> _  = " + text.replaceAll("[0-9]",""));
        // rakamları sil  ->  Merhaba Dünya

        System.out.println("0-9 dışındakile -> _  = " + text.replaceAll("[^0-9]",""));
        // rakamları dışındakileri sil  ->  123
        /*************************************************************************************/


        //equalsIgnoreCase

    }
}
