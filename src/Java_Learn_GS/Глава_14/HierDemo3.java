package Java_Learn_GS.Глава_14;

/**
 * Created by GM on 26.07.2015.
 */
class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Текст обобщений");

        if (iOb2 instanceof Gen2<?>)
            System.out.println("Объект iOb2 является экземпляром класса Gen2");
        System.out.println();

        if (strOb2 instanceof Gen2<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen2");
        System.out.println();

        if (strOb2 instanceof Gen<?>)
            System.out.println("Объект strOb2 является экземпляром класса Gen");
        System.out.println();

        if (iOb instanceof Gen2<?>)
            System.out.println("Объект iOb является экземпляром класса Gen2");
        System.out.println();

        if (iOb instanceof Gen<?>)
            System.out.println("Объект iOb является экземпляром класса Gen2");
        System.out.println();
    }
}
