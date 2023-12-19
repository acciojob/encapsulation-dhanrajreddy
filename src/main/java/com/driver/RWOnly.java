package com.driver;

public class RWOnly {
    private int name;
    private void setter(int input){
        name =input;
    }

    private int getter(){
        return name;
    }

    public void setName(int input){
        setter(input);
    }

    public int getName(){
        return getter();
    }
}
