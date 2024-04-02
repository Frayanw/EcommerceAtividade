package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Entity
@Table(name = "Pessoa")
public class Pessoa extends BaseModel{
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
    @Column(name = "Data_Inicio", nullable = false)
    private LocalDateTime dataInicio;
    @Column(name = "Data_Fim", nullable = false)
    private LocalDateTime dataFim;
    @OneToOne(mappedBy = "pessoa")
    private PessoaFisica pessoaFisica;
    @OneToOne(mappedBy = "pessoa")
    private PessoaJuridica pessoaJuridica;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name= "pessoa_id")
    public List<Contato> contatos;
}
