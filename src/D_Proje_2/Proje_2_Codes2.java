package D_Proje_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_2_Codes2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // String için scanner
        Scanner scanInt = new Scanner(System.in);  // int için scanner

        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> userNames = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> accountNumbers = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> balances = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        boolean login = false;                            // login basarili olmadigi sürece dönmesi için boolean atadik

        while (!login) {
            System.out.print("Lütfen kullanıcı adınızı giriniz -> ");
            String username = scan.next();
            System.out.print("Lütfen şifrenizi giriniz -> ");
            String password = scan.next();
            if (confirmUsernameAndPassword(userNames,passwords,username,password)) {    // bu metod true dönerse döngüyü kıracak
                login = true;                                                           // başına "!" işareti koysaydık
                System.out.println("Basarili bir sekilde giris yaptiniz");              // eğer false ise demek olacakti
            }
            else System.out.println("Giriş işlemi başarısız tekrar deneyiniz!");
        }

        boolean finished = false;       // switch sonrası sürekli menüye dönmesi için switch dahil her şeyi do-while döngüsüne aldık
        do {                            // eğer yapmasaydık program kapanırdı (videoda kapanmıyor)
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }
            System.out.print("Seçiminizi yapiniz -> ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1: {
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");
                }
                break;
                case 2: {
                    boolean processOver = false; // yanliş giriş yaptıktan sonra ana menüye değil , hesap numarası  menüsüne
                    do {                         // dönmesi için do while oluşturup boolean atadık (videoda öyle)
                        System.out.println("Hesap numaralariniz");

                        for (String accountNumber : accountNumbers) {
                            System.out.println(accountNumber);
                        }
                        System.out.print("Islem yapacaginiz hesap numarasini yaziniz -> ");
                        String choice = scan.next();
                        boolean numberCorrect = false;  // hesap numarasi dogru mu degil mi diye bulmak icin döngü öncesi degisken atadık
                        int whichIndex = 0; // indexler ayni olmasi gerektigi icin degisken atayip döngüde artırdık
                        for (int i = 0; i < accountNumbers.size(); i++) {
                            if (choice.equals(accountNumbers.get(i))) {
                                numberCorrect = true;   // numara dogru oldugu icin atadigimiz degisken true ya döndü ve devam etti
                                System.out.print("Çekmek istediğiniz tutarı giriniz -> ");
                                int withdrawAmount = scanInt.nextInt();
                                if (withdrawAmount > balances.get(whichIndex)) { // girdigi hesap numarası kacıncı indexteyse bakiyesi de ayni indexte olmali
                                    System.out.println("Bakiyenizden fazla tutar girişi yaptınız");
                                } else {
                                    withdraw(accountNumbers, balances, choice, withdrawAmount); // withdraw metodu
                                    processOver = true; // bu true ya dönünce case 2 nin do while döngüsü kırılıyor ve ana menüye dönüyor
                                }
                            }
                            whichIndex++;
                        }
                        if (!numberCorrect) // girilen hesap no yanlis ise uyari verip do-while döngüsünün başına 51. satıra dönecek
                            System.out.println("Yanlış hesap numarası girdiniz lütfen tekrar deneyiniz");
                    }while(!processOver);
                    }
                break;
                case 3: {
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                }
                break;
                case 4:
                    System.out.println("Cikis yapildi , kartinizi almayi unutmayin");
                    finished = true;
                    System.exit(1);
                    break;
                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                    break;
                }

            }
        }while(!finished);

    }

    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {

        int index = 0; // girilen hesap numarasinin listedeki index ini bulup sonrasinda bakiye listesi index i ile karşilastirmak icin
        for (String account : accounts) {
            if (chosenAccount.equals(account)) {
                break;
            }
            index++;
        }

        if (amountToWithdraw <= funds.get(index)) {  // funds listesinin onceden atadigimiz index değerine gidecek böylece hesaptaki bakiye alinacak
            funds.set(index,(funds.get(index)-amountToWithdraw)); // (index,new value) şeklinde çalişir , güncel bakiyeden girilen değeri çıkarttık.
            System.out.println("Para çekme işleminiz başarılı , hesabınızda " + funds.get(index) + " Euro kalmıştır.");
        }

    }

    private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {
        boolean correctUser = false; // girişin başarılı olması için 3 şart var , 1. kullanici adi dogru olmasi
        boolean correctPassword = false; // 2. passwordun dogru olmasi.  // 3. id ve passwordun index değerleri ayni olmali
        boolean correctAll = false;  // bütün şartların karşılandıgını gösteren boolean değeri.
        int indexUser = 0; // id listesindeki indexi bulmak icin (döngüde artacak)
        int indexPw = 0; // password listesindeki indexi bulmak icin (döngüde artacak)

        for (String user : users) {
            if (username.equals(user)) {
                correctUser = true;
                break; // döngüde girilen id aranır, kaçıncı adımda bulunduysa indexUser e o değer atanir ve döngü kırılır.
            }
            indexUser++; // index in her adımda artmasi gerekir, kaçıncıda bulursa o değere atanır daha sonra karşılaştırılır
        }

        for (String s : passwords) {
            if (password.equals(s)) {
                correctPassword = true;
                break; // döngüde girilen password aranır, kaçıncı adımda bulunduysa indexPw a o değer atanir ve döngü kırılır.
            }
            indexPw++; // index in her adımda artmasi gerekir, kaçıncıda bulursa o değere atanır daha sonra karşılaştırılır
        }
        if (correctUser && correctPassword && (indexUser == indexPw)) { // 3 şartın 3 ü de sağlandıysa demek
            correctAll = true; // bütün şartlar sağlanmiş true değeri dönecek
        }
        return correctAll;  // boolean döndürecek
    }

}
