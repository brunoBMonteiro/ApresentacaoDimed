package exeption;

public class Trycatch {
    public static void main(String[] args) {
// --------- only catch
        //openMyFile()
        try {
                //throw "myException"; // gera uma exceção
               // pode tratar exeptions separadas
        }catch (Exception e){

            // declarações para manipular quaisquer exceções

            // Ex mensagem de erro


            // executa mesmo dando a exeption
        }
        finally {
         //openMyFile()
        }
//------------------------------------- doble cacth
try{
    throw new ArithmeticException();
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Dentro do Array indexoutofbouds");
}catch (IndexOutOfBoundsException e){
    System.out.println("Index");
}catch (ArithmeticException | IllegalArgumentException e){
    System.out.println("Illegal ");
}


    }

}
