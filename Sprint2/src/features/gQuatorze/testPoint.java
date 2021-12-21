package features.gQuatorze;

public class testPoint {
    public static record Point(int x, int y) {

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }


    // test , ajuda na no  caso de nullpointers

    public static void main(String[] args) {
int x =1;

int y = Integer.parseInt(null);


        Point point = new Point(x, y);

        System.out.println(point);

    }

}
