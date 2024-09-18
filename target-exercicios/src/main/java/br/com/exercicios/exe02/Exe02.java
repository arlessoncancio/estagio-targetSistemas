package br.com.exercicios.exe02;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int next;
        int number;

        a = 0;
        b = 1;
        next = a + b;
        System.out.println("Digite um número: ");
        number = sc.nextInt();

        while (number > next) {
            a = b;
            b = next;
            next = a + b;
        }

        if (number == next) {
            System.out.println("Pertence a sequência Fibonacci");
        }
        else {
            System.out.println("Não pertence a sequência Fibonacci");
        }

        sc.close();
    }

}