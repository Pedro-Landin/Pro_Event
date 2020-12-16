/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class telaEstoque {
   private String nome; 
   private String valor;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
   private String quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
   
    public String salvar(){
      try {
          FileWriter fw = new FileWriter("estoque.txt",true);
          PrintWriter pw = new PrintWriter(fw); //escrever conteudo no arquivo e pular linha
          pw.println("Nome: "+nome+"Valor: "+valor);
          //pw.println("Valor: "+valor);
          //pw.println("Quantidade: "+quantidade);
         
          pw.flush();// enviar os dados no momento
          pw.close();// fechar o pw
          fw.close();
      } catch (IOException ex) {
          Logger.getLogger(telaArtista.class.getName()).log(Level.SEVERE, null, ex);
      }
        return "Salvo com sucesso";
    }
   
}
