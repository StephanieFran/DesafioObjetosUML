public class Navegador extends Iphone{
    
    private String url = "";

    public Navegador(boolean ligado, String url) {
        super(ligado);
        if (ligado == false) {
            System.out.println("O Iphone precisa estar ligado para acessar o navegador");
        }
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void acessar(){
        System.out.println("Acessando " + url);
    }
}