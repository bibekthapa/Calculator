/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.calc.command;

import com.example.calc.Calculate;

/**
 *
 * @author HOME
 */
public class AddCommand implements MathCommand{

    @Override
    public double Calculate(double x, double y) {
        return x+y;
    }
    
}
