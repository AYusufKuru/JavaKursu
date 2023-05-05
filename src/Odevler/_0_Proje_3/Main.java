package Odevler._0_Proje_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer custom1 = new Customer();
        custom1.account1.iban = "TR0101";
        custom1.account2.iban = "TR0102";
        custom1.account3.iban = "TR0103";
        custom1.userName = "User1";
        custom1.password = "password1";
        custom1.account1.number = "1123";
        custom1.account1.balance = 1000;
        custom1.account2.number = "1456";
        custom1.account2.balance = 2000;
        custom1.account3.number = "1789";
        custom1.account3.balance = 3000;

        Customer custom2 = new Customer();
        custom2.account1.iban = "TR0201";
        custom2.account2.iban = "TR0202";
        custom2.account3.iban = "TR0203";
        custom2.userName = "User2";
        custom2.password = "password2";
        custom2.account1.number = "2123";
        custom2.account1.balance = 1500;
        custom2.account2.number = "2456";
        custom2.account2.balance = 2500;
        custom2.account3.number = "2789";
        custom2.account3.balance = 3500;

        Customer custom3 = new Customer();
        custom3.account1.iban = "TR0301";
        custom3.account2.iban = "TR0302";
        custom3.account3.iban = "TR0303";
        custom3.userName = "User3";
        custom3.password = "password3";
        custom3.account1.number = "3123";
        custom3.account1.balance = 3000;
        custom3.account2.number = "3456";
        custom3.account2.balance = 5000;
        custom3.account3.number = "3789";
        custom3.account3.balance = 7000;

        Scanner scan = new Scanner(System.in);

        ArrayList<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        ArrayList<String> actions2 = new ArrayList<>(Arrays.asList("Kendi hesaplarıma", "Başka hesaba", "Bir önceki menüye dön"));
        ArrayList<Customer> musteriler = new ArrayList<>(Arrays.asList(custom1,custom2,custom3));


        Customer aktifKullanici;
        Account secilenHesap2;
        Account secilenHesap;
        Account secilenHesapTransfer;


        while (true){
            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            aktifKullanici = confirmUsernameAndPassword(musteriler, username, password);

            if (aktifKullanici != null){
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        while (true){
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i)+ " - " + (i+1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice){

                case 1:{
                    while (true){
                        System.out.println("Lutfen para yatırmak istediginiz hesap numarasini giriniz...: ");
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        String secim = scan.next();
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen yatırmak istediginiz para miktarini giriniz...: ");
                        System.out.println(secilenHesap.balance);
                        int yatirilicakPara = scan.nextInt();
                        if (!deposit(secilenHesap, yatirilicakPara)){
                            break;
                        }
                    }
                    break;
                }

                case 2: {

                    while (true){
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        String secim = scan.next();
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        System.out.println(secilenHesap.balance);
                        int cekilecekPara = scan.nextInt();
                        if (!withdraw(secilenHesap, cekilecekPara)){
                            break;
                        }
                    }
                    break;
                }

                case 3:{
                    System.out.println("Yapmak istediginiz islemi seciniz...");
                    for (int i = 0; i < actions2.size(); i++) {
                        System.out.println(actions2.get(i)+ " - " + (i+1));
                    }
                    userChoice = scan.nextInt();

                    switch (userChoice){
                        case 1:{
                            for(Account account : aktifKullanici.accounts){
                                System.out.println(account.number + " = " + account.balance + "TL");
                            }
                            System.out.println("Para trnsferi hangi hesaptan yapılsın...: ");

                            String secim = scan.next();
                            secilenHesap = confirmAccountNumber(aktifKullanici,secim);
                            if (secilenHesap == null) {
                                System.out.println("Hatali hesap numarasi girdiniz...");
                                continue;
                            }

                            System.out.println("Para transferi yapılıcak hesap numarası giriniz...: ");

                            secim = scan.next();
                            secilenHesapTransfer = confirmAccountNumber(aktifKullanici,secim);
                            if (secilenHesapTransfer == null) {
                                System.out.println("Hatali hesap numarasi girdiniz...");
                                continue;
                            }

                            if (secilenHesap != secilenHesapTransfer){
                                System.out.println("Tranfer edilecek para miktarını giriniz...: ");
                                int transferMiktari = scan.nextInt();

                                if (transfer(secilenHesap,secilenHesapTransfer,transferMiktari)){
                                    System.out.println("İşlem başarıyla gerçekleşti.");
                                }else {
                                    System.out.println("Hesabınızda yeterli miktarda para bulunmuyor.");
                                    continue;
                                }
                            }else {
                                System.out.println("Aynı hesaba transfer işlemi yapılamaz.");
                                continue;
                            }
                            break;
                        }
                        case 2:{
                            System.out.println("Para gönderilecek iban numarasını giriniz...:");
                            String secim = scan.next();
                            secilenHesap2 = confirmIbanNumber(musteriler,secim);
                            if (confirmIbanNumber(musteriler,secim) != null){
                                for(Account account : aktifKullanici.accounts){
                                    System.out.println(account.number + " = " + account.balance + "TL");
                                }
                                System.out.println("Para transferi hangi hesaptan yapılsın...: ");

                                secim = scan.next();
                                secilenHesap = confirmAccountNumber(aktifKullanici,secim);
                                if (secilenHesap == null) {
                                    System.out.println("Hatali hesap numarasi girdiniz...");
                                    continue;
                                }
                                System.out.println("Gönderilecek para miktarını giriniz...:");
                                int transferMiktari = scan.nextInt();
                                System.out.println("2.45TL gönderim ücreti vardır kabul ediyoru musunuz.(E/H)");
                                String kabulRed = scan.next().toUpperCase();
                                switch (kabulRed){
                                    case "E":{
                                        if (transferMiktari <= secilenHesap.balance) {
                                            secilenHesap2.balance += transferMiktari;
                                            secilenHesap.balance -= (transferMiktari + 2.45);
                                            System.out.println("İşlem başarıyla gerçekleşti. Gönderilen hesabın bkaiyesi ="+ secilenHesap2.balance);
                                        }
                                    }
                                    case "H":{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Hatalı secim yaptınız");
                                        break;
                                    }
                                }


                            }else {
                                System.out.println("Hatalı iban girdiniz.");
                            }


                            break;
                        }
                        case 3:{
                           break;
                        }
                        default:{
                            System.out.println("Basarili bir secim yapmadiniz...");
                        }

                    }

                break;
                }


                case 4: System.exit(1);

                default:{
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }
    }
    public static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password){
        Customer aktifKullanici = new Customer();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userName.equals(username)){
                if (users.get(i).password.equals(password)){
                    aktifKullanici=users.get(i);
                    break;
                }
            }else
                aktifKullanici = null;
        }
        return aktifKullanici;
    }

    public static Account  confirmAccountNumber(Customer currentUser, String chosenAccount){
        Account secilenHesap = new Account();

        for (int i = 0; i < currentUser.accounts.size(); i++) {
            if (currentUser.accounts.get(i).number.equals(chosenAccount)){
                secilenHesap = currentUser.accounts.get(i);
                break;
            }else
                secilenHesap=null;
        }

        return secilenHesap;
    }
    public static Account confirmIbanNumber(ArrayList<Customer> User, String chosenIban){
        Account secilenHesap = new Account();
        for (Customer a : User){
            if (a.account1.iban.equals(chosenIban)){
                secilenHesap = a.account1;
                break;
            } else if (a.account2.iban.equals(chosenIban)) {
                secilenHesap = a.account2;
                break;
            } else if (a.account3.iban.equals(chosenIban)) {
                secilenHesap = a.account3;
                break;
            }else {
                secilenHesap = null;
            }

        }


        return secilenHesap;
    }

    public static boolean  withdraw(Account chosenAccount, int amountToWithdraw ){
        boolean bool = true;
        if (chosenAccount.balance >= amountToWithdraw){
            chosenAccount.balance -= amountToWithdraw;
            System.out.println("İşlem başarıyla gerçekleştirdiniz.");
            bool = false;
        }else{
            System.out.println("Hesabınızda yeterli miktarda para bulunmuyor.");
        }

        return bool;
    }

    public static boolean  deposit(Account currentCustomer, int chosen){
        boolean bool = true;
        if (0 < chosen){
            currentCustomer.balance += chosen;
            System.out.println("İşlem başarıyla gerçekleştirdiniz.");
            bool = false;
        }else{
            System.out.println("Hatalı miktar girdiniz.");
        }

        return bool;

    }

    public  static boolean transfer(Account account1, Account account2, int amountToTransfer){
        boolean bool = false;
        if (amountToTransfer <= account1.balance){
            account1.balance -= account1.balance-amountToTransfer;
            account2.balance += account2.balance+amountToTransfer;
            bool = true;
        }


        return bool;
    }
    public  static boolean transferIban(Customer custom1, Customer custom2,Account account1, Account account2, int amountToTransfer){
        boolean bool = false;
        for (Account a : custom1.accounts){
            if (a.number.equals(account1)){
                a.balance -= amountToTransfer;
            }
        }
        for (Account a : custom2.accounts){
            if (a.number.equals(account1)){
                a.balance += amountToTransfer;
                bool = true;
            }
        }



        return bool;
    }

}
