/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harvester;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Bin.java 
 * Purpose of class: Bin class to initialize a object representing a bin
 *
 * @author 12206895
 */
public class Bin {
    private int capacity;
    private int count;

    /**
     * constructor to initialize a bin object with its capacity
     * @param capacity is a capacity of bin
     */
    public Bin(int capacity) {
        this.capacity = capacity;
    }
    
    /**
     * method to empty the bin
     */
    public void empty(){
        this.count = 0;
    }
    
    /**
     * method to add apple into the bin
     */
    public void add(){
        count = count +1;
    }
    
    /**
     * method to check if bin is full or not
     * @return true if bin is full otherwise return false
     */
    public boolean isFull(){
        return capacity <= count;
    }

    /**
     * getter to get the count
     * @return value of count
     */
    public int getCount() {
        return this.count;
    }
}
