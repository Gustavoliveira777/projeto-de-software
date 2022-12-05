package org.example;

import Controller.Operacao;
import model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta origem = new Conta(12391234);
        Conta destino = new Conta(21391234);
        origem.creditar(50000.00);
        destino.creditar(1212.50);
        System.out.println(String.format("Valor conta origem: R$ %.2f\nValor conta destino: R$ %.2f",origem.saldo,destino.saldo));
        Operacao operacao = new Operacao();
        operacao.transfere(origem,destino,12725.30);
        System.out.println(String.format("Valor conta origem: R$ %.2f\nValor conta destino: R$ %.2f",origem.saldo,destino.saldo));
    }
}