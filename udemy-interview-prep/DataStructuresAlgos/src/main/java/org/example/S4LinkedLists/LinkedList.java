
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

    public void append(int value) {
        Node newNode = new Node(value);
        // 1. What if the list is empty?
        if (length == 0) { // Could check if head == null or tail == null as well
            head = newNode; // remember head and tail are POINTERS, since there is only one value to be assigned in the linked list than both tail and head must point to the same value.
            tail = newNode;
        } else { // 2. Append when list is NOT empty.
            tail.next = newNode; // next after tail
            tail = newNode; //
        } // 3. Increase the length of the linked list by 1
        length++;
    } //append

    // Remove item from END of list
    public Node removeLast() {
        //        1. when the linked list is empty
        if (length == 0)
            return null; // could also test for head == null or tail == null -> all 3 options will confirm the list is empty.
        //        2. remove the item from the end and return item (when there are multiple items in the list)
        //          Move tail to the previous node, and move node.next of previous node to "null"
        //          -> Must iterate through all the nodes until node.next = null (this will indicate the last node in the list)
        //          -> Need two variable, the before node & checking node.
        //          -> set before to the node previous to check node. Once check node == null; sent tail = before node.
        //          -> return check.
        Node before = head;
        Node check = head;
        while (before.next != null) {
            before = check; // if the next node is not null, move before to the next node
            check = check.next; // also move check to the next node.
        } // Once the loop is broken (before.next == null) then set tail = before & tail.next = null and return check;
        tail = before;
        tail.next = null;
        length--; // update the length to be equal to one less
        //        3. When there is only one item in the list
        if (length == 0) { // If after decrementing length, it is = 0 we need to remove head and tail pointers
            head = null;
            tail = null;
        }
        return check;
    } // removeLast

    //    ADD item to the beginning of the list.
    public void prepend(int value) {
        //        1. if list is empty
        //        2. create a new node that points to the head node
        //        3. make head point to the new node
        Node newNode = new Node(value);
        if (length == 0) { // If list is empty set head and tail to the newNode
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // assign head as the newNode's next
            head = newNode; // assign the head pointer to the newNode
        }
        length++;
    }

    //    Remove First
    public Node removeFirst() {
        //        1. check if list is empty.
        //        2. check if only one item
        //        3. move head to head.next
        //        4. return removed node
        Node removedItem;
        if (length == 0) {
            return null;
        } else {
            removedItem = head;
            head = head.next; //reassign the head to the "next" value
            removedItem.next = null; // remove the next value from the item you are removing
            length--;
            if (length == 0) { // check for a length of 0 (indicating that the list length was only 1 to begin with.)
                tail = null;
            }
            return removedItem;
        }
    } //removeFirst

    //    GET node at a particular index, and return it
    public Node get(int index) {
        //        1. cannot get a node at indexes that don't exist.
        if (index < 0 || index >= length) return null; // indicating the item at index does not exist.
        Node temp = head; // Start at the beginning of the linked list
        for (int i = 0; i < index; i++) { // move the temp node along the list until it makes it to the index
            temp = temp.next;
        }
        return temp;
    } // get

    //    Set a new value at a particular index and return true if successful, false if we could not set the value.
    public boolean set(int index, int value) {
        Node temp = get(index); // get the node that we want to set to a new value. -> get method with check to see if index is out of range (return null if out of range) return the node if within range.
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    } // set

    public boolean insert(int index, int value) {
        //        Cannot insert if out of range
        if (index < 0 || index > length) return false; // index out of range
        if (index == 0) { // the index is 0, so we want to prepend (add to the very first spot in the list)
            prepend(value);
            return true;
        }
        if (index == length) { // indicates its the last node in the list so use the method we already made for that.
            append(value);
            return true;
        }
//        Insert into a spot on the list that is within range and not the first or last index.
//        1. create a new Node to be inserted
//        2. create a variable to hold the place where the node will be inserted.
        Node newNode = new Node(value);
        Node temp = get(index -1); // get the node at the index before where we want the newNode placed
        newNode.next = temp.next; // set the pointer on newNode to be the temp.next
        temp.next = newNode;
        length ++;
        return true;
    } // Insert

    public Node remove (int index) {
//  1. Make sure the index is within range
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length -1) return removeLast();
        Node previous = get(index -1); //grab the node before the one we want to remove
        Node temp = previous.next; // grab the node we want to remove
        previous.next = temp.next;
        temp.next = null;
        length --;
        return temp;
    }





} // Linked Lists
