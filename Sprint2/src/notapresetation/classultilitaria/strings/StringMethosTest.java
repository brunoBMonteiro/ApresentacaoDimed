package notapresetation.classultilitaria.strings;

public class StringMethosTest {
    public static void main(String[] args) {

        String nome = " Tom   ";

        // retorna o char baseado no index
        System.out.println(nome.charAt(0));


        // retorna o tamanho da string
        System.out.println(nome.length());

// faz a busca e troca
        System.out.println(nome.replace("T","D"));

        // percorre a string do inicio do idex setado  ate o index final setado
        System.out.println(nome.substring(0,2));
        System.out.println(nome.substring(0,nome.length()));

        //remove valores em branco
        System.out.println(nome.trim());







    }
}
