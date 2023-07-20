import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    int point = 0;
    
    public Score()
    {
        tambah();
    }
    public void nilai()
    {
        // Add your action code here.
        point++;
        tambah();
        if(point==10)
        {
            setImage("winner.png");
            setLocation(600, 400);
            Greenfoot.playSound("Naruto.mp3");
        }
    }
    public void tambah()
    {
        GreenfootImage Nilai = new GreenfootImage("Score : "+ point,32,Color.YELLOW ,Color.BLACK);
        setImage(Nilai);
    }
}
