package com.example.rigg.weight_calculation;

import java.io.Serializable;

/**
 * Created by rigg on 2017/3/5.
 */

public class Info implements Serializable {
    private String sex="";
    private int height=0;
    private String name="";
    public String getSex() {
        String str1="Mr";
        String str2="Ms";
        if(sex.equals("man"))
            return str1;
        else
            return str2;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int Height) {
        this.height = Height;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public String getName(){
        return name;
    }


}