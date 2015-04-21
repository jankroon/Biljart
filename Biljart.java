import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Biljart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biljart extends World
{

    /**
     * Constructor for objects of class Biljart.
     * 
     */
    public Biljart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new WitteBal(), 100, 200); 
    }
}
