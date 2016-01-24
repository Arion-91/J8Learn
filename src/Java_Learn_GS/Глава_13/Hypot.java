package Java_Learn_GS.Глава_13;

/**
 * Created by GM on 23.07.2015.
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("При заданной длине сторон " + side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}
