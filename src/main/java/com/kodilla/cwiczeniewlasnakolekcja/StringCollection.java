package com.kodilla.cwiczeniewlasnakolekcja;

import java.util.Optional;

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

    String getElement(int index) {
        if(index <= size) {
            Element temp = collectionHead;
            int counter = 0;
            while (counter < index) {
                counter++;
                temp = temp.getNext();
            }
            return temp.getValue();
        } else return "The queue is smaller than " + index + " elements";
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
        Element element = new Element(s);
        if(collectionHead == null) {
            collectionHead = element;
        } else {
            Element temp = collectionHead;
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(element);
            element.setPrev(temp);
        }
        size++;
    }

    public void showCollection() {
        pointer = collectionHead;
        while (pointer != null) {
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
    }

    boolean removeElement(String s) {
        Element found = findElement(s);
        Optional.ofNullable(found).ifPresent(this::removeOneElement);
        size--;
        return found != null;
    }

    private void removeOneElement(Element e) {
        e.getPrev().setNext(e.getNext());
        e.getNext().setPrev(e.getPrev());
    }

    private Element findElement(String s) {
        Element found = null;
        Element temp = collectionHead;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            if (temp.getValue().equals(s)) found = temp;
        }
        return found;
    }
}
