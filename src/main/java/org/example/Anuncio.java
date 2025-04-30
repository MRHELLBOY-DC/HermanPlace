package org.example;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "anuncios")
public class Anuncio {
    @Id
    @GeneratedValue
    private Long id;

    private String titulo;

    private String descripcion;

    private BigDecimal precio;

    private Boolean estado = true;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "anuncio")
    private List<Imagen> imagenes;

    @OneToMany(mappedBy = "anuncio")
    private List<Conversacion> conversaciones;
}
