package aula4;

public class Conta {

    private String nome;
    private int conta;
    private double saldo;

//    Mudar os valores dos atributos (set)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setSaldo(double valorSaldo) {
        if (valorSaldo > 0) {
            this.saldo = valorSaldo;
        } else {
            System.out.println("O valor tem que ser maior do que zero");

        }
    }

//    Mostrar os valores dos atributos (get)
    public String getNome(){
     return nome;
    }
    
    public int getConta(){
    return conta;
    }

    public double getSaldo(){
    return saldo;
    }
}
