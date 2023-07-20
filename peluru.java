import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Actor
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid A = (asteroid)getOneIntersectingObject(asteroid.class);
        if(A!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(A);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid1 B = (asteroid1)getOneIntersectingObject(asteroid1.class);
        if(B!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(B);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid2 C = (asteroid2)getOneIntersectingObject(asteroid2.class);
        if(C!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(C);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid3 D = (asteroid3)getOneIntersectingObject(asteroid3.class);
        if(D!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(D);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid4 E = (asteroid4)getOneIntersectingObject(asteroid4.class);
        if(E!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(E);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid5 F = (asteroid5)getOneIntersectingObject(asteroid5.class);
        if(F!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(F);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid6 G = (asteroid6)getOneIntersectingObject(asteroid6.class);
        if(G!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(G);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid7 H = (asteroid7)getOneIntersectingObject(asteroid7.class);
        if(H!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(H);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid8 I = (asteroid8)getOneIntersectingObject(asteroid8.class);
        if(I!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(I);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX()+9, getY());
        if(getX()==1254)
        {
            setLocation(0, getY());
            getWorld().removeObject(this);
            return;
        }
        asteroid9 J = (asteroid9)getOneIntersectingObject(asteroid9.class);
        if(J!=null)
        {
            Score Score = getscore();
            Score.nilai();
            getWorld().removeObject(J);
            Greenfoot.playSound("explode.wav");
            getWorld().addObject(new explosion(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
    }
    public Score getscore()
    {
        return (Score)getWorld().getObjects(Score.class).iterator().next();
    }  
}
