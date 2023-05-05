package D_Proje_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    String username;
    String password;


    Account account1 = new Account();
    Account account2 = new Account();
    ArrayList<Account> accounts = new ArrayList<>(Arrays.asList(account1,account2));

}
