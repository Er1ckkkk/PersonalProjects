package com.ericklopez.Exercises;

public class HeapSort {
    int givenArray[] = {12, 34, 123, 92, 19, 46, 52, 17};

    public void performHeapSort(){
        printIntro();
        doSorting(givenArray);
        System.out.println("The sorted array looks like this: ");
        printArray(givenArray);


    }

    public void printIntro(){
        System.out.println("You are given the following array: ");
        printArray(givenArray);
        System.out.println();
        System.out.println("We will now attempt to sort it using heap sort");
        System.out.println();
    }

    public void printArray(int arr[]){
        int arrayLength = arr.length;
        for(int i = 0; i < arrayLength; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void heapify(int arr[], int sizeOfHeap, int root){
        int largest = root; //largest is root
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // if left greater than root
        if(left < sizeOfHeap && arr[left] > arr[largest])
            largest = left;

        // if right is greater than new largest
        if(right < sizeOfHeap && arr[right] > arr[largest])
            largest = right;

        //if largest is NOT the root
        if(largest != root){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, sizeOfHeap, largest);
        }
    }

    public void doSorting(int arr[]){
        //builds heap
        int n = arr.length;
        for(int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        //extract element from heap
        for(int i = arr.length - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }


}
