package aula6;

public class Aluno extends Pessoa {

    private int cpd;

    public Aluno(int cpd, String nome, int idade, String cpf) {
        // Construtor da SUPERCLASSE
        super(nome, idade, cpf);
        this.cpd = cpd;
    }

    public Aluno(int cpd, String nome) {
        super(nome);
        this.cpd = cpd;
    }

  
    
    
    
    public int getCpd() {
        return cpd;
    }

    public void setCpd(int cpd) {
        this.cpd = cpd;
    }

    public void mostrarNomeeIdade() {
        System.out.println("Nome: " + nome + " idade: " + idade);

    }

}
