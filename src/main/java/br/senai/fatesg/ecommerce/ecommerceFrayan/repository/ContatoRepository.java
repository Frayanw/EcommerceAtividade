package br.senai.fatesg.ecommerce.ecommerceFrayan.repository;

import br.senai.fatesg.ecommerce.ecommerceFrayan.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
