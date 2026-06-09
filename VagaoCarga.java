public class VagaoCarga extends Vagao {

    public VagaoCarga(int capacidade) {
        super(capacidade);
    }

    @Override
    public boolean embarcar(String item){
        if (itens.size() >= capacidade){
            System.out.println("[Erro] Vagão de Carga lotado.");
            return false;
        }
        itens.add(item);
        return true;
    }

    @Override
    public String getTipo() {
        return "Carga";
    }
}
