package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "Pessoa_Juridica")
public class PessoaJuridica extends BaseModel {
    @Column(name = "cnpj")
    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "Pessoa_id", referencedColumnName = "id"
    )
    private Pessoa pessoa;
}
