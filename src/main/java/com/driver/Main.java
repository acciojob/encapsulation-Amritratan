package com.driver;

public class Main {
  // TAsk 3
  public static void main(String[] args) {
    RWOnly readWrite=new RWOnly();
    //TAsk 4
    readWrite.name="xyz";
    readWrite.roll_no=0000;
    System.out.println(readWrite.name, readWrite.roll_no);
    // after that we get error: name has private access in com.driver.RWOnly
  }

}