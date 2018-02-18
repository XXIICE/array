/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withoutten;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ariya boonchoo
 */
public class WithoutTenIT {
    
    
    @Test
    public void testWithoutTen() {
        System.out.println("withoutTen");
        int[] nums = {10,9,8,10};
        int[] expResult = {9,8,0,0};
        int[] result = WithoutTen.withoutTen(nums);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
