package Java_Learn_GS.Глава_7;

/**
 * Created by GM on 05.07.2015.
 */
class UseStatic {
    static int a = 3;
    static int b;
    final int FINAL_VALUE = 1234;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
