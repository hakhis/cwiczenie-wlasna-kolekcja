package com.kodilla.cwiczeniewlasnakolekcja;

public class TestRun {
    public static void main(String[] args) {
        StringCollection collection1 = new StringCollection();
        for (int i = 0; i < 10; i++) {
            collection1.addElement("Element " + i);
        }
        collection1.showCollecction();
    }
}
