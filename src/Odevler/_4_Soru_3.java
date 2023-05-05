package Odevler;

public class _4_Soru_3 {
    public static void main(String[] args) {
        //reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        String str = "Java'yı Seviyorum.";


        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String reverse = "";
        int sayac = 1;
        for (int i = 0; i < str.length(); i++) {
            reverse += (str.substring(str.length()-sayac,str.length()-i));
            sayac++;
        }
        return reverse;
    }

}
