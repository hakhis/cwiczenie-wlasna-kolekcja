package com.kodilla.cwiczeniewlasnakolekcja;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CwiczenieWlasnaKolekcjaApplication {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Adding " + n + " new elements at the end of queue");
        StringCollection collection1 = new StringCollection();
        for (int i = 0; i < n; i++) {
            collection1.addElementLast("Element " + i);
        }
        System.out.println("Queue size is: " + collection1.getSize());
        collection1.showCollection();
        System.out.println("\nTesting method getElement(n) for elements 0, 5 and 12");
        System.out.println(collection1.getElement(0));
        System.out.println(collection1.getElement(5));
        System.out.println(collection1.getElement(12));
        System.out.println("\nDeleting element \"Element 4\"");
        System.out.println(collection1.removeElement("Element 4"));
        System.out.println("Queue size is: " + collection1.getSize());
        collection1.showCollection();
        System.out.println("\nDeleting element \"Element 0\"");
        System.out.println(collection1.removeElement("Element 0"));
        System.out.println("Queue size is: " + collection1.getSize());
        collection1.showCollection();
        System.out.println("\nDeleting element \"Element 9\"");
        System.out.println(collection1.removeElement("Element 9"));
        System.out.println("Queue size is: " + collection1.getSize());
        collection1.showCollection();
        System.out.println("\nDeleting element \"Element 12\"");
        System.out.println(collection1.removeElement("Element 12"));
        System.out.println("Queue size is: " + collection1.getSize());
        collection1.showCollection();

        System.out.println("\nAdding " + n + " new elements at the beginning of queue");
        StringCollection collection2 = new StringCollection();
        for (int i = 0; i < n; i++) {
            collection2.addElementFirst("Element " + i);
        }
        collection2.showCollection();
    }

}
