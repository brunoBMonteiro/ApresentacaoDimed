package notapresetation.classultilitaria.strings;

public class StringPerformaceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim =System.currentTimeMillis();
        System.out.println("Tempo Gasto para String "+ (fim - inicio)+ " Ms");


         inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
         fim =System.currentTimeMillis();
        System.out.println("Tempo Gasto para String "+ (fim - inicio)+ " Ms");


    }


    private static void concatString(int tamanho){
        String texto= "";
        for (int i = 0; i < tamanho; i++) {
            texto+=i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }



}
