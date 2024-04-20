import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Aranha do jogo BeeWorld
 * 
 * @author Fla 
 * @version 2024/04/24
 */
public class Aranha extends Actor
{
    /**
     * método para aranha girarar no act ou run
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
        move(1);
        //verifica se o numer é menor ou igual a 10
        if (Greenfoot.getRandomNumber(100)+1 <= 10) {
            //gira aleatoriamente de -45 a 45
            turn(Greenfoot.getRandomNumber(91)-45);
        }
    }
}
