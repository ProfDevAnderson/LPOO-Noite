
package aula8;


public class Mulher extends Pessoa {

    public Mulher(String nome) {
        super(nome);
    }
    
     
    @Override
    public void assistirFutebol(){
        System.out.println("Aff, começou o futebol");
    }
    
}
