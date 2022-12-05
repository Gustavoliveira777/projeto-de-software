package Controller;

import model.Conta;

public class Operacao {
    public void transfere(Conta origem, Conta destino, Double valor){
        origem.debitar(valor);
        Logador logger = new Logador();
        logger.imprimir("RETIRADA",origem.numero,valor);
        destino.creditar(valor);
        logger.imprimir("DEPOSITO",destino.numero,valor);
    }
}
