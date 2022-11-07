package model;

public class Conta {
    public int numero;
    public double saldo;
    public int status; //1-ATIVA 2-BLOQUEADA 3-CANCELADA
    public int categoria; //1-COMUM 2-ESPECIAL 3-VIP

    /** Metodo construtor de <<create>>
     */
    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
        this.status = 1;
        this.categoria = 1;
    }

    /** Metodo creditar. Credita "valor" no saldo
     */
    public void creditar(double valor) {
        if(status == 1){
            saldo += valor;
            categoria = saldo > 100000? 3:saldo > 50000? 2: categoria;
        }
    }

    /** Metodo debitar. Debita "valor" do saldo
     */
    public void debitar(double valor) {
        if(status == 1){
            saldo -= valor;
            double taxa = saldo < 0?10.0:0;
            saldo -= taxa;
        }

    }
}
