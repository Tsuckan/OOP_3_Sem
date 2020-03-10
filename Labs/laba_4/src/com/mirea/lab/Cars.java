package com.mirea.lab;

public class Cars implements TestIn{

    private String name;
    private int speed;

    Cars(String name1,int speed1){
        this.name = name1;
        this.speed = speed1;
    }
    private String getName(){
        return name;
    }
    private int getSpeed(){
        return speed;
    }
    @Override
    public void Info() {
        System.out.println(getName() + " can accelerate to " + getSpeed());

    }
}
