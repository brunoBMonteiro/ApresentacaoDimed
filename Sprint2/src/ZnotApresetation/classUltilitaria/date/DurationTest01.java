package ZnotApresetation.classUltilitaria.date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
     // para o intervalo de duas datas
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afterTwoYears = LocalDateTime.now().plusYears(2);

        Duration d1 = Duration.between(now,afterTwoYears);
        System.out.println(d1);

        System.out.println("------------");


        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime timeAfter7horus = LocalDateTime.now().minusHours(7);
        Duration d2 = Duration.between(timeNow,timeAfter7horus);
        System.out.println(d2);


    }
}
