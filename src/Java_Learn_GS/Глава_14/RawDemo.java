package Java_Learn_GS.Глава_14;

/**
 * Created by GM on 26.07.2015.
 */
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    T getob() {
        System.out.print("Метод getob() из класса Gen2: ");
        return ob;
    }
}

class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<>("Текст обобщения");
        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getob();
        System.out.println("Значение: " + d);

        strOb = raw;
        raw = iOb;
    }
}
