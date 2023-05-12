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
    public void traverse(INode<T> currentPointer){
        if (currentPointer == null)
            return;
        traverse(currentPointer.NextLN);
        System.out.print(currentPointer.data+" ");
        traverse(currentPointer.NextRN);
    }

    public void show(){
        traverse(root);
    }

}