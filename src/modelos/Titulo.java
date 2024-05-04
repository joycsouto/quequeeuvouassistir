package modelos;

public class Titulo  {

    private String nome;
    private int anoDeLançamento;
    private boolean plano;
    private double Somaavaliação;
    private int totalAvaliação;
    private int duraçãoEmMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public boolean isPlano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }


    public int getDuraçãoEmMinutos() {
        return duraçãoEmMinutos;
    }

    public void setDuraçãoEmMinutos(int duraçãoEmMinutos) {
        this.duraçãoEmMinutos = duraçãoEmMinutos;
    }

    public void exibeFichaTécnica() {
        System.out.println("Nome do filme :" + nome);
        System.out.println("Ano de lançamento :" + anoDeLançamento);
    }
    public int getTotalAvaliação(){
        return totalAvaliação;
    }
    public void avalia(double nota){
        Somaavaliação += nota;
    }
}
