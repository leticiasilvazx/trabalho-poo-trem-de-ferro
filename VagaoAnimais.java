public class VagaoAnimais extends Vagao {

    public VagaoAnimais(int capacidade) {
        super(capacidade);
    }

    @Override
    public String getTipo() {
        return "Animais";
    }
}