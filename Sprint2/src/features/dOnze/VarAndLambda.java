package features.dOnze;

import java.util.function.BiFunction;

public class VarAndLambda {

    //Available since: 10
   // JDK 11  lambda

     //       (Without lambda support in JDK 10)
    public static void sumOfString() {

        var a="2";
        var b=4.0;



        BiFunction<String, String, String> func = (var x, var y) -> x + y;
        System.out.println(func.apply("abc", "efg"));




    }




    public static void main(String[] args) {
        sumOfString();
    }

}
