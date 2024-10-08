package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "libro")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Libro extends Base {

    @Column(name="titulo")
    private String titulo;
    @Column(name="fecha")
    private int fecha;
    @Column(name="genero")
    private String genero;
    @Column(name="paginas")
    private int paginas;
    @Column(name="autor")
    private String autor;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
