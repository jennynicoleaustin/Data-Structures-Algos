
package org.example.S4LinkedLists;

//::: Notes :::
// LinkedList vs ArrayList
// - LinkedLists do not have indexes
// - LinkedLists are not stored contiguously(define: sharing a common border/touching) -> they are spread out in memory

// Head -> points to the first node
// Tail -> points to the last node
// Final pointer in a list points to nothing (null)

// O(1)
//    ADD node to either the front or end of a linked list.
//    REMOVE node from BEGINNING of linked list

// O(n)
//   REMOVE from the end of a linked list
//    - must iterate through the linked list to get the last pointer, so that we can have the tail point to the last node as well
//   ADD to a particular position in a linked list.

// O(n)
// LOOK for an item in a linked list
//    - Iterate through the whole list.
//    -- If you know the index of an item, Array Lists are more efficient -> because you do not have to iterate through the whole array list to find the object

// What is a node?
//    - BOTH the VALUE & the pointer to the new node.


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
}

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


} // Linked Lists
