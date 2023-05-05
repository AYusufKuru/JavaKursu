package D_Proje_1;

import java.util.Scanner;

public class Proje_1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz= ");
        String isim = oku.nextLine();
        String isimb = buyukcevir(isim);
        System.out.println(isimb);
        System.out.print(isimb + " hoşgeldin,soyismini girer misin? = ");  // println - print olacak
        String soyisim = oku.nextLine();
        String soyisimb = buyukcevir(soyisim);
        System.out.println(isimb + " " + soyisimb);

        boolean onay = true;
        do {
            System.out.print("Onaylıyorsanız \"Y\" tuşuna basınız = ");   // println - print olacak
            String cevap = oku.next();
            if (cevap.equalsIgnoreCase("Y")) {
                onay = true;
                break;
            } else System.out.println("Yanlış veya hatalı giriş yaptınız!");
            onay = false;
        } while (!onay); // parantez ici kısaltılabilir

        String isimsoyisim = isimb + " " + soyisimb;
        System.out.println(isimsoyisim + "=isim ve soyisminizle sisteme kayıt oldunuz "); // eşittir kalkabilir
        System.out.print("Lütfen kullanıcı adını giriniz = ");
        String kullanici = oku.next();

        boolean ayni=true;
        do {
            System.out.print("Lütfen şifrenizi belirleyiniz = ");
            String sifre = oku.next();
            System.out.print("Lütfen şifrenizi tekrar giriniz = ");String onaysifre= oku.next();
            if (sifre.equals(onaysifre)){
                ayni=true;           System.out.println("Tebrikler \""+kullanici+"\" Kullanıcı adı ile sisteme kayıt oldunuz");
                break;  }else ayni=false;
            System.out.println("Yanlis veya hatali bir sifre girdiniz,lutfen tekrar deneyin...");

        }while (!ayni); // parantez ici kısaltılabilir
    }

    public static String buyukcevir(String a) {String b=null;
        boolean varMi=a.contains(" ");
        if (!varMi){  // parantez ici kısaltılabilir
            b= a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
        }else if (varMi){  // parantez ici kısaltılabilir
            int bosluk=a.indexOf(" ");
            b= a.substring(0, 1).toUpperCase() + a.substring(1,bosluk).toLowerCase()+" "+a.substring((bosluk+1),(bosluk+2))
                    .toUpperCase()+a.substring((bosluk+2)).toLowerCase();}
        return b;
    }
}






