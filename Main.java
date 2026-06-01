public class Main {

    public static void main(String[] args) {

        Locomotiva loco = new Locomotiva(3);

        Trem trem = new Trem(loco);

        Vagao passageiros = new VagaoPassageiros(3);
        Vagao cargas = new VagaoCarga(2);
        Vagao animais = new VagaoAnimais(3);

        passageiros.embarcar("Isaac");
        passageiros.embarcar("Letícia");

        cargas.embarcar("Ferro");
        cargas.embarcar("Madeira");
        
        animais.embarcar("Cavalo");
        animais.embarcar("Boi");

        trem.adicionarVagao(passageiros);
        trem.adicionarVagao(cargas);
        trem.adicionarVagao(animais);

        loco.acelerar();
        
        System.out.println("Trem em movimento");
        System.out.println("Velocidade: "
                + loco.getVelocidade() + " km/h");

        trem.listarVagoes();

        loco.parar();

        System.out.println("Trem parado.");
    }
}
