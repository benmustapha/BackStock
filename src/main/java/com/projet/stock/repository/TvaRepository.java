package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.Tva;
@Repository
public interface TvaRepository extends JpaRepository<Tva, Long>{

}
