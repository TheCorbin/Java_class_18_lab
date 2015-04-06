/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_18_lab;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author ryancorbin
 */
public class Java_Class_18_Lab3 {

    public static void main(String[] args) {
    
        TreeMap<String, Employee> empMap = new TreeMap<String, Employee>();
        
        Employee jared = new Employee("Jared","Smith", "111-33-5555");
        Employee bobert = new Employee("Bobert","Roberts", "233-33-5555");
        Employee agnes = new Employee("Agnes","Tull", "233-33-5555");
        Employee sarah = new Employee("Sarah","Giteer", "111-33-3333");
    
        empMap.put(jared.getSsn(), jared);
        empMap.put(bobert.getSsn(), bobert);
        empMap.put(agnes.getSsn(), agnes);
        empMap.put(sarah.getSsn(), sarah);
        
                // Tree structures absolutely require that you implement the
        
        Set<String> keys2 = empMap.keySet();
        for(String key : keys2) {
            Employee found = empMap.get(key);
            System.out.println(found.toString() + " " + found.getSsn());
        }
    }
}
