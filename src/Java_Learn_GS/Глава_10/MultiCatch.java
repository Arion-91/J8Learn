package Java_Learn_GS.Глава_10;

/**
 * Created by GM on 16.07.2015.
 */
class MultiCatch {
    public static void main(String[] args) {
        int a=10, b=0;
        int vals[] = {1,2,3};

        try {
            int result = a / b;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }
}
