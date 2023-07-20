import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid9 extends Actor
{
    /**
     * Act - do whatever the asteroid9 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setLocation(getX()-6, getY());
        if(getX()==0)
        {
                setLocation(1240,getY());
        }
          pesawat j = (pesawat)getOneIntersectingObject(pesawat.class);
        if(j!=null)
        {
        Greenfoot.playSound("explode.wav");
        setImage("end.png");
        Greenfoot.stop();
    }
    }
}
