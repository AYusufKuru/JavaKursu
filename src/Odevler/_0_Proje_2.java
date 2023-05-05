package Odevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _0_Proje_2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> KullaniciAdlari = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> sifreler = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> hesapNolar = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> balance = new ArrayList<>(Arrays.asList(200, 1000, 5000));


        for (int i = 0; i >= 0 ; i++) {
            System.out.print("Kullanıcı adınızı giriniz = ");
            String kullaniciAdi = oku.next();                       //kullanıcı bilgileri alıyoruz.
            System.out.print("Şifrenizi giriniz = ");
            String sifre = oku.next();


            if (confirmUsernameAndPassword(KullaniciAdlari,sifreler,kullaniciAdi,sifre)){  // metodu çağırıyoruz metodun bize döndürğü değere göre koşul çalışıyor
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }else {
                System.out.println("\"Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin\"");
            }
        }
        boolean secim = true;
        String hesapNoOku;
        String hesapNoOku1;
        String hesapNoOku2;

        while (secim){
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));       //yapmak istediği işlemi sorup işlemleri listeliyoruz
            }
            int userChoice = oku.nextInt();

            switch (userChoice) {
                case 1: {
                    for (int j = 0; j >= 0; j++) {
                        System.out.println("Hangi hesaptan para yatırmak istiyorsunuz?");
                        for (int i = 0; i < hesapNolar.size(); i++) {        //hesapları listeliyoruz
                            System.out.println(hesapNolar.get(i));
                        }
                        hesapNoOku = oku.next();                             //girilen hesap numarasını okuyoruz
                        if (deposit(hesapNolar,balance,hesapNoOku)){        //girilen hesap numarasını metoda gönderiyoruz
                            break;                                          //dönen sonuca göre işlem yapılıyo
                        }else {
                            System.out.println("Hatalı hesap numarası girdiniz...");
                        }
                    }
                    break;
                }
                case 2: {
                    for (int j = 0; j >= 0; j++) {
                        System.out.println("Hangi hesaptan para cekmek istiyorsunuz?");
                        for (int i = 0; i < hesapNolar.size(); i++) {
                            System.out.println(hesapNolar.get(i));
                        }
                            hesapNoOku = oku.next();                                //case 1 ile aynı mantık
                            if (withdraw(hesapNolar,balance,hesapNoOku)){
                                break;
                            }else {
                                System.out.println("Hatalı hesap numarası girdiniz...");
                            }
                    }
                    break;
                }
                case 3: {
                    for (int j = 0; j >= 0; j++) {
                        System.out.println("Hangi hesaptan para transfer yapmak istiyorsunuz?"); //
                        for (int i = 0; i < hesapNolar.size(); i++) {
                            System.out.println(hesapNolar.get(i));
                        }
                        hesapNoOku1 = oku.next();                                          //para göndereceği hesap numarasını alıp hesapno1 olarak tutuyoruz
                        System.out.println("Hangi hesaba para transfer yapmak istiyorsunuz?");
                        for (int i = 0; i < hesapNolar.size(); i++) {
                            System.out.println(hesapNolar.get(i));
                        }
                        hesapNoOku2 = oku.next();                                       //para gönderilecek hesap numarasını alıp hesapno2 olarak tutuyoruz
                        if (!hesapNoOku2.equals(hesapNoOku1)){                          //girilen hesap numaraları aynı mı diye kontrol ediyoruz
                                if (transfer(hesapNolar,balance,hesapNoOku1,hesapNoOku2)){  //girilen 2 hesap numarası aynı değilse metoda gönderiyoruz
                                    break;
                                }else {
                                    System.out.println("Hatalı hesap numarası girdiniz...");
                                }
                        }else {
                            System.out.println("Hatalı hesap numarası girdiniz...");
                        }
                    }

                    break;
                }
                case 4:
                    System.exit(1);

                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }


    }

    public static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords,String kullaiciAd , String sifre) {


        boolean bool = false;
        int index ;
            if (users.contains(kullaiciAd)){    //kullanıcı adının sistemde olup olmadığına bakıyoruz
                index = users.indexOf(kullaiciAd);      //kullanıcı adı kaç no lu indexte olduğunu buluyoruz
                if (passwords.get(index).equals(sifre)){    //bulduğumuz index numarasına göre şifre karşılaştırması yapıyoruz
                    bool = true;
                }
            }
        return bool;
    }

    public static boolean withdraw(List<String> accounts,List<Integer> funds, String chosenAccount ){
            Scanner oku = new Scanner(System.in);
            int intAccount;          //index numarasını tutmak için int bir değişken tanımlıyoruz
            boolean bool = false;       //döndürülecek değer
            int amountToWithdraw ;       //matematiksel işlem yapabilmek için girilen miktarı inte atmak için değişkeni tanımlıyoruz


            if (accounts.contains(chosenAccount)){      //girilen değer sistemde kayıtlı mı diye bakıyoruz
                intAccount = accounts.indexOf(chosenAccount);       //girilen değerin index numarasını alıyoruz
                System.out.println("Çekmek istediğiniz para miktarını giriniz = ");
                System.out.println("Bakiyeniz = "+ funds.get(intAccount));
                amountToWithdraw = oku.nextInt();  //çekilecek miktarı alıyoruz

                if (amountToWithdraw <= funds.get(intAccount)){     //girilen miktar bakiyeden küçük mü diye bakıyoruz
                    funds.set(intAccount,(funds.get(intAccount)-amountToWithdraw));  //hesaptan para çıkışını yapıyoruz
                    System.out.println("Güncel bakiyeniz = " + funds.get(intAccount)); //güncel bakiyeyi yazdırıyoruz
                    bool = true;
                }
        }
            return bool;
    }

    public static boolean deposit(List<String> accounts,List<Integer> funds, String chosenAccount ) {

        Scanner oku = new Scanner(System.in);
        int intAccount;
        boolean bool = false;
        int amountToWithdraw;

        if (accounts.contains(chosenAccount)) {
            intAccount = accounts.indexOf(chosenAccount);
            System.out.println("Yatırmak istediğiniz para miktarını giriniz = ");
            System.out.println("Bakiyeniz = " + funds.get(intAccount));
            amountToWithdraw = oku.nextInt();

                if (amountToWithdraw > 0) {     //- bir değer yatıramayacağı için koşuluda sıfır olarak değiştiriyoruz
                    funds.set(intAccount, (funds.get(intAccount) + amountToWithdraw));      //çekme işleminde farklı olarak + yapıyoruz
                    System.out.println("Güncel bakiyeniz = " + funds.get(intAccount));
                    bool = true;
                }

        }
        return bool;
    }

    public static boolean transfer(List<String> accounts,List<Integer> funds, String chosenAccount1, String chosenAccount2 ) {

        Scanner oku = new Scanner(System.in);   //hesap numaraları okumak için scanner tanımlıyoruz
        int intAccount1;        //1. hesap (para çıkışı olucak hesap)
        int intAccount2;        //2. hesap (para girişi olucak hesap)
        boolean bool = false;
        int amountToTransfer;   //transfer edilecek miktar

        if (accounts.contains(chosenAccount1) && accounts.contains(chosenAccount2)) { //girilen 2 hesabın sistemde olup olmadığını kontrol ediyoruz
            intAccount1 = accounts.indexOf(chosenAccount1); //index numaralarını alıyoruz
            intAccount2 = accounts.indexOf(chosenAccount2);

            System.out.println(chosenAccount1 + ". Nolu hesap Bakiyeniz = " + funds.get(intAccount1)); //hesap bakiyeleri yazdırıyoruz
            System.out.println(chosenAccount2 + ". Nolu hesap Bakiyeniz = " + funds.get(intAccount2));
            System.out.println(chosenAccount1+ ". Nolu hesaptan "+ chosenAccount2 + ". Nolu hesaba aktarmak istediğiniz para miktarını giriniz = ");
            amountToTransfer = oku.nextInt();  //aktarılacak miktarı alıyoruz

            if (amountToTransfer <= funds.get(intAccount1)) {                        //aktarılacak miktarın ilk hesapta olup olmadığına bakıyoruz
                funds.set(intAccount1, (funds.get(intAccount1) - amountToTransfer)); //ilk hesaptan para çıkışını yapıyoruz
                funds.set(intAccount2, (funds.get(intAccount2) + amountToTransfer)); //2. hesaba para girişini yapıyoruz
                System.out.println(chosenAccount1 + ". Nolu hesabın güncel Bakiyesi = " + funds.get(intAccount1)); //bakiyeyi yazdırıyoruz
                System.out.println(chosenAccount2 + ". Nolu hesabın güncel Bakiyesi = " + funds.get(intAccount2));
                bool = true;
            }

        }
        return bool;
    }
}


