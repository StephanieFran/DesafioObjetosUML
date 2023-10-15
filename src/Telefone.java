public class Telefone extends Iphone{

    private int numeroTelefone;

    public Telefone(boolean ligado) {
        super(ligado);
        if (ligado = false) {
            System.out.println("O Iphone precisa estar ligado para realizar uma ligação");
        }
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void ligar(int numeroTelefone){
        System.out.println("Ligando para " +  numeroTelefone);
    }
}
