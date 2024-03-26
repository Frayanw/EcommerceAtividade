package br.senai.fatesg.ecommerce.ecommerceFrayan.repository;

import br.senai.fatesg.ecommerce.ecommerceFrayan.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
}
