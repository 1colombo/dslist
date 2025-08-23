package com.colombo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colombo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
