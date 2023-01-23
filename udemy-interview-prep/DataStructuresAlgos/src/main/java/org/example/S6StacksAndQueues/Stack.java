package org.example.S6StacksAndQueues;
import org.w3c.dom.Node;

public class Stack {
    class Node {
        int value;
        int next;

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
