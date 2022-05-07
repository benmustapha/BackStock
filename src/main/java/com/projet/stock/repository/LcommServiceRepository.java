package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.LcommService;
@Repository
public interface LcommServiceRepository  extends JpaRepository<LcommService, Long>{

}
