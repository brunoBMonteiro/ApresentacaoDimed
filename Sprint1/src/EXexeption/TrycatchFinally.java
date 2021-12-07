package EXexeption;

public class TrycatchFinally {
    public static void main(String[] args) {
// --------- only catch
        //openMyFile()
        try {
                //throw "myException"; // gera uma exceção
               // pode tratar exeptions separadas
        }catch (Exception e){

          e.printStackTrace();
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
