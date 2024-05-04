package br.com.quequeeuvouassistir.modelos.calculadora;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;}
//    public void inclui(Filme f){
//        tempoTotal += f.getDuraçãoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuraçãoEmMinutos();}
//
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuraçãoEmMinutos();
    }
}
