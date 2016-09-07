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
public class MulCommand implements MathCommand {

    @Override
    public double Calculate(double x, double y) {
     return x*y;   
    }
    
}
