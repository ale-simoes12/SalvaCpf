/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlee;

import model.lista;
import view.prin1;

/**
 *
 * @author alessandro
 */
public class controle2 {

    private prin1 pag2;

    //construtor
    public controle2(prin1 pag2) {
        this.pag2 = pag2;

    }

    //metodo pega o cpf imputado pelo usario na pagina e ve se ele esta no arquivo
    public void Ler() {
        String cpf = pag2.getString1().getText();

        lista l = new lista();
        ////salva o cpf que ele quer saber os dados
        String resultado = l.Ler(cpf);
        /////chama a funçao que busca os dados com o cpf
        pag2.getResultado().setText(resultado);

        //view.getResult().setText(String.valueOf(resultado));
    }

}
