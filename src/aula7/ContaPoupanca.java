package aula7;

public class ContaPoupanca extends Conta {

    private double saldoPoupanca;

    public ContaPoupanca(double saldoPoupanca, String nome, int numero, double saldo) {
        super(nome, numero, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

      public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void sacarPoupanca(double saldoPoupanca) {
        if (saldoPoupanca > this.saldoPoupanca) {
            System.out.println("Saldo indisponível");
        } else {
            this.saldoPoupanca = saldoPoupanca;
            System.out.println("Saque feito com sucesso");
            System.out.println("Saldo atual: " + this.saldoPoupanca);
        }
    }

 
}
