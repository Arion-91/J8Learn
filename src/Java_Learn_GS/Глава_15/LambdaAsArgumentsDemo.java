package Java_Learn_GS.Глава_15;

/**
 * Created by GM on 28.07.2015.
 */
class LambdaAsArgumentsDemo {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражение повышают эффективностсь Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строк в верхнем регистре: " + outStr);

        outStr = stringOp((str) -> {
            String result ="";
            int i;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ')
                    result += str.charAt(j);
            }
            return result;
        }, inStr);
        System.out.println("Это строка с удаленными пробелами: " + outStr);

        StringFunc reverse = (str) -> {
            String result ="";
            int i;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ')
                    result += str.charAt(j);
            }
            return result;
        };
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
