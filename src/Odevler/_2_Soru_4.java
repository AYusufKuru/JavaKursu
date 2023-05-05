package Odevler;

public class _2_Soru_4 {
    public static void main(String[] args) {
        //İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
        int sayac = 0;
        int toplam = 0;
        while (sayac <= 10){
            toplam = sayac + toplam;
            sayac++;
        }
        System.out.println(toplam);
    }
}
