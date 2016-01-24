package Java_Learn_GS.Глава_15;

/**
 * Created by GM on 30.07.2015.
 */
interface MyFuncT<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp (HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp (HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class  InstanceMethWithObjectRefDemo {
    static <T> int couner (T[] vals, MyFuncT<T> f,T v) {
        int count = 0;;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82), new HighTemp(90),
                new HighTemp(89), new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)};
        count = couner(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: " +count);

        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12), new HighTemp(24),
                new HighTemp(19), new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)};
        count = couner(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " +count);

        count = couner(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура меньше 89: " +count);

        count = couner(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Дней, когда максимальная температура меньше 19: " +count);
    }
}
