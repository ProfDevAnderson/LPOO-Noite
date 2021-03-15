
package aula3;


public class Fornecedor {
    
    String nome;
    String cnpj;
    String ramo;
//    Construtor - Metodo especial que leva o nome da classe
//    Utilizado para instanciar objetos

    public Fornecedor(String nome, String cnpj, String ramo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.ramo = ramo;
    }

    public Fornecedor(String nome, String ramo) {
        this.nome = nome;
        this.ramo = ramo;
    }

    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public Fornecedor() {
    }

 
    public void mostrarDados(){
        System.out.println("Nome: "+ nome + " cnpj " + cnpj);
    }
}
