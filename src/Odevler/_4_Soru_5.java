package Odevler;

public class _4_Soru_5 {
    public static void main(String[] args) {
        //EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.

        String str = "1234567890";

        System.out.println(EvenOddNums(str));
    }

    public static int EvenOddNums(String str) {
        int sayi = 0;
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
           sayi= Integer.parseInt(str.substring(i,i+1));
           if (sayi % 2 == 0){
               toplam += sayi;

           }else{
               toplam -= sayi;
           }
        }
        return toplam;
    }
}
