package aula3;

public class Main {

    public static void main(String[] args) {

//        Fornecedor f = new Fornecedor();
//        f.nome = "Mateus";
//        f.cnpj = "987986565";
//        f.ramo = "Supermercado";
//        
//        
        Fornecedor f7 = new Fornecedor();
        f7.nome = "Smart";
        f7.cnpj = "98456";
        f7.ramo = "Academia";

        Fornecedor f = new Fornecedor("Mateus", "65465", "Supermercado");
        f.mostrarDados();
        
        
        System.out.println(f.nome);

        Fornecedor f2 = new Fornecedor("Smart", "4556465", "Academia");
        System.out.println(f2.nome);

        Fornecedor f3 = new Fornecedor("Potiguar", "344354", "Construção");
        System.out.println(f3.nome);

        Fornecedor f4 = new Fornecedor("Casa arruda", "eletronico");
        System.out.println(f4.nome);
    }

}
