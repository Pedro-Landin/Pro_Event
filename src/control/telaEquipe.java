
package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class telaEquipe {
     private String qntFunc;
     private String nomeEquipe;
     private String valor;

    public String getQntFunc() {
        return qntFunc;
    }

    public void setQntFunc(String qntFunc) {
        this.qntFunc = qntFunc;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
     public String salvar(){
      try {
          FileWriter fw = new FileWriter("equipe.txt",true);
          PrintWriter pw = new PrintWriter(fw); //escrever conteudo no arquivo e pular linha
          pw.println("Nome: "+nomeEquipe+"Quantidade: "+qntFunc+"Valor: "+valor);
          //pw.println("Quantidade: "+qntFunc);
          //pw.println("Valor: "+valor);
          pw.flush();// enviar os dados no momento
          pw.close();// fechar o pw
          fw.close();
      } catch (IOException ex) {
          Logger.getLogger(telaArtista.class.getName()).log(Level.SEVERE, null, ex);
      }
        return "Salvo com sucesso";
    }
}
