/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.calc.command;

/**
 *
 * @author HOME
 */
public class Calculation {
    
    public void doCalculate(MathCommand cmd, double x, double y)
    {
        System.out.println(cmd.Calculate(x, y));
    
    }
    
}
