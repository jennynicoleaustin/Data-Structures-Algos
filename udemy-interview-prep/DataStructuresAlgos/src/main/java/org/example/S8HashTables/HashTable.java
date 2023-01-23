package org.example.S8HashTables;

public class HashTable {

    private int size; // size of the address spaces in the hash table
    private Node[] dataMap; // array of pointers to nodes

// Initialize address space
    public HashTable() {
        dataMap = new Node[size];
    }

// Class to create nodes for the address space
    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }



// Method used for checking work in main
    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if (dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }
}
