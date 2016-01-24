package Java_Learn_GS.Глава_18;

/**
 * Created by GM on 15.09.2015.
 */

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержание связного списка ll: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного саиска ll после удаления элеменотов: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("Содержимое связного саиска ll после удаления первого и последнего элеменотов: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println("Содержимое связанного списка ll после изменеия: " + ll);

    }
}
