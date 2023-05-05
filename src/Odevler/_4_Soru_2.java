package Odevler;

public class _4_Soru_2 {
    public static void main(String[] args) {
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        String str = "Elma yemeyi sevmem.";
        String[] array = {"Elma","yemeyi","severim."};

        System.out.println( OrtaKelime(str));
       System.out.println( OrtaKelime(array));

    }

    public static String OrtaKelime(String str) {
        int sayac = 0;
        int index = -1;
        String str2;
        str2 =str.replace(" ", "");

        String[] array = new String[(str.length()-str2.length())+1];
        for (int i = 0; i < array.length; i++) {
            sayac=str.indexOf(" ",sayac+1);
            if (sayac < 0){
                array[i]=str.substring(index+1);
                break;
            }
            array[i]=str.substring(index+1,sayac);
        index=sayac;
        }
        if (array.length % 2 == 1){
            return array[(array.length/2)];
        }
        else{
            return array[((array.length/2)-1)]+" "+array[((array.length/2))];
        }
    }

    public static String OrtaKelime(String[] str) {
        if (str.length % 2 == 1){
            return str[(str.length/2)];
        }
        else{
            return str[((str.length/2)-1)]+" "+str[((str.length/2))];
        }
    }
}
