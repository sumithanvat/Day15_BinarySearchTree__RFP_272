package com.bridgelabz;
/*
* Creating Class INode
 */
public class INode<T extends Comparable<T>>{
    /*
    * Initializing data,NextRN,NextLN
     */
    T data;
    INode<T> NextRN;
    INode<T> NextLN;

    public INode(T data) {
        this.data = data;
    }
}