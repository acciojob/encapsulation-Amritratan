package com.driver;

public class Main {
  // TAsk 3
  public static void main(String[] args) {
    RWOnly readWrite=new RWOnly();
    //TAsk 4
   // System.out.println(readWrite.name="abc");
    // after that we get error: name has private access in com.driver.RWOnly
    //Task 6
    readWrite.writeOnly("xyz");
    System.out.println(readWrite.readOnly());
  }

}