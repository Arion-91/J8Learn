package Java_Learn_GS.Глава_12;

/**
 * Created by GM on 19.07.2015.
 */
enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple2(int p) {
        price = p;
    }

    Apple2() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println("Яблоко сорта Winesap стоит " + Apple2.Winesap.getPrice() + " центов.\n");

        System.out.println("Цены на все сорта яблок:");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
        }
    }
}
