package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.Lrecouf;
@Repository
public interface LrecoufRepository extends JpaRepository<Lrecouf, Long>{

}
