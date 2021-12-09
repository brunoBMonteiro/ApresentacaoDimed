package exeption.errors;

import java.util.HashMap;

public class StackOverFlow {

public static void recursividade(){

    recursividade();

}

    public static void main(String[] args) {

    recursividade();
    }

}
