import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Fla 
 * @version 20/04/24
 */
public class Mosca extends Actor
{
    /**
     * método act é executado sempre que apertarmos o botão act ou
     * ficará em execução quando apertar o botão run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (isAtEdge()) { 
            turn(180);
    
        }
    
    }
}