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
@Table(name = "Email")
public class Email extends BaseModel {
    @Column(name = "Endereco_Email", nullable = false)
    private String enderecoEmail;
    @Column(name = "Data_Inicio", nullable = false)
    private LocalDateTime dataInicio;
    @Column(name = "Data_Fim", nullable = false)
    private LocalDateTime dataFim;
    private Contato contato;
}
