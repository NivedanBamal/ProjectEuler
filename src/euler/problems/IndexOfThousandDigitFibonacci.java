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
public class IndexOfThousandDigitFibonacci {
    
    public int solution(){ //4782
    //Solution using binet's formulae - [ φn - (-1/φ)n ]/sqrt(5), φ =1.618034
        int n=1;
        double gRatio = 1.618034;
        int digits=0;
        while(digits != 1000){
            digits = (int)Math.floor( n*Math.log10(gRatio) - (Math.log10(5)/2) + 1);
            n++;
        }
        return n-1;
    }
    
}
