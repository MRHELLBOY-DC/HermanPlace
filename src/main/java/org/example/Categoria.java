package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Anuncio> anuncios;
}
