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
        // vai mover 1 com o act
        move(1);
        //se teclar para esquerda gira menos 10
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }
        //se teclar para direita gira 10
        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }
        //verificando se está nos cantos
        verificarPosicao();
        //verifica se toca em uma mosca
        capturaMosca();
    }

    /**
     * método que verifica se está na direita
     */
    public boolean IsNadireita() {
        if (getX() > getWorld().getWidth()-10) {
            return true;
        }
        return false;
    }

    /**
     * método que verifica se está na esquerda
     */
    public boolean IsNaesquerda () {
        return (getX()<10);
    }

    /**
     * método que verifica se está na base do mundo
     */
    public boolean IsNabase() {
        return ( getY() > getWorld().getHeight()-10 );
    }

    /**
     * método que verifica se está no topo
     */
    public boolean IsNotopo() {
        return ( getY() < 10);
    }

    /**
     * verifica se a abelha está nos cantos e repociciona ela
     */
    public void verificarPosicao() {
        //verificando se está na direita
        if ( IsNadireita() ) {
            setLocation(10, getY());
        }
        //verifica se está na esquerda
        if ( IsNaesquerda() ) {
            setLocation(getWorld().getWidth()-10, getY());
        }
        //verifica se está no topo do mundo
        if( IsNotopo() ) {
            setLocation(getX(), getWorld().getHeight()-10);
        }
        // verfificar se está na base
        if ( IsNabase() ) {
            setLocation(getX(), 10);
        }
    }
    /**
     * método de captura da mosca
     */
    public void capturaMosca() {
        //verificando se tocou na mosca
        if ( isTouching(Mosca.class) ) {
            //remove a mosca tocada.
            removeTouching(Mosca.class);
            //adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
}
