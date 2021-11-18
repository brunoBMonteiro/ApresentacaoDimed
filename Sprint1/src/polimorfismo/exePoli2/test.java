package polimorfismo.exePoli2;

public class test {
    public static void main(String args[]){
        ABC obj = new XYZ();
        obj.myMethod();

        ABC obj2 = new ABC();
        obj2.myMethod();


    }
}
