package com.kodilla.cwiczeniewlasnakolekcja;

public class Element {
    private String value;
    private Element next;
    private Element prev;

    public Element(String value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    public String getValue() {
        return this.value;
    }
    public void setNext(Element nextElement) {
        this.next = nextElement;
    }
    public void setPrev(Element prevElement) {
        this.prev = prevElement;
    }
    public Element getNext() {
        return this.next;
    }
    public Element getPrev() {
        return this.prev;
    }
}
