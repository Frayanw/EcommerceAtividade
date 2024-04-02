package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
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
    private Contato contato;
}
