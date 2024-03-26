package br.senai.fatesg.ecommerce.ecommerceFrayan.repository;

import br.senai.fatesg.ecommerce.ecommerceFrayan.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Integer> {
}
