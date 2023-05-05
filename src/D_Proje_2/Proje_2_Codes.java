package D_Proje_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_2_Codes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        List<String> actions = new ArrayList<>(Arrays.asList("Deposit_Money", "Withdraw_Money", "Transfer", "Exit"));
        List<String> userNames = new ArrayList<>(Arrays.asList     ("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList     ("password1", "password2", "password3"));
        List<String> accountNumbers = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> balances = new ArrayList<>(Arrays.asList     (200, 1000, 5000));

        boolean login = false;

        while (!login) {
            System.out.print("Please enter your username -> ");
            String username = scan.next();
            System.out.print("Please enter your password -> ");
            String password = scan.next();
            if (confirmUsernameAndPassword(userNames, passwords, username, password)) {
                login = true;
                System.out.println("You've logged in successfully !");
            } else System.out.println("You've entered wrong username or password , please try again...");
        }

        boolean finished = false;

        do {
            System.out.println("Please select the option you want to do...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }
            System.out.print("Choice -> ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1: {
                    System.out.println("Deposit is not available right now in this ATM..");
                    break;
                }
                case 2: {
                    boolean processOver = false;
                    do {
                        System.out.println("Which account number you want to withdraw from ?");
                        for (String accountNumber : accountNumbers) {
                            System.out.println(accountNumber);
                        }
                        System.out.print("Account Number -> ");
                        String choice = scan.next();
                        boolean numberCorrect = false;
                        int whichIndex = 0;
                        for (int i = 0; i < accountNumbers.size(); i++) {
                            if (choice.equals(accountNumbers.get(i))) {
                                numberCorrect = true;
                                System.out.print("Please enter the withdraw amount -> ");
                                int withdrawAmount = scInt.nextInt();
                                if (withdrawAmount > balances.get(whichIndex)) {
                                    processOver = false;
                                    System.out.println("You don't have enough balance, your balance is " + balances.get(whichIndex) + " please try again...");
                                } else {
                                    withdraw(accountNumbers, balances, choice, withdrawAmount);
                                    processOver = true;
                                }
                            }
                            whichIndex++;
                        }
                        if (!numberCorrect)
                            System.out.println("Account number doesn't exist, try again..");
                    } while (!processOver);
                    break;
                }
                case 3: {
                    System.out.println("ATM can't do this action right now..");
                    break;
                }
                case 4:
                    finished = true;
                    break;
                default: {
                    System.out.println("The choice you've made doesn't exist as an option..");
                    break;
                }
            }
        } while (!finished);


    }

    public static boolean confirmUsernameAndPassword(List<String> usernameList, List<String> passwordlist, String username, String password) {
        boolean correctUser = false;
        boolean correctPassword = false;
        boolean correctAll = false;
        int indexUser = 0;
        int indexPw = 0;

        for (String s : usernameList) {
            if (username.equals(s)) {
                correctUser = true;
                break;

            }
            indexUser++;
        }

        for (String s : passwordlist) {
            if (password.equals(s)) {
                correctPassword = true;
                break;
            }
            indexPw++;
        }
        if ((indexUser == indexPw) && correctUser && correctPassword) {
            correctAll = true;
        }
        return correctAll;
    }

    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {
        int index = 0;
        for (String account : accounts) {
            if (chosenAccount.equals(account)) {
                break;
            }
            index++;
        }

        if (amountToWithdraw <= funds.get(index)) {
            funds.set(index,(funds.get(index) - amountToWithdraw));
            System.out.println("Please take you money " + (funds.get(index)) + " Euros left in your account");
        }
    }
}