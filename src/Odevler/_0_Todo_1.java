package Odevler;

public class _0_Todo_1 {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.{"CNN", "TRT", "KanalD", "TV100", "TGRT"}
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.// TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // TODO : fakat bir buldugunu tekrar bulmasın

        String[] tvKanallar = {"CNN", "TRT", "KanalD", "TV100", "TGRT"};
        int randomDizi[] = {5,5,5,5,5};
        int random;
        boolean bool = true;

        for (int i = 0; i < 5 ; i++) {
            random = (int)(Math.random()*5);
            System.out.println(random);

            for (int j = 0; j < randomDizi.length ; j++) {

                if (randomDizi[j] == random){
                    bool = false;
                    break;
                }
                else
                    bool = true;
            }

            if (bool == true){
                randomDizi[i] = random;
                System.out.println(tvKanallar[random]);
            }


        }
    }
}
