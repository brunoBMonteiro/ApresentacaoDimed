package features.fTreze;

public class PrevStringBlock {
    public static void main(String[] args) {

        System.out.println(" ----------------Multiline Strings (Preview)--------------------------");

        String htmlBeforeJava13 = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";

        System.out.println(htmlBeforeJava13);

        System.out.println("--------");

        String htmlWithJava13 = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;

        System.out.println(htmlWithJava13);




    }
}
