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

/**
 *
 * @author massa
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
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

    

     

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
         instance.add("DATA1");
         instance.add("DATA2");
         instance.add("DATA3");
        assertEquals("DATA2",instance.getFirst());
    }
    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
         VectorHeap instance = new VectorHeap();
         instance.add("DATA");
        assertEquals("DATA",instance.remove());
    }
    }



 
    

