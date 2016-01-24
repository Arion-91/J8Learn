package Java_Learn_GS.Глава_15;

/**
 * Created by GM on 28.07.2015.
 */
interface NumericTest {
    boolean test(int n);
}

class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2)==0;

        if (isEven.test(10))
            System.out.println("Число 10 четное");
        if (!isEven.test(9))
            System.out.println("Число 9 нечетное");

        NumericTest isNonNeg = (n) -> n >=0;
        if (isEven.test(1))
            System.out.println("Число 1 неотрицательное");
        if (!isEven.test(-1))
            System.out.println("Число -1 отрицательное");
    }
}
