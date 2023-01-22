package org.example.S5DoublyLinkedLists;

// Singly linked list vs doubly linked list
// -> doubly linked lists have arrows that point both ways

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
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

//    Add new node to the end of the dbly linked list
    public void append (int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // assign the tail.next value to the new node instead of null.
            newNode.prev = tail; // give newNode a prev pointer of tail
            tail = newNode; // reassign the tail of the dbly linked list to be the newNode
        }
        length ++;
    }



} // DoublyLinkedList

