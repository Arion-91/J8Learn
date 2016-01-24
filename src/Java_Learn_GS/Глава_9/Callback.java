package Java_Learn_GS.Глава_9;

/**
 * Created by GM on 09.07.2015.
 */
class Callback implements IntCallback{
    public void callback(int p) {
        System.out.println("Метод callback(), вызывается со значением " + p);
    }
}

class AnotherClient implements IntCallback {
    public void callback(int p) {
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}

class TestIface2 {
    public static void main(String[] args) {
        IntCallback c = new Callback();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}

abstract class Incomplete implements IntCallback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}

interface IntCallback {
    void callback(int p);
}
