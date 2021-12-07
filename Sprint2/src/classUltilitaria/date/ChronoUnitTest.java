package classUltilitaria.date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {

        // faz a padronização de todas as datas

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime aniver = LocalDateTime.of(1988, Month.AUGUST,6,12,0,0);

        System.out.println(ChronoUnit.DAYS.between(aniver,now));


    }
}
