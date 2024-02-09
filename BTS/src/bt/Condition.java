/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Condition.java 
 * Purpose of class: Condition class to represent the Condition Node objects.
 *
 * @author 12206895
 */
public class Condition extends Node{
    Task task;

    /**
     * Constructor to initialize a object of Condition type
     * @param n name of node
     * @param t task
     */
    public Condition(String n, Task t) {
        super(n);
        this.task = t;
    }
    
    /**
     * method to execute lambda operation
     * @return true if successfully executes otherwise returns false
     */
    @Override
    public boolean execute(){
        return task.apply(name);
    }
}
