package solidEx2;

import java.util.Scanner;

public class Entrada {

    private Scanner scanner;

    public Entrada() {
        scanner = new Scanner(System.in);
    }

    public long obterSegundos() {
        System.out.println("Digite o valor em segundos:");
        return scanner.nextLong();
    }

    public void fechar() {
        scanner.close();
    }

}
