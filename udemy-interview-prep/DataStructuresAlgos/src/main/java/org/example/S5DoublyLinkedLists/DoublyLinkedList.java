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
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // assign the tail.next value to the new node instead of null.
            newNode.prev = tail; // give newNode a prev pointer of tail
            tail = newNode; // reassign the tail of the dbly linked list to be the newNode
        }
        length++;
    } // append

    public Node removeLast() {
        //        Because there are bidirectional pointers we do NOT have to iterate through the whole list to get to the last item in the list.
        if (length == 0) return null; // empty list = null
        Node temp = tail; // set the temp to the value of the tail
        if (length == 1) { // if only one item in the list then remove by setting head and tail to null
            head = null;
            tail = null;
        } else {
            tail = tail.prev; // tail is now the node previous to the old tail
            tail.next = null; // set the pointer of the removed item to null
            temp.prev = null; // set the pointer to previous on removed item to null
            length--;
        }
        return temp;
    } // removeLast

    public void prepend (int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // the head becomes the next
            head.prev = newNode; // the previous head is no longer null, but newNode
            head = newNode; // set the head to the newNode;
        }
        length ++;
    } // prepend


    public Node removeFirst() {
        if (length == 0) return null; // empty list
        Node removedItem = head; // first item in the list becomes removed item
        if (length == 1) {
            head = null; // remove pointers from removed item
            tail = null; //remove pointers from removed item
        } else {
            head = head.next; // next item in the list is now the head
            head.prev = null; // the heads left pointer now points to nothing
            removedItem.next = null; // the removed item gets a null right pointer
        }
        length --;
        return removedItem;
    }

    public Node get(int index){
        if (index < 0 || index >= length) return null; // if index is outside of range
        Node temp = head; // where temp = the first node you iterate via.
//        Efficiency -> since the list is doubly linked we can iterate through the list from the front or the back. go from front or back depending on the index number
        if (index < length/2) { // if index is in the first half of the list, start from the beginning
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else { // for indexes that are in the second half of the list, start from the tail and move to the left
            temp = tail;
            for (int i = length-1; i > index; i--) { // i = to last index, while i is less than the index decrement
               temp = temp.prev;
            }
        }
            return temp;
    }

    public boolean set (int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

} // DoublyLinkedList

