/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.problems;

/**
 *
 * @author Nivedan
 */
public class EvenFibonacciSum {
    public long solution(int limit){
        long sum = 0;
        int a = 1, b = 1, c = 0; // a = 0;
        while(c  < limit){
            
//           if (c % 2 == 0) 
//              sum += c;
//           c = a + b
//           a = b; 
//           b = c;

           sum += c;
           c = a + b;
           a = b + c;
           b = c + a;
           
        }
        
        return sum;
    }
}
