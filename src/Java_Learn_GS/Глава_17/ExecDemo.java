package Java_Learn_GS.Глава_17;

/**
 * Created by GM on 16.08.2015.
 */
class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }
        System.out.println("Notepad возвратил " + p.exitValue());
    }
}
