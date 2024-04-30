class Televisao {
    public void ligar() {
        // Lógica para ligar a televisão
    }

    public void desligar() {
        // Lógica para desligar a televisão
    }
}

class Lampada {
    public void ligar() {
        // Lógica para ligar a lâmpada
    }

    public void desligar() {
        // Lógica para desligar a lâmpada
    }
}

class ControleRemoto {
    private Televisao televisao;
    private Lampada lampada;

    public ControleRemoto() {
        this.televisao = new Televisao();
        this.lampada = new Lampada();
    }

    public void ligarTelevisao() {
        televisao.ligar();
    }

    public void desligarTelevisao() {
        televisao.desligar();
    }

    public void ligarLampada() {
        lampada.ligar();
    }

    public void desligarLampada() {
        lampada.desligar();
    }
}
