import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid8 extends Actor
{
    /**
     * Act - do whatever the asteroid8 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setLocation(getX()-10, getY());
        if(getX()==0)
        {
                setLocation(1240,getY());
        }
          pesawat i = (pesawat)getOneIntersectingObject(pesawat.class);
        if(i!=null)
        {
        Greenfoot.playSound("explode.wav");
        setImage("end.png");
        Greenfoot.stop();
    }
    }
}
