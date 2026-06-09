import java.util.ArrayList;

public class Trem {

    private Locomotiva locomotiva;
    private ArrayList<Vagao> vagoes;

    public Trem(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
        vagoes = new ArrayList<>();
    }

    public void adicionarVagao(Vagao vagao) {
        if(vagoes.size() < locomotiva.getLimiteVagoes()){
            vagoes.add(vagao);
        } else{
            System.out.println("[Erro] Limite de vagões da locomotiva atingido!");
        }
    }

    public void listarVagoes() {
        for(Vagao v : vagoes) {
            System.out.println("\nVagão de " + v.getTipo());
            v.listar();
        }
    }
}
