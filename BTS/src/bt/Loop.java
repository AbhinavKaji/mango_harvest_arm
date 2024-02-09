/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Loop.java 
 * Purpose of class: Loop class to represent the Loop Node objects.
 *
 * @author 12206895
 */
public class Loop extends Node {

    /**
     * Constructor to initialize loop object
     * @param n name of node
     */
    public Loop(String n) {
        super(n);
    }

    /**
     * Constructor to initialize loop object with child nodes
     * @param n name of node
     * @param nodes list of child nodes
     */
    public Loop(String n, Node... nodes) {
        super(n, nodes);
    }

    /**
     * method to execute loop node which checks 2 childrens in a loop and executes them
     * @return true if successfully executes otherwise returns false
     */
    @Override
    public boolean execute() {
        if (children.size() < 2) {
            System.out.println("Loop node doesnot have two children");
            return false;
        }
        if(children.get(0) instanceof Condition){
            Node conditionNode = children.get(0);
            Node bodyNode = children.get(1);
            while (conditionNode.execute()) {
                bodyNode.execute();
            }
            return true;
        }else{
            System.out.println("First child of loop is not the condition node");
            return false;
        }
        
    }

}
