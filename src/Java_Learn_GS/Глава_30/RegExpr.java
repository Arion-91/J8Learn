package Java_Learn_GS.Глава_30;

import java.util.regex.*;

/**
 * Created by arion on 26.10.2015.
 */
class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();

        System.out.println("Проверка совпадения Java c Java:");
        if (found) System.out.println("Совпадает");
        else System.out.println("Не совпадает");
        System.out.println();

        System.out.println("Проверка совпадения Java c Java 8:");
        mat = pat.matcher("Java 8");

        found = mat.matches();
        if (found) System.out.println("Совпадает");
        else System.out.println("Не совпадает");
    }
}
