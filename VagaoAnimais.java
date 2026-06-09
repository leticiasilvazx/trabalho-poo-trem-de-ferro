import java.util.Arrays;
import java.util.List;

public class VagaoAnimais extends Vagao {

    private List<String> especiesPermitidas;
    
    public VagaoAnimais(int capacidade) {
        super(capacidade);
        this.especiesPermitidas = Arrays.asList("Cavalo", "Boi", "Ovelha", "Porco");
    }

    @Override
    public boolean embarcar(String item){
        if (itens.size() >= capacidade){
            System.out.println("[Erro] Vagão de Animais lotado.");
            return false;
        }
        if (especiesPermitidas.contains(item)){
            itens.add(item);
            return true;
        }
        System.out.println("[Erro] Espécie não permitida neste vagão: " + item);
        return false;
    }
    
    @Override
    public String getTipo() {
        return "Animais";
    }
}
