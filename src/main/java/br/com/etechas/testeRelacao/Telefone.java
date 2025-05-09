package br.com.etechas.testeRelacao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Telefone {

    @Id
    private int id;
    private String numero;
    private String ddd;

    @OneToOne
    @JoinColumn (name = "ID_PROPRIETARIO")
    private Proprietario propietario;

}
