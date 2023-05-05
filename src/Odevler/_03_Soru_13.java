package Odevler;

public class _03_Soru_13 {
    public static void main(String[] args) {
        //Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String str = "$12 $23 $10 $2 $5 $2";
        String str2 =str.replace("$","");
        String str3 = str.replace(" ","");
        int[] sayilar =new int [6];
        int bitir = str2.indexOf(" ");
        int basla = 0;
        int boslukSayisi =str.length()-str3.length();


        for (int i = 0; i < boslukSayisi+2; i++) {
            sayilar[i] = Integer.parseInt(str2.substring(basla,bitir));

            basla = ++bitir;

            if (bitir > 12){
                System.out.println(sayilar[i]);
                sayilar[i] = Integer.parseInt(str2.substring(basla));
                System.out.println(sayilar[i]);
                break;
            }

            bitir = str2.indexOf(" ",bitir);
            System.out.println(sayilar[i]);

        }


    }
}
