package Java_Learn_GS.Глава_8;

/**
 * Created by GM on 07.07.2015.
 */
public class A2 {
    int  i;
}
class В2 extends A2 {
    int i;

    В2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члeн i в суперклассе: " +  super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        В2 subOb = new В2(1, 2);
        subOb.show();
    }
}