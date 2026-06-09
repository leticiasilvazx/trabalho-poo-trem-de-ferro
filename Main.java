public class Main {

    public static void main(String[] args) {

        Locomotiva loco = new Locomotiva(3);
        Trem trem = new Trem(loco);

        Vagao passageiros = new VagaoPassageiros(2);
        Vagao cargas = new VagaoCarga(3);
        Vagao animais = new VagaoAnimais(3);

        System.out.println("---EMBARQUE---");
        
        passageiros.embarcar("Isaac");
        passageiros.embarcar("Letícia");
        passageiros.embarcar("João");

        cargas.embarcar("Ferro");
        cargas.embarcar("Madeira");
        
        animais.embarcar("Cavalo");
        animais.embarcar("Boi");
        animais.embarcar("Leão");

        trem.adicionarVagao(passageiros);
        trem.adicionarVagao(cargas);
        trem.adicionarVagao(animais);

        System.out.println("\n---CONTROLE DA LOCOMOTIVA---");
        loco.acelerar();
        loco.acelerar();
        System.out.println("Trem em movimento");
        System.out.println("Velocidade: "
                + loco.getVelocidade() + " km/h");

        loco.desacelerar();
        System.out.println("Desacelerando");
        System.out.println("Velocidade: "
                + loco.getVelocidade() + " km/h");
                
        System.out.println("\n---LISTAGEM DA COMPOSIÇÃO---");
        trem.listarVagoes();
        
        loco.parar();
        System.out.println("\nTrem parado.");
        System.out.println("Velocidade final: "
                + loco.getVelocidade() + " km/h");
    }
}
