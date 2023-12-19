package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly e=new RWOnly();
    e.seter(100);
    int ans=e.geter();
    System.out.println(ans);
  }
}