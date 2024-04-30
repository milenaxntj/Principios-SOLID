interface DispositivoEletronico {
    void ligar();
    void desligar();
}

class Televisao implements DispositivoEletronico {
    public void ligar() {
        // Lógica para ligar a televisão
    }

    public void desligar() {
        // Lógica para desligar a televisão
    }
}

class Lampada implements DispositivoEletronico {
    public void ligar() {
        // Lógica para ligar a lâmpada
    }

    public void desligar() {
        // Lógica para desligar a lâmpada
    }
}

class ControleRemoto {
    private DispositivoEletronico dispositivo;

    public ControleRemoto(DispositivoEletronico dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligarDispositivo() {
        dispositivo.ligar();
    }

    public void desligarDispositivo() {
        dispositivo.desligar();
    }
}
