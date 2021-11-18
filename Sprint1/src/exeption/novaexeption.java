package exeption;

public class novaexeption {

    //Cria uma Exception extendendo sua classe principal
    public static class SemLetraBException extends Exception {
        @Override

        // sobrescreve o metodo de mensagem da classe principal
        public String getMessage(){
            return "Não existe letra B em sua frase";
        }


    }

                                                    //chama a função criada
        public static void main(String args[]) throws SemLetraBException
        {
            String frase = "Sou um teste!";
            if(!frase.contains("b") || !frase.contains("B"))
                //chama a exception criada.
                // e lança
                throw new SemLetraBException();
        }

}
