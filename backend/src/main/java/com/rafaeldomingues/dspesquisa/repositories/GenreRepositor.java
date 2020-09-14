package com.rafaeldomingues.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeldomingues.dspesquisa.entities.Genre;

public interface GenreRepositor extends JpaRepository<Genre, Long> {

}
