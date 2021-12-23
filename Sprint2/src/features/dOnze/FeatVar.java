package features.dOnze;

import java.util.function.BiFunction;

public class FeatVar {
    public static void sumOfString() {
        var a="2";
        var b=4.0;
                                  //now in java 11, can use lambda for Var
        BiFunction<String, String, String> func = (var x, var y) -> x + y;
        System.out.println(func.apply("abc", "efg"));




    }




    public static void main(String[] args) {
        sumOfString();
    }

}
