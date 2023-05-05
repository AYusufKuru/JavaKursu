package D_Proje_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class proje_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Customer customer1 = new Customer();
        customer1.username = "User1";
        customer1.password = "password1";
        customer1.account1.accountNumber = "1456";
        customer1.account1.balance = 1000;
        customer1.account2.accountNumber = "1789";
        customer1.account2.balance = 2000;

        Customer customer2 = new Customer();
        customer2.username = "User2";
        customer2.password = "password2";
        customer2.account1.accountNumber = "2456";
        customer2.account1.balance = 2500;
        customer2.account2.accountNumber = "2789";
        customer2.account2.balance = 3000;

        Customer customer3 = new Customer();
        customer3.username = "User3";
        customer3.password = "password3";
        customer3.account1.accountNumber = "3456";
        customer3.account1.balance = 4000;
        customer3.account2.accountNumber = "3789";
        customer3.account2.balance = 5000;

        ArrayList<Customer> musteriler = new ArrayList<>(Arrays.asList(customer1,customer2,customer3));
        Actions actions = new Actions();

        Customer aktifKullanici;
        Account secilenHesap;
        Account secilenHesap2;

        while (true){
            System.out.print("Please enter your username: ");
            String username = scan.nextLine();
            System.out.print("Please enter your password: ");
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
            for (int i = 0; i < actions.actions.size(); i++) {
                System.out.println(actions.actions.get(i)+ " - " + (i+1));
            }
            System.out.print("Seçiminiz -> ");
            int userChoice = scan.nextInt();

            switch (userChoice){

                case 1:{
                    while (true){
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.accountNumber);
                        }
                        System.out.print("Lutfen para yatirmak istediginiz hesap numarasini giriniz.: ");
                        String secim = scan.next();
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Hesaptaki mevcut bakiye -> " + secilenHesap.balance);
                        System.out.print("Lutfen yatirmak istediginiz para miktarini giriniz...: ");
                        int yatirilacakPara = scan.nextInt();
                        if (!deposit(secilenHesap, yatirilacakPara)){
                            break;
                        }
                    }
                    break;
                }

                case 2: {

                    while (true){
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.accountNumber);
                        }
                        System.out.print("Lutfen para cekmek istediginiz hesap numarasini giriniz.: ");
                        String secim = scan.next();
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Hesaptaki mevcut bakiye -> " + secilenHesap.balance);
                        System.out.print("Lutfen cekmek istediginiz para miktarini giriniz.: ");
                        int cekilecekPara = scan.nextInt();
                        if (!withdraw(secilenHesap, cekilecekPara)){
                            break;
                        }
                    }
                    break;
                }

                case 3: {

                    while (true) {
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.accountNumber);
                        }
                        System.out.print("Transfer hangi hesaptan yapilsin -> ");
                        String secim = scan.next();
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap != null) {
                            for (Account account : aktifKullanici.accounts) {
                                System.out.println(account.accountNumber);
                            }
                            System.out.print("Transfer hangi hesaba yapilsin -> ");
                            String secim2 = scan.next();
                            secilenHesap2 = confirmAccountNumber(aktifKullanici, secim2);
                            if (secilenHesap2 != null && !secim.equals(secim2)) {
                                System.out.println(secilenHesap.accountNumber + " numarali hesabin bakiyesi " + secilenHesap.balance);
                                System.out.println(secilenHesap2.accountNumber + " numarali hesabin bakiyesi " + secilenHesap2.balance);
                                System.out.print("Transfer edilecek tutari giriniz -> ");
                                int tutar = scan.nextInt();
                                transferAccount(secilenHesap, secilenHesap2, tutar);
                                break;
                            } else System.out.println("Hatali hesap numarasi girdiniz");
                        } else System.out.println("Hatali hesap numarasi girdiniz");
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

    public static Customer confirmUsernameAndPassword(ArrayList<Customer> users, String username, String password){
        Customer customer1 = new Customer();
        for (Customer a: users) {
            if (a.username.equals(username)){
                if(a.password.equals(password)){
                    customer1 = a;
                    break;
                }
            }
            customer1=null;
        }
        return customer1;
    }

    public static Account confirmAccountNumber(Customer currentUser, String chosenAccount){
        Account accountList = new Account();
        for (Account a: currentUser.accounts) {
            if(a.accountNumber.equals(chosenAccount)) {
                accountList = a;
                break;
            }else accountList = null;
        }
        return accountList;
    }

    public static boolean withdraw(Account chosenAccount, int amountToWithdraw ){
        boolean correct = true;

        if (chosenAccount.balance >= amountToWithdraw) {
            chosenAccount.balance -= amountToWithdraw;
            System.out.println("Para çekme işlemi başarılı ! Yeni bakiyeniz " + chosenAccount.balance);
            correct = false;
        }else System.out.println("Girilen tutar bakiyeden fazla.");
        return correct;
    }

    public static boolean deposit(Account chosenAccount, int amountToDeposit ){
        boolean correct = true;

        if (amountToDeposit > 0) {
            chosenAccount.balance += amountToDeposit;
            System.out.println("Para yatirma işlemi başarılı ! Yeni bakiyeniz " + chosenAccount.balance);
            correct = false;
        }else System.out.println("Hatali tutar girisi yapildi.");
        return correct;
    }

    public static void transferAccount(Account choosenAccount , Account choosenAccount2 , int amountToTransfer) {

        if (amountToTransfer <= choosenAccount.balance) {
            choosenAccount.balance -= amountToTransfer;
            choosenAccount2.balance += amountToTransfer;
            System.out.println("Transfer islemi basariyla gerceklestirildi");
            System.out.println(choosenAccount.accountNumber + " no lu hesabin guncel bakiyesi " + choosenAccount.balance);
            System.out.println(choosenAccount2.accountNumber + " no lu hesabin guncel bakiyesi " + choosenAccount2.balance);
        }else System.out.println("Girilen tutar " + choosenAccount.accountNumber + " no'lu hesabinizin bakiyesinden fazla.");
    }

}