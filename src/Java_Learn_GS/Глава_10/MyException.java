package Java_Learn_GS.Глава_10;

/**
 * Created by GM on 16.07.2015.
 */
class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toSring() {
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
