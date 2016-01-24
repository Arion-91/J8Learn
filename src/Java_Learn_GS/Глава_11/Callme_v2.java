package Java_Learn_GS.Глава_11;

/**
 * Created by GM on 18.07.2015.
 */
class Callme_v2 {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller_v2 implements Runnable {
    String msg;
    Callme_v2 target;
    Thread t;

    public Caller_v2(Callme_v2 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}

class Synch1 {
    public static void main(String[] args) {
        Callme_v2 target = new Callme_v2();
        Caller_v2 ob1 = new Caller_v2(target, "Добро пожаловать");
        Caller_v2 ob2 = new Caller_v2(target, "в синхронизированный");
        Caller_v2 ob3 = new Caller_v2(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}