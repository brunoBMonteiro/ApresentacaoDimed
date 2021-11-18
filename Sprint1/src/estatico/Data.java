package estatico;

public class Data {
    static  int dia;
    int mes;
    int ano;
 public Data(){


 }

    static int getDia() {
        return dia;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }




}
