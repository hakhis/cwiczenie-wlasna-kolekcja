package com.kodilla.cwiczeniewlasnakolekcja;

public class StringCollection {
    Element collectionHead;
    Element pointer;
    public StringCollection() {
        this.collectionHead = null;
    }
    /*
    String getElement(int n) {

    }
    public void goToLast() {
        while(pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
    }
     */
    void addElement(String s) {
        if(collectionHead == null) {
            collectionHead = new Element(s);
        } else if(collectionHead.getNext() == null) {
            pointer = new Element(s);
            pointer.setPrev(collectionHead);
            collectionHead.setNext(pointer);
        } else {
            pointer = collectionHead;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(new Element(s));
            pointer.getNext().setPrev(pointer);
        }
    }
    public void showCollecction() {
        pointer = collectionHead;
        while (pointer != null) {
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
    }
    /*
    boolean removeElement(String s) {
        if(pointer.getValue() == s) {
            pointer.getPrev().setNext(pointer.getNext());
        }
    }
     */
}
