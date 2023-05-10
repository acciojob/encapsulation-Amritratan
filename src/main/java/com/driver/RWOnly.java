package com.driver;

public class RWOnly {
//    Task 2
     private String name;
    // Task 5
    void writeOnly(String name){
        this.name=name;
    }
    String readOnly(){
        return name;
    }
    
}
