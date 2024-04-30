// Interfaces segregadas
interface Visualizavel {
    void visualizarDocumento();
}

interface Editavel {
    void editarDocumento();
}

interface Compartilhavel {
    void compartilharDocumento();
}

// Classes específicas implementando interfaces específicas
class Administrador implements Visualizavel, Editavel, Compartilhavel {
    public void visualizarDocumento() {
        // codigo para administradores
    }

    public void editarDocumento() {
        // codigo para administradores
    }

    public void compartilharDocumento() {
        // codigo para administradores
    }
}

class UsuarioNormal implements Visualizavel {
    public void visualizarDocumento() {
        // codigo para usuários normais
    }
}
