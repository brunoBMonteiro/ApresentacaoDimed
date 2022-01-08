package notapresetation.classultilitaria.date;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
// parecido com a date
        // é em milisigundos
        // imutavel

        Instant now = Instant.now();

        System.out.println(now);
        System.out.println(LocalDateTime.now());


    }
}
