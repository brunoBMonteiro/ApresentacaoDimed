package exeption.errors;

public class StackOverFlow {

public static void recursividade(){
    recursividade();
}


    public static void main(String[] args) {

    // cabou memoria
        // erro que não comsegue se recuperar em tempo de execução.
    recursividade();
    }

}
