package bean;

import javax.inject.Inject;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import dao.UsuarioDAO;
import model.Usuario;

@Named
@ViewScoped
public class UsuarioBean implements Serializable {
    @Inject
    private UsuarioDAO usuarioDAO;

    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios;

    public void salvar() {
        usuarioDAO.salvar(usuario);
        usuario = new Usuario(); // Limpa o formulário
        usuarios = null; // Força a recarga da lista
    }

    public List<Usuario> getUsuarios() {
        if (usuarios == null) {
            usuarios = usuarioDAO.listar();
        }
        return usuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}