package com.disney.challenge.repository;

import com.disney.challenge.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//El repositorio en hibernate es
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {



}
