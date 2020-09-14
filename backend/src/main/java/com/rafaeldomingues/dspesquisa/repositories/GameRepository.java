package com.rafaeldomingues.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeldomingues.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
