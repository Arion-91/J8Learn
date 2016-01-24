package Java_Learn_GS.Глава_15;

/**
 * Created by GM on 30.07.2015.
 */
class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length()-1; i >=0; i--)
            result += str.charAt(i);
        return result;
    }

    String strReverseNonStatic(String str) {
        String result = "";
        int i;
        for (i = str.length()-1; i >=0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRefDemo {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражение повышает эффетивность Java";
        String outStr;

        System.out.println("Использование статического варианта:");
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Исходная строк: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

        System.out.println("Использование варианта вызова по ссылке на объект, т.е. не статического метода:");
        String outStrNonStatic;
        MyStringOps strOps = new MyStringOps();
        outStrNonStatic = stringOp(strOps::strReverseNonStatic, inStr);
        System.out.println("Исходная строк: " + inStr);
        System.out.println("Обращенная строка: " + outStrNonStatic);

    }
}