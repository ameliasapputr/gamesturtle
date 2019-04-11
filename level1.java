import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        addObject(new score(),200,200);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        turtle2 turtle2 = new turtle2();
        addObject(turtle2,52,180);
        banana banana = new banana();
        addObject(banana,267,67);
        banana banana2 = new banana();
        addObject(banana2,473,125);
        banana banana3 = new banana();
        addObject(banana3,494,279);
        banana banana4 = new banana();
        addObject(banana4,261,305);
        bola bola = new bola();
        addObject(bola,141,42);
        bola.setRotation(90);
        banana3.setLocation(488,305);
        turtle2.setLocation(17,183);
    }
}
