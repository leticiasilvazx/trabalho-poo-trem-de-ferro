import java.util.ArrayList;

public abstract class Vagao {

    protected int capacidade;
    protected ArrayList<String> itens;

    public Vagao(int capacidade) {
        this.capacidade = capacidade;
        itens = new ArrayList<>();
    }

    public boolean embarcar(String item) {

        if(itens.size() < capacidade) {
            itens.add(item);
            return true;
        }

        return false;
    }

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