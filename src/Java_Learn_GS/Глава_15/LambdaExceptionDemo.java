package Java_Learn_GS.Глава_15;

/**
 * Created by GM on 28.07.2015.
 */
interface DoubleNumericArrayFunc {
    double func (double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum;
        };

        System.out.println("Среднее равно " + average.func(values));

        try {
            System.out.println("Среднее равно " + average.func(new double[0]));
        } catch (EmptyArrayException e) {
            System.out.println("Произошло исключение:");
            System.out.println(e);
        }
    }
}
