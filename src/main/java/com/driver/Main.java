package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly e=new RWOnly();
    e.setName(100);
    int ans=e.getName();
    System.out.println(ans);
  }
}