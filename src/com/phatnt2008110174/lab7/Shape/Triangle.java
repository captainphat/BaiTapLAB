/*
* create date: 20 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Shape;

public class Triangle extends Shape{
    protected Triangle (String s){
        super(s);
    }
    protected void playSound(){
        System.out.println("insert am thanh.AIF: "+ getSound());
    }
}
