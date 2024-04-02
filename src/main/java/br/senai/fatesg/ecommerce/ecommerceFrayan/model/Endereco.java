package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "Endereco")
public class Endereco extends BaseModel{
    @Column(name = "Logradouro", nullable = false)
    private String logradouro;
    @Column(name = "Data_Inicio", nullable = false)
    private LocalDateTime dataInicio;
    @Column(name = "Data_Fim", nullable = false)
    private LocalDateTime dataFim;
    @ManyToOne(fetch = FetchType.LAZY)
    private Contato contato;
}
