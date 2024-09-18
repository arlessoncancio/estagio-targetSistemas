package br.com.exercicios;

import java.util.List;

public class Faturamento {
    private int dia;
    private double valor;

    public Faturamento() {}

    public double getValor() {
        return valor;
    }

    public boolean diaOk (){
        return this.valor != 0;
    }

    public void getValoresValidos(){
        //valoresValidos = valoresValidos + faturamentoAtual.getValor();
    }

    public int getDia() {
        return dia;
    }
}