package Java_Learn_GS.Глава_12;

/**
 * Created by GM on 19.07.2015.
 */
class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Константы перечислимого типа Apple:");

        Apple allapples[] = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
        }

        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержи " + ap);
    }
}
