
public class Iphone {
    
    boolean ligado;
    boolean botaoPressionado;

    public Iphone(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getBotaoPressionado() {
        return botaoPressionado;
    }

    public void setBotaoPressionado(boolean botaoPressionado) {
        this.botaoPressionado = botaoPressionado;
    }

    public void desligarIphone(){
        if (botaoPressionado == true && ligado == true) {
            setLigado(false);
            System.out.println("Desligando Iphone");
        } else {
            System.out.println("Pressione o botão lateral e segure para desligar o Iphone");
        }
    }
    
    public void ligarIphone(){
        if (botaoPressionado == true && ligado == false) {
            setLigado(true);
            System.out.println("Ligando Iphone");
        } else {
            System.out.println("Pressione o botão lateral e segure para ligar o Iphone");
        }
    }
}