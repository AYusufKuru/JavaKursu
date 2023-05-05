package Odevler;

public class _2_Soru_8 {
    public static void main(String[] args) {
        //Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        boolean bool = true;
        for (int i=1;i<=5;i++){

            for (int j=1;j<=i;j++){

                if (bool == true){
                    for (int k=4;k>=i;k--){
                        System.out.print(" ");
                    }
                }
                bool = false;
                System.out.print("*");

            }
            bool = true;
            System.out.println();
        }

    }
}
