package Java_Learn_GS.Глава_7;

/**
 * Created by GM on 05.07.2015.
 */
class Outher {
    int outher_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("вывод: outher_x = " + outher_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outher outher = new Outher();
        outher.test();
    }
}