package org.example;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;

    @Column(unique = true, nullable = false)
    private String correo;

    @Column(nullable = false)
    private String contrasena;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    // Relaciones
    @OneToMany(mappedBy = "usuario")
    private List<Anuncio> anuncios;

    @OneToMany(mappedBy = "usuario")
    private List<AnuncioGuardado> guardados;

    @OneToMany(mappedBy = "comprador")
    private List<Conversacion> conversacionesComoComprador;

    @OneToMany(mappedBy = "vendedor")
    private List<Conversacion> conversacionesComoVendedor;

    @OneToMany(mappedBy = "remitente")
    private List<Mensaje> mensajes;
}
