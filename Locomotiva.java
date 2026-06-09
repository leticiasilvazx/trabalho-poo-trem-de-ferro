public class Locomotiva {

    private int velocidade;
    private int limiteVagoes;

    public Locomotiva(int limiteVagoes) {
        this.limiteVagoes = limiteVagoes;
        this.velocidade = 0;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public void desacelerar(){
        if (velocidade >= 10){
            velocidade -= 10;
        } else{
            velocidade = 0;
        }
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
