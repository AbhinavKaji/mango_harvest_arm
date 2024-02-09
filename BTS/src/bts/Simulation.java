/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bts;

import harvester.Bin;
import harvester.HarvesterArm;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Simulation.java 
 * Purpose of class: main class to start the project
 *
 * @author 12206895
 */
public class Simulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bin bin = new Bin(4);
        HarvesterArm harvesterArm = new HarvesterArm(bin);
        if (harvesterArm.execute()) {
            System.out.println("Execution succeeded");
        } else {
            System.out.println("Execution failed");
        }
    }
    
}
