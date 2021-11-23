package immutableAndMutable.imuutable;

public class Immutable {

    public static void main(String[] args) {

        String str1 = new String("john");
        String str2 = str1 ;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        str2 = "monk";
        System.out.println(str2.hashCode());
        str2 = "john";
        System.out.println(str2.hashCode());


        System.out.println("-------------------------------");

        StringBuffer sb = new StringBuffer("mohan");
        StringBuffer sb1 = sb.append(" kumar");
        System.out.println(sb.hashCode());
        System.out.println(sb1.hashCode()+" - "+(sb1==sb)+" - "+sb.hashCode());






    }



}
