package Odevler;

public class _2_Soru_3 {
    public static void main(String[] args) {
        // 100'den 0'a kadar bütün tek sayıları yazdırınız.
        int sayac = 99;
        while (sayac > 0){
            if (sayac % 2 == 1){
                System.out.println(sayac);
                sayac--;
            }
            else
                sayac--;
        }
    }
}
