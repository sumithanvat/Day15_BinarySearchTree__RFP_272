package com.bridgelabz;

public class BinarySearch<T extends Comparable<T>> {
    INode<T> root;
    INode<T> currentPointer;
    //uc1
    // Creating add method
    public void add(T data){
        INode<T> newNode = new INode<>(data);
        if(root == null) {
            root = newNode;
            return;
        }
        INode<T> currentPointer= root;
        while(true) {
            if (data.compareTo(currentPointer.data) < 0) {
                if(currentPointer.NextLN == null){
                    currentPointer.NextLN= newNode;
                    return;
                }
                currentPointer = currentPointer.NextLN;
            } else {
                if(currentPointer.NextRN == null){
                    currentPointer.NextRN= newNode;
                    return;
                }
                currentPointer = currentPointer.NextRN;
            }
        }
    }
    public void show(INode<T> currentPointer){
        if (currentPointer == null)
            return;
        show(currentPointer.NextLN);
        System.out.print(currentPointer.data+" ");
        show(currentPointer.NextRN);
    }

    public void search(INode<T> currentPointer,T data){
        while(currentPointer!=null) {
            int value= data.compareTo(currentPointer.data);
            switch (value){
                case -1:
                    currentPointer = currentPointer.NextLN;
                    break;
                case 1:
                    currentPointer = currentPointer.NextRN;
                    break;
                default:
                    System.out.println("Element Found!!!");
                    return;
            }
        }
        System.out.println("Element Not Found!!!");
    }

}