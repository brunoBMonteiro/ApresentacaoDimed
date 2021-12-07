package EXexeption.runtimeTest;
// not cheked
public class RuntimeExeption02 {
    public static void main(String[] args) {


        // comentario
        divisao(1,0);



        // forma2
      /*  try {
            divisao(1,0);

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Codigo finalizado");

       */
    }


    /**
     * @param a
     * @param b  não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */

                                                  // flag
                                                   //  não é obrigatorio
private static int divisao(int a, int b) throws IllegalArgumentException{
/*

     // forma 1
    //Try cath  não vai para o codigo
    try{
        return  a/b;
    }catch (RuntimeException e){
        e.printStackTrace();
    }
    return 0;

 */


    // forma
    if (b==0){
        throw new IllegalArgumentException("Argumento ilegal, Não pode ser 0");
    }
    return  a/b;


}


}
