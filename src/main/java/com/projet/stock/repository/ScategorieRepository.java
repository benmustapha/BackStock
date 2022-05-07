package com.projet.stock.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Scategorie;
@Repository
public interface ScategorieRepository extends JpaRepository<Scategorie, Long>{
	 @Query("SELECT t FROM Scategorie t where t.code_categ = :code")
	    public List<Scategorie> findByCateg(@Param("code") String code);
	public Optional<Scategorie> findByCode(String code);
}