package org.example.S7Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    // Insert
    //    1. create newNode
    //    temp = root (to check each item)
    //    2. while loop
    //      if newNode == temp return false (node value already exists)
    //      if < left else > right
    //      if null insert newNode else move to next

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) { // If the tree is empty, set root to the value of the new node
            root = newNode;
            return true;
        }
        Node check = root;
        while (true) {
            if (newNode.value == check.value) return false; // If the value already exists in the tree
            if (newNode.value < check.value) { // is the new node less than the check node?
                if (check.left == null) { // if the check nodes left spot empty so we can add on?
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

    public boolean contains(int value) {
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

    // Contains method using recursion
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false; // check for an empty search tree
        if (currentNode.value == value)
            return true; // if the current nodes value is equal to the value we are trying to find, return true.
        //        traverse through the tree to find the correct node
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    // Overloaded method with different parameters and public form
    public boolean rContains(int value) {
        return rContains(root, value); // recursively calls the other rContains that has both the currentNode and value parameters
    }

    // Insert using recursion
    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    // Delete with recursion
    //    1. You must traverse through the tree in order to find it.
    //    2. Delete it
    //      -> how to handle it if there are nodes below (to the right and left) of the node you want to delete.
    //          -> Single node: move the lower subtrees up to the removedNode's parent
    //          -> Nodes(subtrees) on either side.
    //            -> Right side: find the node (within the subtree on the right) with the lowest value
    //                -> copy that value into the removeNode's place. (you are not removing the "removeNode" but rather assigning it the new value)
    //                    -> Then move remove the value

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null)
            return null; // base case and the way to break out of the loop. handles if the tree is empty and also when we finally iterate through and remove the node we want to delete.
        if (value < currentNode.value) { // traverse left
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) { // traverse right
            currentNode.right = deleteNode(currentNode.right, value);
        } else { // we found the value we are looking for
            if (currentNode.left == null && currentNode.right == null) { // Leaf node -> no children nodes
                return null; // removes the currentNode from the tree
            } else if (currentNode.left == null) { // indicates there is only a subtree (children node) on the right side.
                currentNode = currentNode.right;
            } else if (currentNode.right == null) { // indicates there is only a child node on the left side
                currentNode = currentNode.left;
            } else { // when there is a child node on both the left and right side of the node you want to delete
                int subTreeMin = minValue(currentNode.right); // find the min value of the subtree that is on the right of the node you want to delete
                currentNode.value = subTreeMin; // change the value of currentNode (the one you want to delete) to the subtrees minimum value
                currentNode.right = deleteNode(currentNode.right, subTreeMin); // traverse through to find the duplicate value starting with the right side of the currentNode (where we found the minvalue in the first place)

            }

            // node to only the left or only the right
            // node on both the right and the left
        }
        return currentNode;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    //    Helper method that finds the minimum value in any binary search tree or subtree of a search tree
    //    -> go left until the next value == null. The node with the minimum value will always be open for adding nodes.
    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left; // continue to traverse the tree to the left until currentNode.left = null
        }
        return currentNode.value; // return the int value to be used inside the other function.
    }

    // Breadth First Search -> Tree Traversal Section 15
    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>(); // built in java Queue
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode); // contains the full node (value, left, right)
        while (queue.size() > 0) { // while the queue is not empty
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left); // if current node has a value on the left, add it to the queue.
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    //    Depth First Search -> using recursion

    //    PreOrder (DFS)
    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse { // work around to add a method inside a method in java
            Traverse(Node currentNode) {
                results.add((currentNode.value));
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        } //Traverse class
        new Traverse((root));

        return results;
    }

    //    DFS: PostOrder
    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse { // work around to add a method inside a method in java
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add((currentNode.value)); // Only difference from pre and post is where you add the value to the results array.
            }
        } //Traverse class
        new Traverse(root);
        return results;
    }

    //    DFS: InOrder

    public ArrayList<Integer> DFSInOrder() { // lowest to highest in numerical order
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse { // work around to add a method inside a method in java
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add((currentNode.value));
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        } //Traverse class

        new Traverse(root);
        return results;
    } // DFS: In Order


} // Binary Search Trees
