package com.rafaeldomingues.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldomingues.dspesquisa.dto.RecordDTO;
import com.rafaeldomingues.dspesquisa.dto.RecordInsertDTO;
import com.rafaeldomingues.dspesquisa.entities.Game;
import com.rafaeldomingues.dspesquisa.entities.Record;
import com.rafaeldomingues.dspesquisa.repositories.GameRepository;
import com.rafaeldomingues.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private RecordRepository repository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
}
