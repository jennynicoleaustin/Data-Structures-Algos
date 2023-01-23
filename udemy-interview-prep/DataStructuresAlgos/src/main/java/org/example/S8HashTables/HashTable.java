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

    private int hash(String key) { //private because it will only be used by other methods within the HashTable class
        int hash = 0;
        char[] keyChars = key.toCharArray(); // pass in a string key and convert to an array of characters instead
        for (int i = 0; i < keyChars.length; i++) { // loop through the array of characters
            int asciiValue = keyChars[i]; // ascii character value = a num value that is assigned to each character in the alphabet
            // Equation below will always return a number that is equal to one of the indexes in the array.
            hash = (hash + asciiValue * 23) % dataMap.length; // why 23? because it is a prime number, which will give a more random number -> result = the remainder (range from 0->6)
        }
        return hash;
    }

    public void set (String key, int value) {
        int index = hash(key); // run hash method on the key to determine where the node should be placed on the hash table
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) { // if the dataMap at that particular index is empty (null) then insert at that point
            dataMap[index] = newNode;
        } else { // if dataMap at that index is not null (aka there are already items in the linked list)
            Node temp = dataMap[index]; //assign variable that we iterate through the list. initially set to the dataMap[index] (the pointer that points to the first node)
            while (temp.next != null) { // while data exists at the dataMap[index] (temp iterator) keep going to the next node.
                temp = temp.next;
            } // as soon as the value of temp.next is equal to null we break out of the loop.
            temp.next = newNode; // now set temp.next (which is currently null) to be equal to the newNode.
        }
    }

    public int get (String key) {
        int index = hash(key); // use the key to find the index of that node
        Node temp = dataMap[index]; // variable used to iterate through the dataMap -- if there is no nodes inside the dataMap then temp with be set to null
        while (temp != null) { // iterate through the list until you get to the end of the list (aka the null)
            if(temp.key.equals(key)) {
                return temp.value;
            }
        }
        return 0;
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
