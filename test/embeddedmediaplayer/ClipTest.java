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
       //check two clips are equal as same title, start time and end time 
       System.out.println("Equal on equal clips");
       String ClipOneTitle = "Title"; //Create title
       Clip ClipOne = new Clip(ClipOneTitle,10,60); // Clip one, start time 10 and end time is 60
       
       Clip ClipTwo = new Clip();// Second clip
       String ClipTwoTitle = "Title"; //Create second sub video clip 
       ClipTwo.setTitle(ClipTwoTitle);   // Set Ttile  
       ClipTwo.setStart(10);//Set start time from 10 sec's
       ClipTwo.setEnd(60);// set end time aty 60 sec
       
       boolean DuplicateClip = ClipOne.equals(ClipTwo); 
       assertEquals(true,DuplicateClip); // its a duplicate video
       System.out.println("Same clip is found with same title, start time and endtime");          
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
