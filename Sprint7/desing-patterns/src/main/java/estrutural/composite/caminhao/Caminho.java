package estrutural.composite.caminhao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 12/09/17.
 */
public class Caminho implements Trecho{
    private List<Trecho> trechos;

    public Caminho(){
        this.trechos = new ArrayList<Trecho>();
    }

    public void adiciona(Trecho trecho){
        this.trechos.add(trecho);
    }
    public void remove(Trecho trecho){
        this.trechos.add(trecho);
    }

    public void imprime() {
        for (Trecho trecho : this.trechos){
            trecho.imprime();
        }
    }
}