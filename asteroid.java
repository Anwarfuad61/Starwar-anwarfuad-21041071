import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid extends Actor
{
    /**
     * Act - do whatever the asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-8, getY());
        if(getX()==0)
        {
                setLocation(1240,getY());
        }
          pesawat a = (pesawat)getOneIntersectingObject(pesawat.class);
        if(a!=null)
        {
        Greenfoot.playSound("explode.wav");
        setImage("end.png");
        Greenfoot.stop();
    }
    }
}
