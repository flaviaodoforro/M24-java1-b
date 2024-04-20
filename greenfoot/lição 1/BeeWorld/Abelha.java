import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo Beeworld.
 * 
 * @author Fla 
 * @version 2024/04/20
 */
public class Abelha extends Actor
{
    /**
     * Método para abelha andar com run ou act
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //se teclar para esquerda gira menos 10
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }
        //se teclar para direita gira 10
        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }
    }
}
