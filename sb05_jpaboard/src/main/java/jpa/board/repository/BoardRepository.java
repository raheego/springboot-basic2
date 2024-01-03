package jpa.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.board.model.Jpa_Board;

public interface BoardRepository extends JpaRepository<Jpa_Board, Integer> {

}
