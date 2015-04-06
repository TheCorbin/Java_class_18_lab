/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_18_lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ryancorbin
 */
public class Java_Class_18_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee jared = new Employee("Jared","Smith", "333-33-3333");
        Employee bobert = new Employee("Bobert","Roberts", "133-33-3333");
        Employee agnes = new Employee("Agnes","Tull", "233-33-3333");
        Employee sarah = new Employee("Sarah","Giteer", "333-33-3333");
        
        Map map = new HashMap();
 
        map.put("333-33-3333", jared);
        map.put("133-33-3333", bobert);
        map.put("233-33-3333", agnes);
        map.put("333-33-3333", sarah);
        
        Set keys = map.keySet(); 
        
        for(Object key : keys){
            Employee found = (Employee)map.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
        
        
        
        
        
        System.out.println("");
        System.out.println(map.get("333-33-3333"));
        
    }
    
}
