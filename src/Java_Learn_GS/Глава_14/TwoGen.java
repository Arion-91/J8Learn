package Java_Learn_GS.Глава_14;

/**
 * Created by GM on 23.07.2015.
 */
class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщение");
        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Значеине: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
