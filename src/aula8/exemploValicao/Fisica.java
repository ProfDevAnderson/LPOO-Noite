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
public class Fisica extends Pessoa {

    public Fisica(String nome) {
        super(nome);
    }

//     Validar se o numero é um CPF
    public boolean validarDocumento(String numero) {

        if (numero.length() == 11) {
            return true;
        } else {
            return false;
        }
    }
}
