import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * está classe vai representa o placar do jogo
 * 
 * @author (fla) 
 * @version 2024/05/11
 */
public class Placar extends Actor
{
    //fields
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    //constructor
    public Placar () {
        texto = "Score: 0";
        tamanhoTexto = 32;
        corFonte = Color.BLACK;
        atualizarImagem();
    }
    // Getters (acessador de campos) e Stter (modificador de campos)
    public String geTexto() {
        return texto;
    }
    public void setTexto(String value) {
        texto = value;
        atualizarImagem();
    }
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    /**
     * método para atualizar imagem
     */
    public void atualizarImagem(){
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(),
        tamanhoTexto);
        img.setColor(corFonte);
        //nome,blod,italic,tamanho
        img.setFont(new Font("Arial",true,false,tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img);
    }
}
