package polimorfismo.dinamico;

public class Test {
    public static void main(String[] args) {
        System.out.println("Carros");
        Carro  carro = new Carro();

        System.out.println(carro.modelo());

        System.out.println("Uno--------");
        Uno  uno = new Uno ();

        System.out.println(uno.modelo());


        //c= new Ferrari();
        //c = new Escort();

        // o objeto c pode virar qualquer calse mais especifica


    }
}
