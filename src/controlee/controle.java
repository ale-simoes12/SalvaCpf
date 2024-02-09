/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlee;

import model.lista;

import view.prin2;

/**
 *
 * @author alessandro
 */
public class controle {

    private prin2 pag1;

    ///contrutor
    public controle(prin2 pag1) {
        this.pag1 = pag1;

    }

    ///salva o valor
    public void Cadastramento() {
        String nome = pag1.getString1().getText();
        String sobrenome = pag1.getString2().getText();
        String idade = pag1.getString3().getText();
        String cpf = pag1.getString4().getText();
        String sexo = pag1.getString5();

        lista l = new lista();
        ////adiciona no txt
        l.Cadastrar(nome, sobrenome, idade, sexo, cpf);

        //view.getResult().setText(String.valueOf(resultado));
    }

}
