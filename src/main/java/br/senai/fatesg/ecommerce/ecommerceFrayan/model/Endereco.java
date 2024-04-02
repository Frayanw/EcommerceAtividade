package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Collate;

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
    private Contato contato;
}
