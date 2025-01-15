package TesteDeSoftware.Mockitoteste;
import java.util.Optional;

public interface UsuarioRepository {
    Optional<Usuario> findById(Long id);
    void save(Usuario usuario);
}
