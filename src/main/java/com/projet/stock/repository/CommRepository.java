package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Comm;
@Repository
public interface CommRepository extends JpaRepository<Comm, Long>{

}
