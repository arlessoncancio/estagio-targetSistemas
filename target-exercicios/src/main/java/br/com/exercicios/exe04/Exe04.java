package br.com.exercicios.exe04;

import java.util.HashMap;
import java.util.Map;

public class Exe04 {

    public static void main(String[] args) {

        Map<String, Double> estadosValores = new HashMap<>();

        estadosValores.put("SP", 67836.43);
        estadosValores.put("RJ", 36678.66);
        estadosValores.put("MG", 29229.88);
        estadosValores.put("ES", 27165.48);
        estadosValores.put("OUTROS", 19849.53);

        double somaTotal = 0;
        for (double valor : estadosValores.values()) {
            somaTotal += valor;
        }

        System.out.println("Percentual de representação de cada estado:");
        for (Map.Entry<String, Double> entry : estadosValores.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / somaTotal) * 100;
            System.out.printf("Estado: %s, Percentual: %.2f%%\n", estado, percentual);
        }
    }
}
