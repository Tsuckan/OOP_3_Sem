package com.mirea.lab;

public class Planets  implements TestIn  {

    private String name;

    Planets(String name1){
        this.name = name1;
    }
    private String getName(){
        return name;
    }

    @Override
    public void Info() {
       System.out.println(getName() + " is perfect planet");
    }

}
