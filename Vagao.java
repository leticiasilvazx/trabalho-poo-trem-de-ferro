import java.util.ArrayList;

public abstract class Vagao {

    protected int capacidade;
    protected ArrayList<String> itens;

    public Vagao(int capacidade) {
        this.capacidade = capacidade;
        itens = new ArrayList<>();
    }

    public abstract boolean embarcar(String item);

    public boolean desembarcar(String item) {
        return itens.remove(item);
    }

    public boolean buscar(String item) {
        return itens.contains(item);
    }

    public void listar() {
        System.out.println(itens);
    }

    public abstract String getTipo();
}
