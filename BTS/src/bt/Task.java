/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bt;

/**
 * Student Name: Kailashkaji Niraula
 * Student ID: 12206895 
 * Date: May 13 2023 
 * File Name: Task.java 
 * Purpose of class: interface class of Task
 *
 * @author 12206895
 */
@FunctionalInterface
public interface Task {
    /**
     * method of interface class used in lambda
     * @param s name of node
     * @return Boolean value from lambda definition
     */
    public boolean apply(String s);
}
