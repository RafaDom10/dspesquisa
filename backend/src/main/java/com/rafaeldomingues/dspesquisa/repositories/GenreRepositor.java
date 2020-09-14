package com.rafaeldomingues.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaeldomingues.dspesquisa.entities.Genre;

@Repository
public interface GenreRepositor extends JpaRepository<Genre, Long> {

}
