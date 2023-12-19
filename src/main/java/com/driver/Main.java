package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly e=new RWOnly();
    e.setName("Dhanush");
    String ans=e.getName();
    System.out.println(ans);
  }
}