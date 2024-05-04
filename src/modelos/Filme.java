package modelos;

import br.com.quequeeuvouassistir.modelos.calculadora.Classificavel;
import modelos.Titulo;

public class  Filme extends Titulo implements Classificavel {
private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificação() {
        return 0;
    }
}
