import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Fla 
 * @version 20/04/24
 */
public class Mosca extends Inseto
{
    //campo e fields
    private int velocidade;
    //constructor
    public Mosca () {
        velocidade = 1;
    }
    //constructor personaliado com sobrecarga de metodos
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang);
    }
    /**
     * método act é executado sempre que apertarmos o botão act ou
     * ficará em execução quando apertar o botão run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();    
    }
}