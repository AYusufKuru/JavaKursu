package Odevler;

public class _4_Soru_4 {
    public static void main(String[] args) {
        //adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli Ters halini yazdırın.
        //Dize: Java yazın dönüş şöyle olmalıdır:  yazın Java

        System.out.println(reverseWord("cümledeki kelimeleri tersine çevirmeli"));
    }

    public static String reverseWord(String str) {
        String reverse = "";
        int sayac = str.length();
        int sayac2 = str.length();

        String str2 = str.replace(" ", "");
        int kelimeSayisi = str.length()-str2.length()+1;

        for (int i = 0; i < kelimeSayisi ; i++) {
            sayac = str.lastIndexOf(" ",sayac);

            if (sayac == -1){
                sayac=0;
                reverse += str.substring(sayac,str.indexOf(" "));
                break;
            }
            else{
                reverse += str.substring(sayac+1,sayac2)+" ";
                sayac2 = sayac;
            }
            sayac--;
        }
        return reverse;
    }

}
