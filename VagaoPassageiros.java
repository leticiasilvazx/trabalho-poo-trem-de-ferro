public class VagaoPassageiros extends Vagao {

    public VagaoPassageiros(int capacidade) {
        super(capacidade);
    }

    @Override
    public String getTipo() {
        return "Passageiros";
    }
}