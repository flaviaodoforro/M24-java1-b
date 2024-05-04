import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Aranha do jogo BeeWorld
 * 
 * @author Fla 
 * @version 2024/04/24
 */
public class Aranha extends Inseto
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
        //verificando os cantos
        verificarCanto();
        //verificando a aceleracao da aranha
        acelerarAranha();
        //verificando a captura da mosca
        capturaDeMosca();
        //inteceptando a abelha
        interceptarAbelha();
    }

    /**
     * métedo que ira acelerar a aranha em determinada área do tabuleiro
     */
    public void acelerarAranha(){
        //fazer a aranha se mover mais rápido em determinado quadrante
        if (getX()>=200 && getX()<=600 && 
        getY()>=100 && getY()<=500){
            move(2);
        }
    }

    /**
     * método de captura da mosca
     */
    public void capturaDeMosca() {
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

    public void interceptarAbelha(){
        Abelha ab =((BeeWorld) getWorld()).getAbelha();
        if (ab!=null){
            turnTowards(ab.getX(), ab.getY());
        }
    }
}