package org.example;

import solidEx1.Entrada;
import solidEx1.Processamento;
import solidEx1.Saida;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        try {
            Entrada entrada = new Entrada();
            int quantidadeNumeros = entrada.obterQuantidadeNumeros();
            ArrayList<Integer> numeros = new ArrayList<>();

            for (int i = 0; i < quantidadeNumeros; i++) {
                int numero = entrada.obterProximoNumero();

                if (numero >= 0) {
                    numeros.add(numero);
                } else {
                    System.out.println("Número negativo encontrado, não vai entrar na sequência");
                }
            }

            entrada.fechar();

            Processamento processamento = new Processamento();
            ArrayList<Integer> numerosOrdenados = processamento.ordenarParesImpares(numeros);

            Saida saida = new Saida();
            saida.imprimirNumeros(numerosOrdenados);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro válido.");
        }
    }

    }

