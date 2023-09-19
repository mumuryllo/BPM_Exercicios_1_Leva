package org.example;
import solidEx2.Entrada;
import solidEx2.Processamento;
import solidEx2.Saida;
import java.util.InputMismatchException;


public class Ex2 {

    public static void main(String[] args) {

        try {
            Entrada entrada = new Entrada();
            long segundos = entrada.obterSegundos();
            entrada.fechar();

            Processamento processamento = new Processamento();
            String resultado = processamento.converterSegundosParaData(segundos);

            Saida saida = new Saida();
            saida.imprimirResultado(resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }

    }

