import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(3);
       if(getY()<=5 || getY() >= getWorld().getHeight() -5)
       turn(180);
       Actor turtle2 = getOneObjectAtOffset(0, 0, turtle2.class);
      if(turtle2!=null){
          removeTouching(turtle2.class);
            Greenfoot.stop();
            getWorld().addObject(new kalah(), 300,200);
        }
        }
    }    

