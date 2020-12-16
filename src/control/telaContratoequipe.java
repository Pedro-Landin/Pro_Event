
package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class telaContratoequipe {
    private String nome;
   private String Quant;
   private String valor;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuant() {
        return Quant;
    }

    public void setQuant(String Quant) {
        this.Quant = Quant;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
     public String salvar(){
      try {
          FileWriter fw = new FileWriter("Contrato.txt",true);
          PrintWriter pw = new PrintWriter(fw); //escrever conteudo no arquivo e pular linha
          pw.println("");
          pw.println("Equipes:"+nome+", Membros da equipe:"+Quant+", Valor:"+valor);
          //pw.print("Qtd : ,"+Quant);
          //pw.print(",Valor : "+valor);
          pw.flush();// enviar os dados no momento
          pw.close();// fechar o pw
          fw.close();
      } catch (IOException ex) {
          Logger.getLogger(telaArtista.class.getName()).log(Level.SEVERE, null, ex);
      }
        return "Salvo com sucesso";
    }
}
