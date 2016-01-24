package Java_Learn_GS.Глава_3;

/**
 * Created by arion on 26.12.2015.
 */
class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус окружности
        pi = 3.13; // приблизительное значение числа pi
        a = pi * r * r; // вычислить площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
