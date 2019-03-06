package com.joy;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("Mary", "001", 3000);
        Account acc2 = new Account("Kibe", "002", 8000);
        Account acc3 = new Account("Jill", "003", 4000);
        Account acc4 = new Account("Lorna", "004", 2000);
        Account acc5 = new Account("Kavutha", "005", 1000);

        System.out.println(acc2.getBalance());
        acc2.setBalance(66500);
        System.out.println(acc2.getBalance());

        acc2.deposit(10000);
        acc2.printDetails();
        acc2.withdraw(5000);
        acc2.printDetails();

        String name = "John";
        name.toLowerCase();

        //primitive
        int x = 10;
        double z = 88;
        boolean finished = true;

        Account[] accounts = {acc1, acc2, acc3, acc4, acc5};
        for (Account k : accounts) {
            k.deposit(1000);
            k.printDetails();
        }
    }
}