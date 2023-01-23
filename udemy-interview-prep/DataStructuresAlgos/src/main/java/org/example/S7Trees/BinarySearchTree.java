package org.example.S7Trees;

public class BinarySearchTree {

    class Node {
        int value;
        Node left;
        Node right;

        Node (int value) {
            this.value = value;
        }
    }

    Node root ;

// Insert
//    1. create newNode
//    temp = root (to check each item)
//    2. while loop
//      if newNode == temp return false (node value already exists)
//      if < left else > right
//      if null insert newNode else move to next

    public boolean insert (int value) {
        Node newNode = new Node(value);
        if (root == null) { // If the tree is empty, set root to the value of the new node
            root = newNode;
            return true;
        }
        Node check = root;
        while (true) {
            if (newNode.value == check.value) return false; // If the value already exists in the tree
            if (newNode.value < check.value) { // is the new node less than the check node?
                if(check.left == null) { // if the check nodes left spot empty so we can add on?
                    check.left = newNode; // add to the left of the check node
                    return true; // break out of the loop
                } // if the check.left spot is not empty...
                check = check.left; // move check to that left spot
            } else {
                if (check.right == null) {
                    check.right = newNode;
                    return true;
                }
                check = check.right;
            }
        }
    } // insert

//    Contains
//    -> find a number in the tree

    public boolean contains (int value) {
        if (root == null) return false; // if the tree is empty then it does not exist.
        Node checkNode = root; // start at the root of the tree
        while (checkNode != null) { // while there are still nodes to be checked
            if (checkNode.value < value) {
                checkNode = checkNode.left;
            } else if (checkNode.value > value) {
                checkNode = checkNode.right;
            } else {
                return true;
            }
        }
        return false;
    }



}