/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.calc;

import com.example.calc.command.AddCommand;
import com.example.calc.command.Calculation;
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
        int ch =2;
        
       Calculation c = new Calculation();
       switch(ch){
           case 1 : 
       c.doCalculate( new AddCommand(), x, y);
          break;
          
          case 2:
          c.doCalculate(new SubCommand(),x,y);
          break;
          
          case 3:
              c.doCalculate(new MulCommand(), x, y);
              break;
    }}

}     
    
    

