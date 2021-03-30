
package aula8;


public class Homem extends Pessoa{

    public Homem(String nome) {
        super(nome);
    }
    
     
    @Override
    public void assistirFutebol(){
        System.out.println("Abrindo a cerveja...");
        System.out.println("Torcendo pelo meu time");
    }
    
    public void mijarEmPe(){
        System.out.println("xiiiiii");
    }
    
    
    public void meuTime(){
        System.out.println("Eu torço para um time");
    }
    
    public void meuTime(String time){
        System.out.println("Meu time é : " + time);
    }
    
    public void meuTime(int titulo){
        System.out.println("Meu time tem " + titulo + " titulos");
    }
   
    
}
