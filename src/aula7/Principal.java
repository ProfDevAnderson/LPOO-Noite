
package aula7;


public class Principal {

//     Criação dos objetos
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaEspecial ce = new ContaEspecial("Conta especial", "Jose", 1254, 0);
        ce.sacar(30);
        
        ContaPoupanca cp = new ContaPoupanca(20, "Maria", 4365, 0);
        cp.sacarPoupanca(10);
        
        System.out.println(cp.getSaldo());
        System.out.println(ce.getSaldo());
    }
    
}
