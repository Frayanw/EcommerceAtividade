package br.senai.fatesg.ecommerce.ecommerceFrayan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends BaseModel{
    private String cpf;
}