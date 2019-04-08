/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//master Branch 1
package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    public ClipTest() {
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
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue()
    {
       System.out.println("SetTitle");
        Clip clip = new Clip();
        String InitialTitle = "First Title";
        clip.setTitle(InitialTitle); // Set title as First Title to the clip  
        // try to set Empty Title
        String EmptyTitle = "";
        clip.setTitle(EmptyTitle);              
        // check title is modified
        String ModifiedTitle = clip.getTitle(); // check Empty Title is set or not 
        // Compare  Initial title and resulted title
        assertTrue(InitialTitle.equals(ModifiedTitle));
        System.out.println("Empty Title is not accepted");     
        
    }

    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
       
    }

    @Test
    public void testEqualsOnEqualClips() 
    {
       
    }
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
    }
    
    @Test
    public void testSetEndToNegativeNumberKeepsPreviousValue() 
    {
    }
    
    @Test
    public void testSetStartToValidPositiveNumber() 
    {    
    }
    
    
    
}
