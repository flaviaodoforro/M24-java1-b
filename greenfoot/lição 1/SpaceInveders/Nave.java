import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * classe que representa a Nave
 * 
 * @author Fla
 * @version 2024/04/27
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // verificaçaõ do movimento para esquerda e mover para esquerda
        if (Greenfoot.isKeyDown("left")) {
            move(-3);
        }
        //verifacação do movimento para direita e movimentando
        if (Greenfoot.isKeyDown("right")) {
            move (3);
        }
        //verificando se foi teclado a barra de espaço criamos a bala
        if(Greenfoot.isKeyDown("space")) {
            //getWorld().addObject(new Bala(), getX(), getY()-45);
            ((SpaceInvadersWorld) getWorld()) .criarBala(getX(), getY()-45);
        }
    }
}
