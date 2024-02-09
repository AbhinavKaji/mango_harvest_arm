/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harvester;

import bt.Action;
import bt.Condition;
import bt.Loop;
import bt.Node;
import bt.Sequence;
import bt.Task;
import java.util.Scanner;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: HarvesterArm.java 
 * Purpose of class: class to initialize a HArvester arm and perform all the activities of tree
 *
 * @author 12206895
 */
public class HarvesterArm {

    private Node root;
    private Scanner scanner;
    private State state;
    private Bin bin;
    
    // lambda for the task of advancing the arm
    private Task advance = (n) -> {
        System.out.println(n + ": Advancing the arm");
        return true;
    };
    
    // lambda for the task of detecting ripeness of mango
    private Task detect = (n) -> {
        System.out.print(n + ": Is the mango ripe/unripe? ");
        scanner = new Scanner(System.in);
        String ripeness = scanner.nextLine();
        state.setPickable(ripeness);
        return true;
    };
    
    // lambda for the task of picking mango
    private Task grip = (n) -> {
        state.incrementAttempts();
        state.setPayload(state.getAttempts()%3 != 0);
        if (state.hasPayload()) {
            System.out.println(n + ": Picking the mango was successful");
        } else {
            System.out.println(n + ": Picking the mango was unsuccessful");
        }
        return true;
    };
    
    // lambda for the task of checking condition if bin is full or not
    private Task isNotFull = (n) -> {
        if(bin.isFull()){
            System.out.println(n + ": The bin is full");
            return false;
        }else{
            System.out.printf("%s: The bin contains %d mangoes%n",n,bin.getCount());
            return true;

        }
    };
    
    // lambda for the task of checking if mango is pickable or not
    private Task pickable = (n) -> {
        if (state.isPickable()) {
            System.out.println(n + ": the mango is ready for picking");
            return true;
        } else {
            System.out.println(n + ": The mango is not ready for picking \n");
            return false;
        }
    };
    
    // lambda for the task of action to retracting arm
    private Task retract = (n) -> {
        System.out.println(n + ": Retracting the arm");
        return true;
    };
    
    // lambda for the task of action to relaease mango in bin
    private Task release = (n) -> {
        System.out.println(n + ": Dropping the mango into the bin \n");
        state.setPayload(false);
        bin.add();
        return true;
    };
    
    // lambda for the task of condition to check gripper has mango or not
    private Task picked = (n) -> {
        if(state.hasPayload()){
            System.out.println(n + ": The gripper has a mango");
            return true;
        } else {
            System.out.println(n + ": The gripper has no mango \n");
            return false;
        }
        
    };

    /**
     * constructor to initialize harvesterarm object
     * @param bin  is a bin object
     */
    public HarvesterArm(Bin bin) {
        this.bin = bin;
        this.state = new State();
        this.root = build();
    }

    /**
     * a method to build a behaviour tree
     * @return a Loop node
     */
    private Node build() {
        return 
            new Loop("l1",
                new Condition("c1", isNotFull),
                new Sequence("s1",
                    new Action("a1", detect),
                    new Condition("c2", pickable),
                    new Action("a2", advance),
                    new Action("a3", grip),
                    new Action("a4", retract),
                    new Condition("c3", picked),
                    new Action("a5", release)
                )
            );
    }


    /**
     * a method to execute root node
     * @return true if everything executes successfully otherwise returns false
     */
    public boolean execute() {
        try{
            return root.execute();
        } catch(Exception ex){
            System.out.println("An exception occurs during execution \n message:"+ ex.getMessage());
            return false;
        }
    }
}
