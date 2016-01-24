package Java_Learn_GS.Глава_10;

/**
 * Created by GM on 13.07.2015.
 */
class Exc2 {
    public static void main(String args[]) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль.");
        }
        System.out.println("После оператора catch.");
    }
}
