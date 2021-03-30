/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.exemploValicao;

/**
 *
 * @author anderson
 */
public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
//     Metodo para ser sobrescritos nas outras classes
    public boolean validarDocumento (String numero){
    return true;
    }
}
