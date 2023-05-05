package Odevler;

public class _2_Soru_2 {
    public static void main(String[] args) {
        //0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        int sayac = 0;
        while (sayac <= 100){
            if (sayac % 2 == 1){
                System.out.println(sayac);
                sayac++;
            }
            else
                sayac++;
        }
    }
}
