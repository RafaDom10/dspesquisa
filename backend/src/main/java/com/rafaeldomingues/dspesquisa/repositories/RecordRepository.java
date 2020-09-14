package com.rafaeldomingues.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeldomingues.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
