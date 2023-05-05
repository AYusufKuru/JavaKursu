package Odevler;

import java.util.Scanner;

public class _2_Soru_7 {
    public static void main(String[] args) {
        // Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
        Scanner oku = new Scanner(System.in);

        System.out.print("Genişliği giriniz = ");
        int width = oku.nextInt();
        System.out.print("Uzunluğu giriniz = ");
        int length = oku.nextInt();

        int sayac = 0;

        for (int i=0;i<=length;i++){
            for (int j=0;j<=width;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
