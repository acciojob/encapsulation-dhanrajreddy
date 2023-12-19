package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly e=new RWOnly();
    e.setter(100);
    int ans=e.getter();
    System.out.println(ans);
  }
}