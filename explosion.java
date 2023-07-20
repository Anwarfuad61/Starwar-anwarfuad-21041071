import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Iterator;
import java.util.List;

/**
 * Write a description of class explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosion extends Actor
{
    /**
     * Act - do whatever the explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final static int IMAGE_COUNT =8;
    private static GreenfootImage[] images;
    private int size = 0;
    private int increment = 1;
    public explosion()
    {
        initialiseImage();
        setImage(images[0]);
        Greenfoot.playSound("explosion.wav");
    }
    public synchronized static void initialiseImage()
    {
        if(images == null )
        {
        GreenfootImage baseImage = new GreenfootImage("explosion.png");
        int maxSize = baseImage.getWidth()*8;
        int delta = maxSize / (IMAGE_COUNT+1);
        int size = 0;
        images = new GreenfootImage[IMAGE_COUNT];
        for(int i=0; i <IMAGE_COUNT; i++)
        {
            size = size + delta;
            images[i]= new GreenfootImage(baseImage);
            images[i].scale(size, size);
        }
    }
}
/**
 * EXPLODE
 */
    public void act()
    {
        // Add your action code here.
        setImage(images[size]);
        size += increment;
        if(size>=IMAGE_COUNT)
        {
            increment = -increment;
            size +=increment;
        }
        explodeOthers();
        if(size <=0)
        {
            getWorld().removeObject(this);
        }
    }
        /**
         * Explodes all intersecting object
         */
        private void explodeOthers()
        {
            List explodeEm = getIntersectingObjects(null);
            Iterator i = explodeEm.iterator();
            while(i.hasNext())
            {
                Actor a = (Actor) i.next();
                if(a instanceof asteroid1)
                {
                    int x = a.getX();
                    int y = a.getY();
                }
            }
        }
    }


