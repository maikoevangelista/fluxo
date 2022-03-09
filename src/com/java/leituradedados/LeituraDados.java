package com.java.leituradedados;

import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {

        int idade = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("digite o nome; ");
        String nome = sc.next();

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();

        if(idade < 0)
            System.out.println("idade invalida ");
        if (idade >= 18 && idade < 70) {
            System.out.println("maior idade");
        } else if (idade >=70 ) {
            System.out.println("terceira idade");
            if (idade >= 100){
                System.out.println("centenaria");
            }

        } else {
            System.out.println("menor idade");
        }
    }
}
