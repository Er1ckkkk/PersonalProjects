package com.ericklopez.Exercises;


import java.util.Scanner;

public class LinkedList {
    Scanner keyboard = new Scanner(System.in);
    int input;
    Node head;

    public void performLinkedList() {
        System.out.println("Enter in the numbers that you would like to add to the list!");
        System.out.println("To stop entering please put in 99999");

        promptForInput();

        while (input != 99999) {
            insert(input);
            promptForInput();
        }
        show();
        System.out.println();
        askForInsertAtStart();
        askForIndexInsert();
        System.exit(0);
    }

    public void promptForInput() {
        input = keyboard.nextInt();
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data; //sets user input to the new nodes value
        node.next = null; //by default next is already null, added to make more readable

        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                //this loop checks and stops at the LAST node in the list
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //print all values
    public void show() {
        System.out.println("Here is your list: ");
        System.out.println();
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    public void askForInsertAtStart() {
        System.out.println("Would you like to add something to the start? 1/0: ");
        input = keyboard.nextInt();
        if (input == 1) {
            System.out.println("Enter in any number to put at the start: ");
            input = keyboard.nextInt();
            insertAtStart(input);
            show();
        } else if (input == 0)
            askForIndexInsert();
    }

    public void askForIndexInsert() {
        System.out.println("Would you like to add something at a specific index? 1/0: ");
        input = keyboard.nextInt();
        if (input == 1) {
            System.out.println("Enter in the index: ");
            int index = keyboard.nextInt();
            System.out.println("Enter in the value");
            input = keyboard.nextInt();
            insertAt(index, input);
            show();
        } else if (input == 0)
            System.exit(0);
    }
}
