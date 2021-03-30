
package aula6;

/**
 *
 * @author anderson
 */
public class Funcionario  extends Pessoa{
   
    protected double salario;

    public Funcionario(double salario, String nome) {
        super(nome);
        this.salario = salario;
    }
    
    
    
}
