/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author firstx
 */
public class FormManageBikeTest {
    
   
    public FormManageBikeTest() {
        
    }
    

    @Test
    public void testIsFill() {
        System.out.println("isFill");
        Database.init();
        FormManageBike instance = new FormManageBike();      
        boolean result = instance.isFill("");
        assertEquals(false, result);        
        result = instance.isFill("test");
        assertEquals(true, result);
       
    }

   
    
}
