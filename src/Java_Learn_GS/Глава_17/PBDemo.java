package Java_Learn_GS.Глава_17;

/**
 * Created by GM on 16.08.2015.
 */
class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }
    }
}
