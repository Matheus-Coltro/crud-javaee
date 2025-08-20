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
    private Usuario usuarioEdit;

    public void salvar() {
        usuarioDAO.salvar(usuario);
        usuario = new Usuario();
        usuarios = null;
    }

    public void atualizar() {
        usuarioDAO.atualizar(usuarioEdit);
        usuarioEdit = null;
        usuarios = null;
    }

    public List<Usuario> getUsuarios() {
        if (usuarios == null) {
            usuarios = usuarioDAO.listar();
        }
        return usuarios;
    }

    public void excluir(Usuario usuario) {
        usuarioDAO.excluir(usuario);
        usuarios = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Usuario getUsuarioEdit() {
        return usuarioEdit;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void prepararEdit(Usuario usuario) {
        this.usuarioEdit = usuario;
    }
}