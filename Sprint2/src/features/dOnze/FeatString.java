package features.dOnze;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FeatString {
    public static void main(String[] args) throws IOException {


        System.out.println(repeatString("café",5));
        System.out.println("--");


        // .isBlank
        // verifica se a string não tem nada, se não tiver retorna true
        var result = " ".isBlank(); // true

        System.out.println(result);

        String ddd = "  f oo  ";
        var result2 = "f oo"; // true


        System.out.println("---");
        System.out.println("Marco".isBlank());

        System.out.println( "Mar\nco".lines());
        System.out.println("   Marco1".strip());




    }


public static String repeatString (String method,int numeroRepet){
    var result = method.repeat(numeroRepet); // foo bar foo bar
    return result;
}





}
