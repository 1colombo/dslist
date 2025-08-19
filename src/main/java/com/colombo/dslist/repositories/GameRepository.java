package com.colombo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colombo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
