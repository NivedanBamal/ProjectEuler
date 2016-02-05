/*
 *The eight divisors of 24 are 1, 2, 3, 4, 6, 8, 12 and 24. 
 *The ten numbers not exceeding 100 having exactly eight divisors 
 *are 24, 30, 40, 42, 54, 56, 66, 70, 78 and 88. Let f(n) be the count of numbers not exceeding n with exactly eight divisors.
 *You are given f(100) = 10, f(1000) = 180 and f(10^6) = 224427.
 *Find f(10^12).
 */
package euler.problems;
import java.math.*;
/**
 *
 * @author Nivedan
 */
public class EightDivisors {
    public long solution(long N){
    long num = 0;    
    int temp = 0;
    double sq = 0.0;
        for (long i=1;i<=N;i++){
            sq = Math.sqrt(i);
            for(long j=1; j<sq && i/sq != (long)sq; j++){
                if(i%j == 0){
                   temp += 1; 
                }
                if(temp > 4){
                   break; 
                }
            }
            if (temp == 4 ){ // 4 because half of the divisors would be less than 
               num += 1;    // the sqrt of the number under EightDivisor test         
//               System.out.println(i);
            }
            temp = 0;  
        }
    return num;
    }
}
