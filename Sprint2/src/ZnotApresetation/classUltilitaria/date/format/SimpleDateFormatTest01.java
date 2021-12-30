package ZnotApresetation.classUltilitaria.date.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
      //  https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

      String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));


    }
}
