import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private MyWorld peluru;
    public void addedToWorld(World MyWorld)
    {
        peluru = (MyWorld)MyWorld;
    }
    public void act()
    {
        //nembak
        if(Greenfoot.isKeyDown("x"))
        {
            peluru.addObject(new peluru(), getX(),getY());
            Greenfoot.playSound("fire.wav");
        }
        //scripcode untuk navigasi pesawat
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+4);
        }
        //menggerakan pesawat
        setLocation(getX()+2, getY());
        if(getX()==1240)
        {
                setLocation(40,getY());
        }
       
        
    }
}
