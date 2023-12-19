package com.driver;

public class RWOnly {
    private String name;
    private void setter(String input){
        name =input;
    }

    private String getter(){
        return name;
    }

    public void setName(String input){
        setter(input);
    }

    public String getName(){
        return getter();
    }
}
