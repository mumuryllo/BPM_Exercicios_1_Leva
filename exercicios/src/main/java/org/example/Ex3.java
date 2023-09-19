package org.example;
import solidEx3.Entrada;
import solidEx3.Processamento;
import solidEx3.Saida;
import java.util.InputMismatchException;

public class Ex3 {

    public static void main(String[] args) {

        try {
            Entrada entrada = new Entrada();
            int n = entrada.obterNumero();
            entrada.fechar();

            Processamento processamento = new Processamento();
            int resultado = processamento.calcularFibonacci(n);

            Saida saida = new Saida();
            saida.imprimirResultado(resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro não negativo.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    }


