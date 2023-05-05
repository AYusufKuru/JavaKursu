package Odevler;

public class _Todo_2 {
    public static void main(String[] args) {

        double saat1 = 0;
        double saat2 = 0;
        double saat3 = 0;
        int sayac = 0;

        for (int i = 1; i > 0 ; i++) {

            saat1 += 60;
            saat2 += 45;
            saat3 += 40;
            sayac++;
            System.out.println(sayac+"."+(saat1/60)/24 + " " +(saat2/60)/24+" "+ (saat3/60)/24);
            if (saat1 % 1440 ==0 && saat2 % 1440 == 0 && saat3 % 1440 == 0 ){
                System.out.println(sayac);
                break;
            }

        }

    }
}
