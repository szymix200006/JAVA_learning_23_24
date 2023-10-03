package com.company.Nodes_2;

public class Nodes<T1> {
    /*public Node create(T1 element) {
        return new Node(element);
    }*/

    public static <T2>Node<T2> create(T2 element) {
        return new Node<T2>(element);
    }

    public static <T2>Node<T2> link(Node n1, Node n2) {
        n1.next = n2;
        return n1;
    }
}
