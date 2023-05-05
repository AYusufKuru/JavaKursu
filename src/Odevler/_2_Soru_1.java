package Odevler;

public class _2_Soru_1 {
    public static void main(String[] args) {
        //0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._
        int sayac = 0;
        while (sayac <= 100){
            if (sayac % 2 == 0){
                System.out.println(sayac);
                sayac++;
            }
            else
                sayac++;
        }
    }
}
