package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import model.Usuario;

@Stateless
public class UsuarioDAO {
    @PersistenceContext(unitName = "crud-usuarios")
    private EntityManager em;

    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }

    public List<Usuario> listar() {
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }
}