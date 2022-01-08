package notapresetation.composicao.umparaum;

public class Motor {
   boolean ligado = false;
    double fatorInjecao = 1;

    int giros(){
                //math aredonda
        return (int)Math.round(fatorInjecao *3000);
    }


}
