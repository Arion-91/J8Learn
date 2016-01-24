package Java_Learn_GS.Глава_13;

/**
 * Created by GM on 23.07.2015.
 */
class AssertDemo {
    static int val = 3;

    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getnum();

            assert n > 0;

            System.out.println("n равно " + n);
        }
    }
}
