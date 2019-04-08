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
       System.out.println(" set end time to before start time");
       Clip clip = new Clip();
       String InitialTitle = "ClipOne"; 
       clip.setTitle(InitialTitle);   // Set Ttile  
       int ClipOneStartTime = 5; // start from 5th second
       int ClipOneEndtime = 40;// end at 40th second
       // Create a clipone 
       clip.setStart(ClipOneStartTime);
       clip.setEnd(ClipOneEndtime);
       // get current status of the clip
       int CurrentEndTime = clip.getEnd(); //Get end time of the clipone
       clip.setStart(CurrentEndTime); // set end time as start time to the clipone
       int ModifiedStartTime = clip.getStart();
       
       int ExpectedStartTime = ClipOneStartTime; // expected startm time is initial start time
       assertEquals(ExpectedStartTime,ModifiedStartTime);
       System.out.println("end time is not set, as endtime cannot be start time ");        
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
