package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "anuncios_guardados", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"usuario_id", "anuncio_id"})
})
public class AnuncioGuardado {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "anuncio_id")
    private Anuncio anuncio;
}
