package com.kodilla.cwiczeniewlasnakolekcja;

public class StringCollection {
    Element collectionHead;
    public StringCollection() {
        this.collectionHead = null;
    }
    String getElement(int n) {

    }
    void addElement(String s) {
        Element element = new Element(s);
        if(this.collectionHead == null) {
            this.collectionHead = element;
        } else {

        }
    }
    boolean removeElement(String s) {

    }
}
