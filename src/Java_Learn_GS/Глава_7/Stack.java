package Java_Learn_GS.Глава_7;

/**
 * Created by GM on 05.07.2015.
 */
class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class EnterStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        }
    }
}