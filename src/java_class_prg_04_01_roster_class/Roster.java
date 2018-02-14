/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_04_01_roster_class;

/**
 * Represents students in a course section. A roster has a maximum size
 * and students cannot be added twice.
 * @author kbsmith01
 * @version 1.2
 */
public class Roster {
    
    /**
     * @param names - Names of students currently in roster
     * @param maximum - Maximum number of students in roster
     */
    private String[] names; // Names array
    private int maximum;    // Maximum number of students
    private int count;      // Current number of students in array
    
    // Takes in a class size parameter
    /**
     * Constructor creates roster's string array with parameter maximum.
     * @param maximum Maximum number of students / array size
     */
    public Roster(int maximum) {
        this.count = 0; // Initially no students
        this.maximum = maximum;
        this.names = new String[this.maximum];
    }
    
    // Overloaded constructor to create from file
    public Roster(String filename) {
        // To be built later
    }
    
    // By default a new roster is empty with a default size of 30
    public Roster() {
        this(30);
    }
    
    /**
     * Adds a name to the roster, performs validation to make sure
     * that there is room in the array to append the name
     * @param name New name to add to the roster
     */
    public void addName(String name) {
        if(count >= maximum) return;
        
//        Use validation method to validate name      
//        for(int i=0 ; i<count ; i++) {
//            if(name.equals(names[i])) return;
//        }
        
        // Typical validation, use methods instead of raw code
        if(isRosterFull()) return; // Is roster full?
        if(isNamePresent(name)) return; // Is name already present?
        
        this.names[this.count] = name;
        this.count++;
//        if(count < maximum) {
//            this.names[this.count] = name;
//            this.count++;
//        }
    }
    
    public void addNames(String[] names) {
        for(int i = 0 ; i < names.length; i++) {
            addName(names[i]);
        }
    }
    
    public boolean isRosterFull() {
        return count == maximum;
    }
    
    public boolean isNamePresent(String name) {
        for(int i = 0 ; i < count ; i++) {
            if(name.equals(names[i])) {
                return true;
            }
        }
        return false;
    }
    
    public String getNamesAsStrings() {
        String temp = "";
        for(int i = 0; i < count ; i++) {
            temp += names[i] + "\n";
        }
        
        return temp;
    }
    
    /**
     * Disadvantage of returning entire data object is that if the structure
     * of the method changes at a later time.
     * @return names array object
     */
    public String[] getNamesArray() {
        return names;
    }
    
    /**
     * Gets a name from the names array based on an input index value
     * @param index Index to be checked and name to be pulled from
     * @return Either error message or name from names array
     */
    public String getNamesIndex(int index) {
        
        if(index < count) {
            return names[index];
        }
        
        return "Error";
    }

}
