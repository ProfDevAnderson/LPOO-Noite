
package aula6;


public class Principal {

    public static void main(String[] args) {
//       Aluno
         Aluno a = new Aluno(132, "jose");
         a.fazerAniversario();
         
//         Professor
        Professor p = new Professor(900, "matutino", "cpm","will", 34, "34254" );
        p.fazerAniversario();
        
        
        Porteiro p1 = new Porteiro("nOTURNO", 444, "JOSE");
        p1.fazerAniversario();


    }
    
}
