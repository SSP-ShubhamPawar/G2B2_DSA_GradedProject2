package com.example.main;

import java.util.Scanner;

import com.example.main.BinarySearchTreeMain.Node;

public class SkewedTreeMain {
 
    // BST node
    static class Node {
        int key;
        Node left, right;
        Node(int k)
        {
        	this.key = k;
        }
    };
 
  
 
 
    // Driver code
    public static void main(String args[])
    {
        /* Let us create following BST
                50
              /   \
            30      70
            / \   / \
           20 40 60 80 */
    	
			
    	Node tree = new Node(50);
    	tree.left = new Node(30);
    	tree.right = new Node(60);
    	tree.left.left = new Node(10);
    	tree.left.left.right = new Node(20);
    	tree.right.left= new Node(55);
    }
}
