package br.com.exercicios.exe03;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Exe03 {

    public static void main(String[] args) {
        String caminhoDoArquivo = "src/main/java/br/com/exercicios/exe03/dados.json";

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double mediaMensal = 0;
        int diasValidos = 0;
        double valoresValidos = 0;
        int diasAcimaDaMedia = 0;

        try {
            FileReader arquivo = new FileReader(caminhoDoArquivo);
            Gson gson = new Gson();
            Type listType = new TypeToken<List<br.com.exercicios.Faturamento>>() {
            }.getType();

            List<br.com.exercicios.Faturamento> faturamentos = gson.fromJson(arquivo, listType);

            for (br.com.exercicios.Faturamento faturamentoAtual : faturamentos) {

                if (faturamentoAtual.diaOk()) {
                    diasValidos++;
                    valoresValidos = valoresValidos + faturamentoAtual.getValor();
                    if (faturamentoAtual.getValor() < menorValor) {
                        menorValor = faturamentoAtual.getValor();
                    }
                    if (faturamentoAtual.getValor() > maiorValor) {
                        maiorValor = faturamentoAtual.getValor();
                    }
                    if(faturamentoAtual.getValor() > mediaMensal) {
                        diasAcimaDaMedia++;
                    }
                    mediaMensal = valoresValidos / diasValidos;
                }

            }

            System.out.println("Menor Valor do mês: " + menorValor);
            System.out.println("Maior Valor do mês: " + maiorValor);
            System.out.println("Número de dias em que o valor de faturamento diário foi superior à média mensal: " + diasAcimaDaMedia);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}