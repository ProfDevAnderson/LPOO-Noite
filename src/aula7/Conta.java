package aula7;

public class Conta {

    protected String nome;
    protected int numero;
    protected double saldo;

    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo+1;
    }

    public void setSaldo(double saldo) {
        if (saldo > this.saldo) {
            System.out.println("Saque indisponivel");
        } else {
            this.saldo = saldo;
            System.out.println("Saque feito com sucesso!!!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
