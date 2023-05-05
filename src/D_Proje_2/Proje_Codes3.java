package D_Proje_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_Codes3 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> KullaniciAdlari = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> sifreler = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> hesapNolar = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> balance = new ArrayList<>(Arrays.asList(200, 1000, 5000));


        for (int i = 0; i >= 0 ; i++) {
            System.out.print("Kullanıcı adınızı giriniz = ");
            String kullaniciAdi = oku.next();
            System.out.print("Şifrenizi giriniz = ");
            String sifre = oku.next();


            if (confirmUsernameAndPassword(KullaniciAdlari,sifreler,kullaniciAdi,sifre)){
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }else {
                System.out.println("\"Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin\"");
            }
        }
        System.out.println("Yapmak istediginiz islemi seciniz...");
        boolean secim = true;
        String hesapNoOku;
        String hesapNoOku1;
        String hesapNoOku2;

        while (secim){
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }
            int userChoice = oku.nextInt();

            switch (userChoice) {
                case 1: {
                    for (int j = 0; j >= 0; j++) {
                        System.out.println("Hangi hesaptan para yatırmak istiyorsunuz?");
                        for (int i = 0; i < hesapNolar.size(); i++) {
                            System.out.println(hesapNolar.get(i));
                        }
                        hesapNoOku = oku.next();
                        if (deposit(hesapNolar,balance,hesapNoOku)){
                            break;
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
                        hesapNoOku = oku.next();
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
                        System.out.println("Hangi hesaptan para transfer yapmak istiyorsunuz?");
                        for (int i = 0; i < hesapNolar.size(); i++) {
                            System.out.println(hesapNolar.get(i));
                        }
                        hesapNoOku1 = oku.next();
                        System.out.println("Hangi hesaba para transfer yapmak istiyorsunuz?");
                        for (int i = 0; i < hesapNolar.size(); i++) {
                            System.out.println(hesapNolar.get(i));
                        }
                        hesapNoOku2 = oku.next();
                        if (!hesapNoOku2.equals(hesapNoOku1)){
                            if (transfer(hesapNolar,balance,hesapNoOku1,hesapNoOku2)){
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
        for (int i = 0; i < kullaiciAd.length(); i++) {

            if (users.contains(kullaiciAd)){
                index = users.indexOf(kullaiciAd);
                if (passwords.get(index).equals(sifre)){
                    bool = true;
                }
            }
        }
        return bool;
    }

    private static boolean withdraw(List<String> accounts,List<Integer> funds, String chosenAccount ){
        Scanner oku = new Scanner(System.in);
        int intAccount = Integer.parseInt(chosenAccount);
        boolean bool = false;
        int amountToWithdraw ;
        if (accounts.contains(chosenAccount)){
            intAccount = accounts.indexOf(chosenAccount);
            System.out.println("Çekmek istediğiniz para miktarını giriniz = ");
            System.out.println("Bakiyeniz = "+ funds.get(intAccount));
            amountToWithdraw = oku.nextInt();

            if (amountToWithdraw <= funds.get(intAccount)){
                funds.set(intAccount,(funds.get(intAccount)-amountToWithdraw));
                System.out.println("Güncel bakiyeniz = " + funds.get(intAccount));
                bool = true;
            }
        }
        return bool;
    }

    private static boolean deposit(List<String> accounts,List<Integer> funds, String chosenAccount ) {

        Scanner oku = new Scanner(System.in);
        int intAccount = Integer.parseInt(chosenAccount);
        boolean bool = false;
        int amountToWithdraw;
        if (accounts.contains(chosenAccount)) {
            intAccount = accounts.indexOf(chosenAccount);
            System.out.println("Yatırmak istediğiniz para miktarını giriniz = ");
            System.out.println("Bakiyeniz = " + funds.get(intAccount));
            amountToWithdraw = oku.nextInt();

            if (amountToWithdraw > 0) {
                funds.set(intAccount, (funds.get(intAccount) + amountToWithdraw));
                System.out.println("Güncel bakiyeniz = " + funds.get(intAccount));
                bool = true;
            }

        }
        return bool;
    }

    private static boolean transfer(List<String> accounts,List<Integer> funds, String chosenAccount1, String chosenAccount2 ) {

        Scanner oku = new Scanner(System.in);
        int intAccount1 = Integer.parseInt(chosenAccount1);
        int intAccount2 = Integer.parseInt(chosenAccount2);
        boolean bool = false;
        int amountToTransfer;
        if (accounts.contains(chosenAccount1) && accounts.contains(chosenAccount1)) {
            intAccount1 = accounts.indexOf(chosenAccount1);
            intAccount2 = accounts.indexOf(chosenAccount2);

            System.out.println(chosenAccount1 + ". Nolu hesap Bakiyeniz = " + funds.get(intAccount1));
            System.out.println(chosenAccount2 + ". Nolu hesap Bakiyeniz = " + funds.get(intAccount2));
            System.out.println(chosenAccount1+ ". Nolu hesaptan "+ chosenAccount2 + ". Nolu hesaba aktarmak istediğiniz para miktarını giriniz = ");
            amountToTransfer = oku.nextInt();

            if (amountToTransfer <= funds.get(intAccount1)) {
                funds.set(intAccount1, (funds.get(intAccount1) - amountToTransfer));
                funds.set(intAccount2, (funds.get(intAccount2) + amountToTransfer));
                System.out.println(chosenAccount1 + ". Nolu hesabın güncel Bakiyesi = " + funds.get(intAccount1));
                System.out.println(chosenAccount2 + ". Nolu hesabın güncel Bakiyesi = " + funds.get(intAccount2));
                bool = true;
            }

        }
        return bool;
    }
}
