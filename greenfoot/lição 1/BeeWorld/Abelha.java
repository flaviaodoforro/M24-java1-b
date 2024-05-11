import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo Beeworld.
 * 
 * @author Fla 
 * @version 2024/04/20
 */
public class Abelha extends Actor
{
    //constante
    public static int PONTOS = 100;
    //campos ou fields
    public int vidas = 0;
    public int score = 0;
    public int imgIdx = 0;
    //criando campo do tipo conjunto de imagens 
    private GreenfootImage[] imagens;
    //constructors
    public Abelha() {
        vidas = 3;
        score = 0;
        //definir o tamanho do conjunto
        imagens = new GreenfootImage[4];
        //definir as imagens
        for (int i=0;i<4;i++){
            imagens[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
    }

    /**
     * Método para abelha andar com run ou act
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // vai mover 1 com o act
        move(1);
        //trocar imagem
        trocarImagem();
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
        //verificar se foi capturada pela aranha
        capturadaPelaAranha();
        //verficar que estra mostrando vidas
        mostrarVidas();
        //verificar mostrar o score
        //mostrarScore();
        

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
            //aumenta o score
            //colocando o score no mundo
            ((BeeWorld) getWorld()).addScore(PONTOS);
            //adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5)+1, 
            Greenfoot.getRandomNumber(360)), pX, pY);
        }
    }

    /**
     * método que ira capturara a abelha pela Aranha
     */
    public void capturadaPelaAranha(){
        //verificando se foi tocado pela aranha e perder uma vida
        if (isTouching(Aranha.class)) {
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            //diminuido uma vida a cada vez que é pego pela aranha
            vidas -= 1;
            if (vidas<1) {
                Greenfoot.stop();
                getWorld().showText("GAME OVER", 400, 300);
            }
        }
    }

    /**
     * método para mostrar vidas
     */
    public void mostrarVidas() {
        getWorld().showText("Vidas: " + vidas, 60, 20);
    }

    /**
     * método de mostrar o score
     */
    public void mostrarScore() {
        getWorld().showText("Score: " + score, 700, 20);
    }
    /**
     * método para troca de imagem
     */
    public void trocarImagem () {
        setImage(imagens [imgIdx]);
        imgIdx = (imgIdx + 1) % 4;
        //mesma coisa mais rápida
        // imgIdx++;
        //if (imgIdx>=4) {
        // imgIdx = 0;
    }
        }
       
    

