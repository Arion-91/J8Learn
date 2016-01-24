package Java_Learn_GS.Глава_3;

/**
 * Created by arion on 26.12.2015.
 */
class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days, second, distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; // указать количество дней
        second = days * 24 * 60 * 60; // преобразовать в секунды
        distance = lightspeed * second; // вычислить расстояние

        System.out.println("За " + days + " дней свет пройдет около " + distance + " миль.");
    }
}
