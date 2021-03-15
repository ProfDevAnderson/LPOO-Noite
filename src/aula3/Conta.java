package aula3;

public class Conta {

//    Criação dos atributos
    int agencia;
    int numero;
    String nome;
    String cpf;
    double saldo;

//    Criar um método ESPECIAL para instanciar uma classe - CONSTRUTOR
//    É um método especial para a criação e inicialização de uma 
//    nova instância de uma classe.
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(String nomeParametro, double saldoParametro, int agenciaParamentro,
            int numeroParametro, String cpfParametro) {

        agencia = agenciaParamentro;
        numero = numeroParametro;
        nome = nomeParametro;
        cpf = cpfParametro;
        saldo = saldoParametro;
    }

    public Conta(String nomeParametro, double saldoParametro, int agenciaParamentro,
            int numeroParametro) {
        agencia = agenciaParamentro;
        numero = numeroParametro;
        nome = nomeParametro;
        saldo = saldoParametro;
    }

    public Conta() {
    }

//      CamelCase
    public void verSaldo() {
        System.out.println("Saldo: " + saldo);
    }

//    Metodo para depositar
    public void depositar(double valor) {
        saldo += valor;
        verSaldo();
    }

//    Sacar - Não pode sacar um valor maior do que saldo
    public String sacar(double valorSaque) {
        if (valorSaque > saldo) {
            return "Saldo insuficiente";
        } else {
            saldo = saldo - valorSaque;
            return "Saque realizado com sucesso";
        }

    }

    public void pedirEmprestimo(double valorEmprestimo) {

        if (valorEmprestimo <= 1000) {
            System.out.println("Emprestimo cedido");
        } else {
            System.out.println("Emprestimo Negado");
        }
    }

    public boolean verificarDevedor() {
        if (saldo < 0) {
            return true;
        } else {
            return false;
        }
    }

    public String verificarDados() {
        String msg = "Nome: " + nome + " Conta " + numero + " Ag." + agencia
                + " Saldo: " + saldo;
        return msg;
    }

}
