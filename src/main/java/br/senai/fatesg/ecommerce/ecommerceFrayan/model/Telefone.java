package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "Contato")
public class Telefone extends BaseModel{
    @Column(name = "DDD", nullable = false)
    private String ddd;
    @Column(name = "Numero", nullable = false)
    private String numero;
    @Column(name = "Data_Inicio", nullable = false)
    private LocalDateTime dataInicio;
    @Column(name = "Data_Fim", nullable = false)
    private LocalDateTime dataFim;
    @ManyToOne(fetch = FetchType.LAZY)
    private Contato contato;
}
