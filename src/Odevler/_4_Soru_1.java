package Odevler;

public class _4_Soru_1 {
    public static void main(String[] args) {
        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

        System.out.println(randomNum(10));
    }

    public static int randomNum(int max) {

        return (int)(Math.random()*max);
    }
}
