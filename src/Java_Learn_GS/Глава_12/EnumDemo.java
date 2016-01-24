package Java_Learn_GS.Глава_12;

/**
 * Created by GM on 19.07.2015.
 */
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;
        System.out.println("Значение ap:" + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println("Переменная ap содержит GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт GoldenDel желтый.");
                break;
            case RedDel:
                System.out.println("Сорт RedDel красный.");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный.");
                break;
        }
    }
}
