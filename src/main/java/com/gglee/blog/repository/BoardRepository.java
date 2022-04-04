package com.gglee.blog.repository;

import com.gglee.blog.model.Board;
import com.gglee.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
