import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1250, 800, 1); 
        ViewActor ();
       
    }

    private void ViewActor()
    {
        addObject(new pesawat(), 40, 300);
        addObject(new asteroid(), 1150, 50);
        addObject(new asteroid1(), 1150, 100);
        addObject(new asteroid2(), 1150, 180);
        addObject(new asteroid3(), 1150, 240);
        addObject(new asteroid4(), 1150, 290);
        addObject(new asteroid5(), 1150, 340);
        addObject(new asteroid6(), 1150, 400);
        addObject(new asteroid7(), 1150, 480);
        addObject(new asteroid8(), 1150, 540);
        addObject(new asteroid9(), 1160, 600);
        Score Score = new Score();
        addObject(Score, 575, 10);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
