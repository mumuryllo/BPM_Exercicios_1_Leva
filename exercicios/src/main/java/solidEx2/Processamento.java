package solidEx2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Processamento {

    public String converterSegundosParaData(long segundos) {
        if (segundos < 0) {
            return "Tempo negativo não é válido.";
        } else if (segundos == 0) {
            return "Valores nulos inválidos!";
        } else {
            Date data = new Date(segundos * 1000);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

            return sdf.format(data);
        }
    }

}
