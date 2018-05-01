package com.kodilla.extraproject.linkedList;

public class MyLinkedList extends Exception {

    private Node firstElement;
    private int size;

    public void add(String text) {

        if (firstElement == null) {
            firstElement = new Node(text);
        } else {
            Node element = firstElement;
            while (element.getNext() != null) {
                element = element.getNext();
            }
            Node lastNode = new Node(text);
            element.setNext(lastNode);
            lastNode.setPrevious(element);
        }
        size += 1;
        //size = size + 1;
    }

    public boolean delete(String text) {
        Node element = firstElement;
        if (firstElement.getValue().equals(text)) {
            firstElement = firstElement.getNext();
            size -= 1;
            return true;
        }
        for (int i = 0; i < size; i++) {
            if (element.getValue().equals(text)) {
                element.getPrevious().setNext(element.getNext());
                element.getNext().setPrevious(element.getPrevious());
                size -= 1;
                return true;
            }
            element = element.getNext();
        }
        return false;
    }

    public String get(int index) {
        Node element = firstElement;
        if (index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++) {
                element = element.getNext();
            }
            return element.getValue();
        }
    }
}
