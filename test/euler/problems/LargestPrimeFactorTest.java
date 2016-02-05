/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.problems;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedan
 */
public class LargestPrimeFactorTest {
    
    private LargestPrimeFactor objRef;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        objRef = new LargestPrimeFactor();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void onlyFactorIsTwo() {
         assertEquals("",2l,objRef.solution((long)Math.pow(2, 20)));
     }
     @Test
     public void allFactorsArePrime() {
         assertEquals("",37l,objRef.solution(9435l));
     }
     @Test
     public void factorsAreVeryLarge() {
         assertEquals("",982451653l,objRef.solution(89403100423l));
     }
     @Test
     public void noFactorsItsAPrimeNo() {
         assertEquals("",15485863l,objRef.solution(15485863l));
     }
     @Test
     public void veryLargeNumberNotDivisibleByTwo() {
         assertEquals("",15485863l,objRef.solution(2106077368l));
     }
}
