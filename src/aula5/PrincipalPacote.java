package aula5;

public class PrincipalPacote {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setNome("Afonso");
        c1.setNumero(52);
        c1.setSaldo(5);
        
        System.out.println(c1.mostrarInfo());
//        Conta 2 ----------------------------------------
        Conta c2 = new Conta();
        c2.setNome("Afonso");
        c2.setNumero(52);
        c2.setSaldo(12);
        
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Numero: " + c2.getNumero());
        System.out.println("Saldo: " + c2.getSaldo());
        
        
//        Pessoa

        Pessoa p1 = new Pessoa();
        p1.setNome("Josenildo");
        p1.setCpf("657898789");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Cpf: " + p1.getCpf());
    }

}
