package modelos;

public class Episodios {
    private int numero;
    private String nome;
    private Serie pertence;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getPertence() {
        return pertence;
    }

    public void setPertence(Serie pertence) {
        this.pertence = pertence;
    }
}
