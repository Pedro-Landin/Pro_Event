
package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class telaLocal {
    private String valor;
    private String nome;
    private String qntPessoa;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQntPessoa() {
        return qntPessoa;
    }

    public void setQntPessoa(String qntPessoa) {
        this.qntPessoa = qntPessoa;
    }
     public String salvar(){
      try {
          FileWriter fw = new FileWriter("local.txt",true);
          PrintWriter pw = new PrintWriter(fw); //escrever conteudo no arquivo e pular linha
          pw.println("Nome: "+nome+"Valor: "+valor+"Quantidade: "+qntPessoa);
          //pw.println("Valor: "+valor);
          //pw.println("Quantidade: "+qntPessoa);
         
          pw.flush();// enviar os dados no momento
          pw.close();// fechar o pw
          fw.close();
      } catch (IOException ex) {
          Logger.getLogger(telaArtista.class.getName()).log(Level.SEVERE, null, ex);
      }
        return "Salvo com sucesso";
    }
}
