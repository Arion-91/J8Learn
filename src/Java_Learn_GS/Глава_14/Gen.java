package Java_Learn_GS.Глава_14;

/**
 * Created by GM on 23.07.2015.
 */
class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getob();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщения");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("Значение: " + str);
    }
}