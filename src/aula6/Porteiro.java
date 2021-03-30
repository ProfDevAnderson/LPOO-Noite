
package aula6;


public class Porteiro extends Funcionario {
    private String turno;

    public Porteiro(String turno, double salario, String nome) {
        super(salario, nome);
        this.turno = turno;
    }

   
    
    

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }   

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
