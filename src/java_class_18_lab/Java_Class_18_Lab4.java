/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_18_lab;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ryancorbin
 */
public class Java_Class_18_Lab4 {
    
    public static void main(String[] args) {
    
        Employee jared = new Employee("Jared","Smith", "111-33-5555");
        Employee bobert = new Employee("Bobert","Roberts", "233-33-5555");
        Employee agnes = new Employee("Agnes","Tull", "233-33-5555");
        Employee sarah = new Employee("Sarah","Giteer", "111-33-3333");
    
        Set<Employee> set = new TreeSet<Employee>();
        set.add(jared);
        set.add(bobert);
        set.add(agnes);
        set.add(sarah);


        // Get the size of the Set (which should now be 3, to prove that
        // the duplicate was removed AND the set is sorted!
        // ... then we can loop and output...
        System.out.println("The size of the Sorted Set is: " + set.size());
        for(Employee e : set) {
            System.out.println(e.toString());
        }    
        
    
    }
}
