package estatico;



public class Estatico extends Data {




    public static void main(String[] args) {


         // não é necessário.
            Data d3 = new Data(3,4,1400);
            Data d1 = new Data(1,10,2021);
            Data d2 = new Data(2,1,1500);


       Object a ;

        System.out.println(d1.dia + "/" + d1.mes +"/"+ d1.ano);

        System.out.println(d2.dia + "/" + d2.mes +"/"+ d2.ano);

        System.out.println(d3.dia + "/" + d3.mes +"/"+ d3.ano);

        System.out.println(d1.dia + "/" + d1.mes +"/"+ d1.ano);

        System.out.println(d2.dia + "/" + d2.mes +"/"+ d2.ano);



    }


}
