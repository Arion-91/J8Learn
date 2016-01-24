package Java_Learn_GS.Глава_13;

/**
 * Created by GM on 23.07.2015.
 */
class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class Instanceof {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("а является экземпляром А");
        }
        if (b instanceof B) {
            System.out.println("b является экземпляром B");
        }
        if (c instanceof C) {
            System.out.println("c является экземпляром C");
        }
        if (d instanceof D) {
            System.out.println("d является экземпляром D");
        }

        if (a instanceof C) {
            System.out.println("а можно привести к типу С");
        }
        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D) {
            System.out.println("ob является экземпляром D");
        }
        System.out.println();

        ob = c;
        System.out.println("ob теперь ссылается на c");
        if (ob instanceof D) {
            System.out.println("ob можно привести к типу D");
        } else
            System.out.println("ob нельзя привести к типу D");

        if (ob instanceof A)
            System.out.println("ob можно привести к типу А");
        System.out.println();

        if (a instanceof Object)
            System.out.println("а является экземпляром Object");
        if (b instanceof Object)
            System.out.println("b является экземпляром Object");
        if (c instanceof Object)
            System.out.println("c является экземпляром Object");
        if (d instanceof Object)
            System.out.println("d является экземпляром Object");
    }
}