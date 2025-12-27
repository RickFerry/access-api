package com.ferry.access.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "morador")
@AllArgsConstructor
@NoArgsConstructor
public class MoradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String cpf;

    private String endereco;
    private String celular;

    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoa;
}
