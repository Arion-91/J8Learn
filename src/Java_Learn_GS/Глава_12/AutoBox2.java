package Java_Learn_GS.Глава_12;

/**
 * Created by GM on 19.07.2015.
 */
class AutoBox2 {
    static int m (Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}

class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Исходное значение iOb: "+ iOb);

        ++iOb;
        System.out.println("После ++iOb: " + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 после выражения: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i после выражения: " + i);
    }
}

class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;
        if (b)
            System.out.println("b равен true");

        Character ch = 'x';
        char ch2 = ch;

        System.out.println("ch2 равно " + ch2);
    }
}