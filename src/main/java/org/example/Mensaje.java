package org.example;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensajes")
public class Mensaje {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "conversacion_id")
    private Conversacion conversacion;

    @ManyToOne
    @JoinColumn(name = "remitente_id")
    private Usuario remitente;

    private String mensaje;

    @Column(name = "enviado_en")
    private LocalDateTime enviadoEn;
}
