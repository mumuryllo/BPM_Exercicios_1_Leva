package solidEx1;

import java.util.ArrayList;

public class Processamento {

    public ArrayList<Integer> ordenarParesImpares(ArrayList<Integer> numeros) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        pares.sort(Integer::compareTo);
        impares.sort((a, b) -> b.compareTo(a));

        pares.addAll(impares);
        return pares;
    }

}
