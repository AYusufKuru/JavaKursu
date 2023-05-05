package Odevler;

public class _2_Soru_5 {
    public static void main(String[] args) {
        // **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
        //Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
        //Eğer sayı çift sayıysa;
        //**This number is even and number is 0**
        //Eğer sayı tek sayıysa;
        //**This number is odd and number is 1**

        int sayac = 0;

        while (sayac <= 100){
            if (sayac % 2 == 0){
                System.out.println("**This number is even and number is 0**");
                sayac++;
            }
            else {
                System.out.println("**This number is odd and number is 1**");
                sayac++;
            }
        }

    }
}
