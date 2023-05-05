import java.util.Scanner;

public class _03_XOX_Oyunu {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String[][] xox = new String[4][4];
        int sayac = 1;
        String abc = "ABC";
        int sayi1 = 0;
        int sayi2 = 0;
        String okunanDeger;

        for (int k = 0; k < 4; k++) {
                if (k == 0){
                    xox[0][k]="X";
                }
                else {
                    xox[0][k] = Integer.toString(sayac);
                    sayac++;
                }
            }
        for (int l = 0; l < 3; l++) {
            xox[l+1][0] = abc.substring(l,l+1);
        }
        for (int m = 0; m < 4; m++) {
            if (m<3){
            for (int n = 0; n < 4; n++) {
                if (n<3) {
                    xox[m + 1][n + 1] = "-";
                }
                System.out.print(xox[m][n] + "\t");
            }
            System.out.println();}
            else {
                for (int n = 0; n < 4; n++) {
                    if (n<3) {
                        xox[m][n + 1] = "-";
                    }
                    System.out.print(xox[m][n] + "\t");
                }
            }
        }
        System.out.println();


        outher:
        for (int j = 1; j < 10; j++) {

            if (j % 2 == 0){
                System.out.print("X harfi için pozisyon giriniz(ABC-123) = ");
                okunanDeger = oku.next();
                sayi1 = (okunanDeger).substring(0,1).equals("A")? 1: (okunanDeger).substring(0,1).equals("B")? 2: (okunanDeger).substring(0,1).equals("C")?3:4;
                sayi2= Integer.parseInt(okunanDeger.substring(1));

                if (sayi1==4 || sayi2 != 1 &&sayi2 != 2 && sayi2 != 3) {
                    j--;
                    System.out.println("Hatalı değer girdiniz.");
                    continue outher;
                }
                if (xox[sayi1][sayi2].equals("-")){
                    xox[sayi1][sayi2]="X";
                }
                else {
                    System.out.println("Hatalı değer gırdınız.");
                    j--;
                    continue outher;
                }

                for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            System.out.print(xox[k][l]+"\t");
                        }
                        System.out.println();
                    }
                System.out.println();


            }
            else{

                System.out.print("O harfi için pozisyon giriniz(ABC-123) = ");
                okunanDeger = oku.next();
                sayi1 = (okunanDeger).substring(0,1).equals("A")? 1: (okunanDeger).substring(0,1).equals("B")? 2: (okunanDeger).substring(0,1).equals("C")?3:4;
                sayi2= Integer.parseInt(okunanDeger.substring(1));

                if (sayi1==4 || sayi2 != 1 &&sayi2 != 2 && sayi2 != 3) {
                    j--;
                    System.out.println("Hatalı değer girdiniz.");
                    continue outher;
                }

                if (xox[sayi1][sayi2].equals("-")){
                    xox[sayi1][sayi2]="O";
                }
                else {
                    System.out.println("Hatalı değer gırdınız.");
                    j--;
                    System.out.println(j);
                    continue outher;
                }

                for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            System.out.print(xox[k][l]+"\t");
                        }
                        System.out.println();
                    }
                System.out.println();

            }
            /****Kazanma Koşulları****/
            //Satır şartları

            if (xox[1][1].equals("X") && xox[1][2].equals("X") && xox[1][3].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            if (xox[2][1].equals("X") && xox[2][2].equals("X") && xox[2][3].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            if (xox[3][1].equals("X") && xox[3][2].equals("X") && xox[3][3].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            //Stun şartları

            if (xox[1][1].equals("X") && xox[2][1].equals("X") && xox[3][1].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            if (xox[1][2].equals("X") && xox[2][2].equals("X") && xox[3][2].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            if (xox[1][3].equals("X") && xox[2][3].equals("X") && xox[3][3].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            //Çaptaz şartlar

            if (xox[1][1].equals("X") && xox[2][2].equals("X") && xox[3][3].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            if (xox[3][3].equals("X") && xox[2][2].equals("O") && xox[1][1].equals("X")){
                System.out.println("X'lar kazandı tebrikler.");
                break ;
            }
            /****Kazanma Koşulları****/
            //Satır şartları

            if (xox[1][1].equals("O") && xox[1][2].equals("O") && xox[1][3].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            if (xox[2][1].equals("O") && xox[2][2].equals("O") && xox[2][3].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            if (xox[3][1].equals("O") && xox[3][2].equals("O") && xox[3][3].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            //Stun şartları

            if (xox[1][1].equals("O") && xox[2][1].equals("O") && xox[3][1].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            if (xox[1][2].equals("O") && xox[2][2].equals("O") && xox[3][2].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            if (xox[1][3].equals("O") && xox[2][3].equals("O") && xox[3][3].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            //Çaptaz şartlar

            if (xox[1][1].equals("O") && xox[2][2].equals("O") && xox[3][3].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
            if (xox[3][3].equals("O") && xox[2][2].equals("O") && xox[1][1].equals("O")){
                System.out.println("O'lar kazandı tebrikler.");
                break ;
            }
        }
    }
}
