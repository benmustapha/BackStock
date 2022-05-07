package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.Societe;
@Repository
public interface SocieteRepository extends JpaRepository<Societe, Long>{

}