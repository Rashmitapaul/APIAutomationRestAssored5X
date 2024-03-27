package org.example;

public class BuilderPatternDesignPatternJava {
    //Change return type of each method as class type"this" always points to current/calling objects.
    //Returning the same to have same reference.


    public BuilderPatternDesignPatternJava stag1(){
        System.out.println("Stag 1");
        return this;
    }
    public BuilderPatternDesignPatternJava stag2(String str){
        System.out.println("Stag 2 string is " + str);
        return this;
    }
    public BuilderPatternDesignPatternJava stag3(){
        System.out.println("Stag 3");
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        bp.stag1().stag2( "test").stag3();//Method chaining or BuilderPattern
    }
}
