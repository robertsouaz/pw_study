package br.com.etechas.pw_study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_disciplina")



public class Disciplina {
    @Column (name = "id_disciplina") // atributos

    @Id // chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tx_nome")
    private String nome;
}
