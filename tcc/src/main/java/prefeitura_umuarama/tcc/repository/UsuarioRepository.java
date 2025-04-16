package prefeitura_umuarama.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prefeitura_umuarama.tcc.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
