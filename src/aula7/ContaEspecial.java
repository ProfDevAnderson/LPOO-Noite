
package aula7;

public class ContaEspecial extends Conta {
    
    private String tipoConta;

    public ContaEspecial(String tipoConta, String nome, int numero, double saldo) {
        super(nome, numero, saldo);
        this.tipoConta = tipoConta;
    }
    
    
    public void sacar(double valor){
    
        this.saldo -= valor;
        if (this.saldo <0){
            System.out.println("saldo negativo " + this.saldo);
        } else {
            System.out.println("Saldo positivo de " + this.saldo);
        }
    
    }
    
    
}
