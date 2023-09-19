package solidEx3;

import java.util.Scanner;

public class Entrada {

    private Scanner scanner;

    public Entrada() {
        scanner = new Scanner(System.in);
    }

    public int obterNumero() {
        System.out.println("Digite o valor do número para calcular o termo da sequência de Fibonacci:");
        return scanner.nextInt();
    }

    public void fechar() {
        scanner.close();
    }

}
