// Interface genérica para usuários
interface Usuario {
    void visualizarDocumento();
    void editarDocumento();
    void compartilharDocumento();
}

class Administrador implements Usuario {
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

class UsuarioNormal implements Usuario {
    public void visualizarDocumento() {
        // codigo para usuários normais
    }

    public void editarDocumento() {
        // codigo para usuários normais
    }

    public void compartilharDocumento() {
        // codigo para usuários normais
    }
}
