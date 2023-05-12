package com.bridgelabz;

public class BinarySearchMain {
    // main method started
    public static void main(String[] args) {
        BinarySearch<Integer> bsTree=new BinarySearch<>();
        //uc1
        // adding 3 integers
        bsTree.add(56);
        bsTree.add(70);
        bsTree.add(30);
        //uc2
        bsTree.add(60);
        bsTree.add(22);
        bsTree.add(65);
        bsTree.add(11);
        bsTree.add(67);
        bsTree.add(3);
        bsTree.add(16);
        bsTree.add(63);
        // uc 3
        bsTree.search(bsTree.root,65);
        bsTree.show(bsTree.root);
        System.out.println();
        bsTree.search(bsTree.root,3);
        bsTree.show(bsTree.root);
    }
}
