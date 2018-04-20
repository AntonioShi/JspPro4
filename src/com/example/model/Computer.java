package com.example.model;

public class Computer {

    public double getResult(String op, double num1, double num2){
        double result = -1 ;
        switch (op){
            case "add":
                result = num1 + num2 ;
                break;
            case "minus":
                result = num1 - num2 ;
                break;
            case "quare":
                result = num1 * num2 ;
                break;
            case "divide":
                result = num1 * 1.0 / num2 ;
                break;
        }
        return result ;
    }
}
