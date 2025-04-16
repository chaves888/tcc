package prefeitura_umuarama.tcc.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String senha;
    private String perfil; // MASTER, NUTRICIONISTA, GESTOR_ESCOLA

    // Getters e Setters
}
