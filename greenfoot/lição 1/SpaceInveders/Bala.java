import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * classe que representa a Bala
 * 
 * @author Fla 
 * @version 2024/04/27
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // fazer com que a bala suab
        setLocation(getX(), getY()-5);
        // se atingir o topo remove a bala
        removerAlien();
        if(isAtEdge()) {
            //getWorld(). removeObject(this);
            ((SpaceInvadersWorld) getWorld()) .removerBala();
        }

    }
    /**
     * método que verifica se a bala relou o alien e remove ele
     */
    public void removerAlien(){
        if (isTouching(Alien.class)) {
            removeTouching(Alien.class);
            //criando novo alien
            getWorld().addObject(new Alien(),
                Greenfoot.getRandomNumber(getWorld().getWidth()),50);

        }
    }
}
