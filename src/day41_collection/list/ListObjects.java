package day41_collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {
        ArrayList <String> list= new ArrayList<>();//reference of the interface list ,but the object is an Arraylist

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));


        List<String> list2= new LinkedList<>();//reference of the interface list ,but the object is an Arraylist

        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));

        List<String> list3= new Vector<>();//reference of the interface list ,but the object is an Arraylist

        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));
    }
}
