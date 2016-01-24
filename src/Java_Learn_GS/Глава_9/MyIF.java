package Java_Learn_GS.Глава_9;

/**
 * Created by GM on 11.07.2015.
 */
public interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber() {
        return 0;
    }
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

    }
}