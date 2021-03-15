package aula3;

public class Principal {

    public static void main(String[] args) {
//       Declara a variavel do tipo Conta
//       Instanciar o objeto - Memoria para inserir os valores | Chamar os metodos
        Conta conta1 = new Conta("Carlos", 30, 78, 55, "534");
             
        Conta conta2 = new Conta("Maria", 60, 45, 77, "230");
 
        Conta conta3 = new Conta("Luis", 324, 34, 34, "334535");
        
        Conta conta4 = new Conta("Pedro", 20, 30, 49);
        
        Conta conta5 = new Conta();
        conta5.nome = "Anderson";
        
        Conta conta6 = new Conta("Joana", 40);
        System.out.println(conta6.verificarDados());
        

//        Inserir os valores nos atriutos de conta1
//        Conta conta1 = new Conta();
//        conta1.agencia = 165;
//        conta1.numero = 9857;
//        conta1.cpf = "165.165.878-89";
//        conta1.nome = "Jose de Ribamar";
//        conta1.saldo = -10.00;
//        
//        
//        
//        Conta conta2 = new Conta();
//        conta2.agencia = 3453;
//        conta2.numero = 324;
//        conta2.cpf = "98798";
//        conta2.nome = "230948";
//        conta2.saldo = 34;
//        boolean resultado = conta1.verificarDevedor();
//        
//        if (resultado == true){
//            System.out.println("Não pode pedir emprestimos pq ta com saldo negativo");
//        } else {
//            System.out.println("Pode pedir emprestimos");
//        }
//        
//        conta1.verSaldo();
//        
//        String resultadoString = conta1.verificarDados();
//        
//        System.out.println(resultadoString);
//        
//        conta1.depositar(20);
//        
//        double valorSacar = 5;
//        
//        String resultadoSaque = conta1.sacar(valorSacar);
//        
//        System.out.println(resultadoSaque);
//        
//        conta1.pedirEmprestimo(1500);
    }

}
