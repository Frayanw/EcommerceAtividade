package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "Pessoa_Fisica")
public class PessoaFisica extends BaseModel{
    @Column(name = "cpf")
    private String cpf;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "Pessoa_id", referencedColumnName = "id"
    )
    private Pessoa pessoa;
}
