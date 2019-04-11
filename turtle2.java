import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle2 extends Actor
{
    /**
     * Act - do whatever the turtle2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(1 );
        if(Greenfoot.isKeyDown("left")){
        turn(-5);
    }    
        if(Greenfoot.isKeyDown("right")){
        turn(5);
}
        if(Greenfoot.isKeyDown("down")){
        move(-2); 
    }
        if(Greenfoot.isKeyDown("up")){
           move(2);
        }
        Actor banana = getOneObjectAtOffset(0,0, banana.class);
if(banana !=null){
   getWorld().removeObject(banana);
     score.banana++;
    }    
    if(score.banana == 4){
        getWorld().addObject(new menang(), 300, 200);
        Greenfoot.stop();
}
}
}
