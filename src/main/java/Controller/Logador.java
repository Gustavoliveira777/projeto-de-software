package Controller;

import model.Conta;

import java.util.Date;

public class Logador {
    public void imprimir(String operacao, Integer numeroConta, Double valor) {
        System.out.println(String.format("%s - %s - %d - R$ %.2f", new Date(), operacao, numeroConta, valor));
    }
}
