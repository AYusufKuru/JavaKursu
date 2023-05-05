package _Nots_;

public class _Java_Operators {
    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;
        boolean bool;


        //  &&  ve işareti
        //  ||  veya işareti

        /************************************************************/

        sayi1 += sayi2; //--> sayi1 = sayi1 + sayi2
        sayi1 -= sayi2; //--> sayi1 = sayi1 - sayi2
        sayi1 /= sayi2; //--> sayi1 = sayi1 / sayi2
        sayi1 *= sayi2; //--> sayi1 = sayi1 * sayi2

        /************************************************************/

        bool = sayi1 == sayi2;  //--> Eşit mi?        (true)
        bool = sayi1 != 0;      //--> Farklı mı?      (false)
        bool = sayi1 < sayi2;   //--> Küçük mü?       (false)
        bool = sayi1 > -1;      //--> Büyük mü ?      (true)
        bool = sayi1 >= 5;      //--> Büyük eşit mi?  (false)
        bool = sayi1 <= sayi2;  //--> Küçük eşit mi?  (true)

        /************************************************************/

        sayi1 = 5 + 9; //--> Toplama
        sayi1 = 5 - 9; //--> Çıkarma
        sayi1 = 5 / 9; //--> Bölme
        sayi1 = 5 * 9; //--> Çarpma
        sayi1 = 8 % 2; //--> Mod alma(2 ye bölümünden kalanı verir.)

        /************************************************************/

        sayi1 = sayi1 + 1;  // sayacın değerini 1 tane artırıyor
        sayi1++;            // sayacın değerini 1 tane artırıyor
        ++sayi1;            // sayacın değerini 1 tane artırıyor (Artırma işlemini önce yapar)

        sayi1 = sayi1 - 1;  // sayacın değerini 1 tane azaltır
        sayi1--;            // sayacın değerini 1 tane azaltır
        --sayi1;            // sayacın değerini 1 tane azaltır (Eksiltme işlemini önce yapar)
    }
}
