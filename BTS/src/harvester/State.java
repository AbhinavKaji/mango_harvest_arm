/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harvester;


/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: State.java 
 * Purpose of class: class to take status of state of activities
 *
 * @author 12206895
 */
public class State {
    private int attempts;
    private boolean pickable;
    private boolean payload;

    /**
     * constructor to initialize state as an object
     */
    public State() {
        attempts = 0;
        pickable = false;
        payload = false;
    }
    
    /**
     * getter to return attempts value
     * @return int value of attempts
     */
    public int getAttempts(){
        return this.attempts;
    }
    
    /**
     * method to increase the number of attempts by 1
     * @return int value of attempts
     */
    public int incrementAttempts(){
        this.attempts = attempts + 1;
        return attempts;
    }
    
    /**
     * method to return value of pickable attribute
     * @return Boolean value of pickable attribute
     */
    public boolean isPickable(){
        return pickable;
    }
    
    /**
     * method to set the Boolean value for pickable attribute
     * @param ripeness string either "ripe" or "unripe"(expected but can accept any string)
     */
    public void setPickable(String ripeness){
        this.pickable = ripeness.equalsIgnoreCase("ripe");
    }
    
    /**
     * method to return payload value
     * @return Boolean value of payload attribute
     */
    public boolean hasPayload(){
        return payload;
    }
    
    /**
     * setter to set value of Payload attribute
     * @param status Boolean status to set on payload
     */
    public void setPayload(boolean status){
        this.payload = status;
    }
}
