/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author alessandro
 */
public class lista {
///salva os dados no cpf
    public void Cadastrar(String nome, String sobrenome, String idade, String sexo, String cpf) {
        try {
            FileWriter fw = new FileWriter("a.txt ", true);
            //FileReader fr = new FileReader("arq.txt "  );
            PrintWriter pv = new PrintWriter(fw);

          
            pv.print("Nome" + nome);
            pv.print(" Sobrenome " + sobrenome);
            pv.print("Idade " + idade);
            pv.print(" Cpf " + cpf);
            pv.println("Sexo" + sexo);

            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
    //////ler o arquivo e procura a linha que o cfp esta e rotorna ela

    public String Ler(String cpf) {
        String a = "nao a cadastro desse cpf";
        try {
            
            FileReader fr = new FileReader("a.txt ");
            

            BufferedReader br = new BufferedReader(fr);
            String linha;
            

            while ((linha = br.readLine()) != null) {

                if (linha.contains(" Cpf " + cpf+"Sexo")) {
                   a = linha;

                }
                
              
            }
            
              

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        
        return a;

    }

}
