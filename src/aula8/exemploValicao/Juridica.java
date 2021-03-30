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
public class Juridica extends Pessoa {

    public Juridica(String nome) {
        super(nome);
    }

//     Validar se o numero é um CNPJ
//    SOBREPOSIÇÂO
    public boolean validarDocumento(String numero) {

        if (numero.length() == 14) {
            return true;
        } else {
            return false;
        }
    }
}
