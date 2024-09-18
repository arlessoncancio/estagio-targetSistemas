package br.com.exercicios.exe05;

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string para ser invertida: ");
        String original = sc.nextLine();

        char[] caracteres = original.toCharArray();

        String invertida = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        System.out.println("String invertida: " + invertida);

        sc.close();
    }
}