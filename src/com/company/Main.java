package com.company;

import com.company.Holders_1.Car;
import com.company.Holders_1.Compare;
import com.company.Nodes_2.Node;
import com.company.Nodes_2.Nodes;

public class Main {

    public static void main(String[] args) {
	    /*GenericHolder<Integer> genericHolder = new GenericHolder(13);
        System.out.println("Generic holder: ");
        System.out.println(genericHolder.getObj());
        System.out.println(genericHolder.getObj().getClass().getSimpleName());
        genericHolder.setObj(12);
        System.out.println(genericHolder.getObj() + 1);*/

        /*LiczbaHolder liczbaHolder1 = new LiczbaHolder();
        liczbaHolder1.setA(1344);
        System.out.println(liczbaHolder1.getA());

        LiczbaHolder liczbaHolder2 = new LiczbaHolder();
        liczbaHolder2.setA(1344);
        System.out.println(liczbaHolder2.getA());

        LiczbaHolder liczbaHolder3 = new LiczbaHolder();
        liczbaHolder3.setA(1344);
        System.out.println(liczbaHolder3.getA());

        System.out.println("Object holder: ");
        ObjectHolder objectHolder = new ObjectHolder(123);
        System.out.println(objectHolder.getObj());
        System.out.println(objectHolder.getObj().getClass().getSimpleName());
        objectHolder.setObj(100);
        System.out.println((int)objectHolder.getObj() + 1);*/

        /** Zadanie 1.1 - 1.2 */
        /*
        Compare MyComparator = new Compare();
        MyComparator.compareValues(1,1);
        MyComparator.compareValues(1.1d,2.2d);
        MyComparator.compareValues(1.0f,0.1f);
        MyComparator.compareValues((byte)1, (byte)2);
        MyComparator.compareValues("00001", "2");
        */
        /** Zadanie 1.3 */

        /*Compare MyComparator = new Compare();
        MyComparator.compareValues(new Car("BMW", 100.1d, 100, 100), new Car("AUDI", 100d, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 101, 100), new Car("AUDI", 100, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 100, 999), new Car("AUDI", 100, 101, 100));
        MyComparator.compareValues(new Car("BMW", 100.1f, 100, (byte)101), new Car("AUDI", 100.1f, 100, (byte)100));*/

        //Node n1 = new Node(25);
        //Node n2 = new Node("Hello");

        //Node n3 = new Nodes().create(27);
        //Node n4 = Nodes.create(27);
        //Node n5 = Nodes.create(27);
        Node firstNode = Nodes.link(Nodes.create(25), Nodes.create("Hello"));

    }
}
