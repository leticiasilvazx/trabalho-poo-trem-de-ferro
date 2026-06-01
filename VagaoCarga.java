public class VagaoCarga extends Vagao {

    public VagaoCarga(int capacidade) {
        super(capacidade);
    }

    @Override
    public String getTipo() {
        return "Carga";
    }
}