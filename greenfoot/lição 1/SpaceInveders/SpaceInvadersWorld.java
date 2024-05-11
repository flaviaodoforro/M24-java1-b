import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * calsse reponsável pelo mundo do SpaceInvaders
 * 
 * @author Fla 
 * @version 2025/04/27
 */
public class SpaceInvadersWorld extends World
{
    private Bala bala= null;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SpaceInvadersWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alien alien = new Alien();
        addObject(alien,399,36);
        Nave nave = new Nave();
        addObject(nave,397,572);
    }

    /**
     * método para bala??
     */
    public Bala getBala(){
        return bala;
    }
    /**
     * método para criar a bala
     */
    public void criarBala(int pX, int pY){
        if (bala == null){
            bala = new Bala();
            addObject(bala, pX, pY);
        }
    }
    /**
     * método para remover a bala
     */
    public void removerBala(){
        if (bala != null){
            removeObject(bala);
            bala = null;
        }
    }
}
