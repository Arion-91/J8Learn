package Java_Learn_GS.Глава_14;

/**
 * Created by GM on 26.07.2015.
 */
class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        if(isIn(2, nums))
            System.out.println("Число 2 содержится в массиве nums");
        if(!isIn(7, nums))
            System.out.println("Число 7 отсутствует в массиве nums");
        System.out.println();

        String strs[] = {"один", "два", "три", "четыре", "пять"};
        if(isIn("два", strs))
            System.out.println("два сожержится в массиве strs");
        if(!isIn("семь", strs))
            System.out.println("семь сожержится в массиве strs");
    }
}
