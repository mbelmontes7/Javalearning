package Datas;
import java.util.LinkedList;
import java.util.Iterator;

public class CircularLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add some elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");  

        // Create an iterator for the list
        Iterator<String> iterator = list.iterator();

        // Iterate over the elements using the iterator
        while (iterator.hasNext()) { 
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
