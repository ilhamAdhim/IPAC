/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ipac.Operation;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @Test
    public void testIpFormat(){
        assertTrue(Operation.isIpFormat("192.168.1.255"));
    }
    @Test
    public void testUrlFormat(){
        assertFalse(Operation.isURLFormat("polinema.1c.id"));
    }
    @Test(timeout=10000)
    public void testConnectionSpeed() throws IOException{
        assertTrue(Operation.validAddress("polinema.ac.id").isReachable(10000));
    }
    @Test
    public void testClassIPString(){
        assertEquals("Class A", Operation.classType("127.161.1.1"));
    }
    @Test(expected = Exception.class)
    public void testValidInput(){
        assertEquals(null, Operation.classType(""));
    }


}
