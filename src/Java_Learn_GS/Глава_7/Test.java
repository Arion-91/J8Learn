package Java_Learn_GS.Глава_7;

/**
 * Created by GM on 05.07.2015.
 */
class Test {
    int a;
    public int b;
    private int c;

    void setC(int i) {
        c = i;
    }
    int getC() {
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

        //  ����  ����� ���  �� �����  �  ���� �  �������  ������
        //  �b .�  =  100;  // ������ !

        ob.setC(100);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
