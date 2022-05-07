package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.Recouv;
@Repository
public interface RecouvRepository extends JpaRepository<Recouv, Long>{

}
