package Odevler;

public class _2_Soru_10 {
    public static void main(String[] args) {
        // do while loop kullanınız.
        //> 0 ile 30 arasındaki bütün çift sayıları yazdırınız.
        int sayac = 0;
        do {
            if (sayac % 2 == 0){
                System.out.println(sayac);
                sayac++;
            }
            else
                sayac++;
        }
        while(sayac <= 30);




    }
}
