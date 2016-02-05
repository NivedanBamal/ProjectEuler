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
public class LargestPrimeFactor {
    public long solution(long num){
     long ans= 0;
     long first=0;
     long second=0;
     
     while(num%2 == 0){
          num = num / 2;
          if(num == 1){
              ans = 2;
          }
     }
     
     for(long i=3;i<=Math.sqrt(num);i++){

         if( num%i == 0){
             first = solution(num/i);
             second = solution(i);
             ans =  first > second ?  first : second;  
         } 
     }
     if (ans == 0){
        return num;
     }
     return ans;
    }
}
