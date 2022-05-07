package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.Recouf;
@Repository
public interface RecoufRepository extends JpaRepository<Recouf, Long>{

}
