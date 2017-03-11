package com.example.rigg.weight_calculation;

import java.io.Serializable;

/**
 * Created by rigg on 2017/3/5.
 */

public class Info implements Serializable {
    private String sex="";
    private double height=0.00;
    private String name="";
    public String getSex() {
        if(this.sex.equals("woman")) {
            this.sex = "Ms";
        }else {
            this.sex = "Mr";
        }
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double Height) {
        this.height = Height;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        double weight= 0.0;
        if (this.sex.equals("Ms")) {
            weight = ( this.height - 70 ) * 0.6;
        }
        else{
            weight = ( this.height - 80 ) * 0.7;
        }
        return weight;
    }
}