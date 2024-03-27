package org.example;

public class BuilderPatternDesignPattern {
    //Change return type of each method as class type"this" always points to current/calling objects.
    //Returning the same to have same reference.


    public BuilderPatternDesignPattern stag1(){
        System.out.println("Stag 1");
        return this;
    }
    public BuilderPatternDesignPattern stag2(String str){
        System.out.println("Stag 1");
        return this;
    }
    public BuilderPatternDesignPattern stag1(){
        System.out.println("Stag 1");
        return this;
    }
}
