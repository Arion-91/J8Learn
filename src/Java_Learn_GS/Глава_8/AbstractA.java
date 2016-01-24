package Java_Learn_GS.Глава_8;

/**
 * Created by GM on 08.07.2015.
 */
abstract class AbstractA {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конктретный метод.");
    }
}

class AbstractB extends AbstractA {
    void callme() {
        System.out.println("Реализация метода callme() из класса AbstractB.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        AbstractB abstractB = new AbstractB();

        abstractB.callme();
        abstractB.callmetoo();
    }
}
