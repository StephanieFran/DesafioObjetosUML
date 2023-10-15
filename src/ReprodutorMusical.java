public class ReprodutorMusical extends Iphone{

    private String selecionarMusica;
    private boolean tocar;
    private boolean pausar;

    public ReprodutorMusical(boolean ligado) {
        super(ligado);
        if (ligado == false) {
            System.out.println("O Iphone precisa estar ligado para reproduzir");
        } else {
            tocar = false;
            pausar = false;
        }
    }

    public String getSelecionarMusica() {
        return selecionarMusica;
    }

    public void setSelecionarMusica(String selecionarMusica) {
        this.selecionarMusica = selecionarMusica;
        System.out.println("Musica selecionada: " +  selecionarMusica);
    }

    public boolean getTocar() {
        return tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    public boolean getPausar() {
        return pausar;
    }

    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }

    public void reproduzirMusica(){
        if (ligado == true && selecionarMusica == null){
            System.out.println("Selecione uma música");
        }else {
            setTocar(true);
            setPausar(false);
            System.out.println("Reproduzindo " + selecionarMusica);
        }
    }

    public void pausarMusica(){
        if (ligado == true && tocar == true && selecionarMusica != "") {
            setTocar(false);
            setPausar(true);
            System.out.println("Música pausada");
        }else {
            System.out.println("Nenhuma música reproduzindo");
        }
    }
}
