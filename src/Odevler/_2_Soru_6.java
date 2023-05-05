package Odevler;

public class _2_Soru_6 {
    public static void main(String[] args) {
        // 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

        int sayac = 0;
        while(sayac <= 100){
            if(sayac % 5 == 0){
                if (sayac % 4 == 0){
                    System.out.println(sayac);
                    sayac++;
                }
                else
                    sayac++;

            }
            else
                sayac++;
        }
    }
}
