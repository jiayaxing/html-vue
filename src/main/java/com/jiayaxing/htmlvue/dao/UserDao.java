package com.jiayaxing.htmlvue.dao;

import com.jiayaxing.htmlvue.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
    @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    UserEntity getmycount(Integer id);
}
