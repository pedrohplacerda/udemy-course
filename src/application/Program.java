package application;

import application.entities.Account;
import application.entities.SavingsAccount;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account x = new SavingsAccount(1000, "Maria", 1000.0, 0.01);
        Account y = new Account(1001, "Alex", 1000.0);

        x.withdraw(50.0);
        y.withdraw(50.0);


        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }

}
