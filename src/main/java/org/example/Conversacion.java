package org.example;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "conversaciones", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"anuncio_id", "comprador_id"})
})
public class Conversacion {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "anuncio_id")
    private Anuncio anuncio;

    @ManyToOne
    @JoinColumn(name = "comprador_id")
    private Usuario comprador;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Usuario vendedor;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    @OneToMany(mappedBy = "conversacion")
    private List<Mensaje> mensajes;
}
