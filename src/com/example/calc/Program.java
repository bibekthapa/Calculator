/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.calc;

import com.example.calc.command.AddCommand;
import com.example.calc.command.MathCommand;
import com.example.calc.command.MulCommand;
import com.example.calc.command.SubCommand;

/**
 *
 * @author HOME
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void  main(String[] args) {
        // TODO code application logic here
        
        int x=10;
        int y=5;
        int ch =4;
        
        MathCommand cmd=new MulCommand();
        System.out.println(cmd.Calculate(x, y));
        
      
    }

}     
    
    

