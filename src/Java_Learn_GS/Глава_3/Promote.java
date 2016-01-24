package Java_Learn_GS.Глава_3;

/**
 * Created by arion on 27.12.2015.
 */
class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1042;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result  = " + result);
    }
}
