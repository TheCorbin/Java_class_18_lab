package java_class_18_lab;

import java.util.*;

public class Employee implements Comparable{
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String toString(){
        String returnString = getFirstName() + " " + getLastName() + "  " + getSsn(); 
        return returnString;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    public boolean equals(Object target){
        if(target== null) {
            return false;
        }
       Employee e2 = (Employee)target;
       if (this.getSsn().equals(e2.getSsn())) {
           return true;
       } else {
           return false;
       }
    }
    
     public int compareTo(Object other) {
        String[] ssnParts = ssn.split("-");
        Integer[] intSsnParts = new Integer[ssnParts.length];
        Employee o = (Employee)other;
        String[] ssnParts2 = o.getSsn().split("-");
        Integer[] intSsnParts2 = new Integer[ssnParts.length];
        System.out.println(ssnParts[0] + " " + ssnParts[1] + " " + ssnParts[2]);
        
        
        int i=0;
        for (String str : ssnParts){
            intSsnParts[i++] = Integer.parseInt(str);
        }
        
        int x=0;
        for (String str : ssnParts2){
            intSsnParts2[x++] = Integer.parseInt(str);
        }
  
//        return new CompareToBuilder()
//               .append(this.empID, o.empID)
//               .toComparison();
        
        //NO Magic numbers! Use constants for readability!
        final int BEFORE = -1;
	final int EQUAL = 0;
	final int AFTER = 1;

        Employee e = (Employee)other;

        if(intSsnParts[0] < intSsnParts2[0]) return BEFORE;
        if(intSsnParts[0] > intSsnParts2[0]) return AFTER;
        
        if(intSsnParts[1] < intSsnParts2[1]) return BEFORE;
        if(intSsnParts[1] > intSsnParts2[1]) return AFTER;
        
        if(intSsnParts[2] < intSsnParts2[2]) return BEFORE;
        if(intSsnParts[2] > intSsnParts2[2]) return AFTER;
        
        if(this.equals(e)) return EQUAL;
        
        int comparison = this.getSsn().compareTo(o.getSsn());
        if( comparison != EQUAL) return comparison;

        return EQUAL; // default
    }
    
    

 }
    

