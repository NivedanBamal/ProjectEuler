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
public class MultiplesOfThreeAndFive {
    public int solution(){
        int sum=0;
        for(int i=0;i<1000;i++){
            if(i%3==0 || i%5==0){
                sum += i;
            } 
        }
        return sum;
    }
}
