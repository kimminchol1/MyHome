package com.example.MyHome.repository;

import com.example.MyHome.model.board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<board, Long> {


}
