package Java_Learn_GS.Глава_15;

/**
 * Created by GM on 30.07.2015.
 */
interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
            return v;
        };

    }
}

