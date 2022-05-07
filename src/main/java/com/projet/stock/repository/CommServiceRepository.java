package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.CommService;
@Repository
public interface CommServiceRepository extends JpaRepository<CommService, Long>{

}
