package com.myserver.demos;

import java.util.UUID;

public class City {
    private final String id;
    private String name;
    private  int temp;

    public City(String id,String name,int temp){
        this.id = id;
        this.name = name;
        this.temp = temp;
    }

    public City(String name, int temp){this(UUID.randomUUID().toString(),name,temp);}
    public String getId(){return id;}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getTemp(){return temp;}

    public void setTemp(int temp) {
        this.temp = temp;
    }
}


