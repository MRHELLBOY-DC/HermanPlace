package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "imagenes")
public class Imagen {
    @Id
    @GeneratedValue
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "anuncio_id")
    private Anuncio anuncio;
}
