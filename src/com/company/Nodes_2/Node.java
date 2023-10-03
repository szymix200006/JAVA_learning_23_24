package com.company.Nodes_2;

public class Node <T> {
    protected T element;
    protected Node<T> next;

    protected  Node(T element) {
        this.element = element;
    }

    protected  Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}
