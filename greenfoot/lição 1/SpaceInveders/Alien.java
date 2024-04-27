import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * calsse do alien
 * 
 * @author fla 
 * @version 2024/04/27
 */
public class Alien extends Actor
{
    public int pX = 1;
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // movimentando o alien
        move(pX);
        if(isAtEdge()) {
            pX *= -1;
        }
    }
}