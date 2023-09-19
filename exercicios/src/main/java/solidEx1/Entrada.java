package solidEx1;

import java.util.Scanner;

public class Entrada {

    private Scanner scanner;

    public Entrada() {
        scanner = new Scanner(System.in);
    }

    public int obterQuantidadeNumeros() {
        System.out.println("Digite a quantidade de números a serem ordenados:");
        return scanner.nextInt();
    }

    public int obterProximoNumero() {
        return scanner.nextInt();
    }

    public void fechar() {
        scanner.close();
    }

}
