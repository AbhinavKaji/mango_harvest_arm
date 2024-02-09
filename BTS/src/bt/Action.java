/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Action.java 
 * Purpose of class: Action class to represent the Action Node objects.
 *
 * @author 12206895
 */
public class Action extends Node {

    Task task;

    /**
     * Constructor to initialize a object of Action type
     * @param n name of node
     * @param t task
     */
    public Action(String n, Task t) {
        super(n);
        this.task = t;
    }

    /**
     * method to execute lambda operation
     * @return true if successfully executes otherwise returns false
     */
    @Override
    public boolean execute() {
        // task is a member variable of type Task. It refers
        // to the lambda that was passed into the constructor when the 
        // object was constructed.  
        // The lambda is executed by invoking task.apply(name).
        // For action a2 (constructed above) it is the lambda to simulate 
        // advancing the arm.   
        return task.apply(name);

    }
}
