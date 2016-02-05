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
public class MultiplesOfThreeAndFiveTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void sumOfMultiplesTillThousand() {
         MultiplesOfThreeAndFive refObj = new MultiplesOfThreeAndFive();
         int res = refObj.solution();
         assertEquals("Expecting 233168 but got " + res ,res,233168);
     }
}
