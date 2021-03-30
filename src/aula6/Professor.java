package aula6;

public class Professor extends Pessoa {

    private double salario;
    private String turno;
    private String curso;

    public Professor(double salario, String turno, String curso, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.turno = turno;
        this.curso = curso;
    }

 

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
}
