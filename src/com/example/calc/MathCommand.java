/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.calc;

/**
 *
 * @author HOME
 */
public class MathCommand implements Calculate{

    @Override
    public void Calculate(double x, double y, int ch) {
        
        switch(ch)
        {
        case 1:
                System.out.println(x+y);
                break;
        case 2:
            System.out.println(x-y);
             break;
        case 3:
            System.out.println(x*y);
             break;
        case 4:
            System.out.println(x/y);
             break;
            
        case 5:
            System.exit(0);
             break;
        
        
        }
        
    }
    
}
