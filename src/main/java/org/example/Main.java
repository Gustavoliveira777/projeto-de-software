package org.example;

import model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta account = new Conta(123456);
        account.creditar(123);
        System.out.println(account.saldo);
        account.debitar(1);
        System.out.println(account.saldo);
        account.debitar(123);
        System.out.println(account.saldo);
        account.creditar(52000);
        System.out.println(account.categoria);
        account.creditar(10000000);
        System.out.println(account.categoria);

    }
}