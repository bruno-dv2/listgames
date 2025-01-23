package com.javaspring.listgames.repositories;

import com.javaspring.listgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
