package Odevler._0_Proje_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    String userName;
    String password;

    Account account1 = new Account();
    Account account2 = new Account();
    Account account3 = new Account();
    ArrayList<Account> accounts = new ArrayList<>(Arrays.asList(account1,account2,account3));

}
