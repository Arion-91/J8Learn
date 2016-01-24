package Java_Learn_GS.Глава_9;

/**
 * Created by GM on 11.07.2015.
 */
interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}

class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length-1)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
