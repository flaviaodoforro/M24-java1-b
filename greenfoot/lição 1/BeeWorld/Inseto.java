import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * classe que representa inseto que será utilizado no jogo
 * 
 * @author fla 
 * @version 2024/04/27
 */
public class Inseto extends Actor
{
    /**
     * Act - do whatever the Inseto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // add your action code here.
    }
    /**
     * método que irá verificar se o objeto está nocanto do mundo
     */
    public void verificarCanto() {
        if(isAtEdge()) {
            turn (180);
        }
    
    }
}
