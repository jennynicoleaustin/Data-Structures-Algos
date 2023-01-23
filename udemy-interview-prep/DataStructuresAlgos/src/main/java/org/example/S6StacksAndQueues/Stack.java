package org.example.S6StacksAndQueues;

public class Stack {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node top; // equivalent to head in a linked list
    private int height; // equivalent to length in linked list

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

//  Add new node to the top of the stack
    public void push (int value) {
        Node newNode = new Node(value);
//        If stack is empty
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top; // assign the newNode's next node as the current top
            top = newNode; // assign the top to the newNode
        }
        height ++;
    }

    public Node pop () {
        if (height == 0) return null;
        Node poppedNode = top; // assign the top node to the new variable.
        top = top.next; // reassign top to the node next after the new top
        poppedNode.next = null; // assign null to next for removed item
        height --;
        return poppedNode;
    }





    // Methods for checking code in main method
    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

}
