package com.gglee.blog.repository;

import com.gglee.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// DAO
// 자동으로 bean등록이 된다.
// @Repository // 생략 가능하다.
public interface UserRepository extends JpaRepository<User, Integer> {

}
