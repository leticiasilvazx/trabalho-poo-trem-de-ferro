public class VagaoPassageiros extends Vagao {

    public VagaoPassageiros(int capacidade) {
        super(capacidade);
    }

    @Override
    public boolean embarcar(String item){
        if(itens.size() < capacidade){
            itens.add(item);
            return true;
        }
        System.out.println("[Erro] Vagão de passageiros lotado. Não foi possível embarcar: " + item);
        return false;
    }
    
    @Override
    public String getTipo(){
        return "Passageiros";
    }
}
