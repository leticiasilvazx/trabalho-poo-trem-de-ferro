public class Locomotiva {

    private int velocidade;
    private int limiteVagoes;

    public Locomotiva(int limiteVagoes) {
        this.limiteVagoes = limiteVagoes;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public void parar() {
        velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getLimiteVagoes() {
        return limiteVagoes;
    }
}