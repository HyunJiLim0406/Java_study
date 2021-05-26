package chap6;

class MyPoint{
    int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
    }
}

public class Exercise6_6 {
//    static double getDistance(int x, int y, int x1, int y1) {
//        return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
//    }
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }
}
