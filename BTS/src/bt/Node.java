/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Node.java 
 * Purpose of class: Node class to represent the Node in behaviour tree
 *
 * @author 12206895
 */
public class Node {
    String name;
    ArrayList<Node> children = new ArrayList<>();

    /**
     * Single parameterized Constructor to initialize node object
     * @param n name of node
     */
    public Node(String n) {
        this.name = n;
    }
    
    /**
     * multiple parameterized constructor to initilize node object
     * @param n name of node
     * @param nodes list of children
     */
    public Node(String n, Node... nodes) {
        this.name = n;
        this.children.addAll(Arrays.asList(nodes));
    }

    /**
     * method to add children in parent node
     * @param n 
     */
    public void add(Node n) {
        this.children.add(n);
    }

    /**
     * method to execute nodes. it is a method in parent class which is override in every child classes
     * @return 
     */
    public boolean execute(){
        return true;
    }
    
}
