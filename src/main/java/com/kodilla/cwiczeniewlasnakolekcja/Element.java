package com.kodilla.cwiczeniewlasnakolekcja;

public class Element {
    private String value;
    public Element next;
    public Element prev;

    public Element(String value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    public String getValue() {
        return this.value;
    }
    public Element setNext(Element nextElement) {
        this.next = nextElement;
    }
    public Element setPrev(Element prevElement) {
        this.prev = prevElement;
    }
    public Element getNext() {
        return this.next;
    }
    public Element getPrev() {
        return this.prev;
    }
}
