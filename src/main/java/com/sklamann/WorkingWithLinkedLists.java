package com.sklamann;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedLists {

    //extra space in memory
    public static void main (String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(7);
        ListIterator<Integer> InegerListIterator = linkedList.listIterator();
        while(InegerListIterator.hasNext()) {
            System.out.println(InegerListIterator.next());
        }

    }


}
