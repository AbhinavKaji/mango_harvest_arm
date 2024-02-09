/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;


/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Sequence.java 
 * Purpose of class: Sequence class to initialize a sequence node
 *
 * @author 12206895
 */
public class Sequence extends Node{

    /**
     * constructor to initialize sequence node object
     * @param n name of node
     */
    public Sequence(String n) {
        super(n);
    }
    
    /**
     * multiple parematerized constructor to initialize sequence node object
     * @param n name of node
     * @param nodes list of child node
     */
    public Sequence(String n, Node... nodes) {
        super(n, nodes);
    }
    
    /**
     * methods to execute all the children nodes untill it returs true
     * @return true when all children node returns true
     */
    @Override
    public boolean execute(){
        for (Node node : children) {
            if (!node.execute()) {
                return false;
            }
        }
        return true;
    }
}
