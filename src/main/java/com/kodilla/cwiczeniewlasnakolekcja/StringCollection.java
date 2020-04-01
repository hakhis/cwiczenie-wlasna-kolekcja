package com.kodilla.cwiczeniewlasnakolekcja;

public class StringCollection {
    Element collectionHead;
    Element pointer;
    int size;

    public StringCollection() {
        this.collectionHead = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    String getElement(int n) {
        if(n <= size) {
            pointer = collectionHead;
            if (n == 0) {
                return pointer.getValue();
            } else {
                for (int i = 0; i < n; i++) {
                    pointer = pointer.getNext();
                }
                return pointer.getValue();
            }
        } else return "The queue is smaller than " + n + " elements";
    }
    /*Zrobiłem 2 metody dodające nowy element*/
    //Dodaje nowy element na początku kolejki
    public void addElementFirst(String s) {
        if (collectionHead == null) {
            collectionHead = new Element(s);
        } else {
            pointer = collectionHead;
            collectionHead = new Element(s);
            pointer.setPrev(collectionHead);
            collectionHead.setNext(pointer);
        }
        size++;
    }

    //Dodaje nowy element na końcu kolejki
    public void addElementLast(String s) {
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
        size++;
    }

    public void showCollecction() {
        pointer = collectionHead;
        while (pointer != null) {
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
    }

    boolean removeElement(String s) {
        pointer = collectionHead;
        while (!pointer.getValue().equals(s)) {
            if (pointer.getNext() != null) {
                pointer = pointer.getNext();
            } else {
                System.out.println("Element not found");
                return false;
            }
        }
        if(pointer.getNext() == null) {
            pointer.getPrev().setNext(null);
        } else if (pointer.getPrev() == null){
            pointer.getNext().setPrev(null);
            collectionHead = pointer.getNext();
        } else {
            pointer.getNext().setPrev(pointer.getPrev());
            pointer.getPrev().setNext(pointer.getNext());
        }
        size--;
        return true;
    }
}
