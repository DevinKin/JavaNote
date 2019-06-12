package com.devinkin.tdd.repo.tddrepo.user;

import com.devinkin.tdd.domain.tdddomain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 18:05
 * @description: 用户repository
 **/
public interface UserRepo extends JpaRepository<User, Long> {
    //    User saveDto(User user);
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO user(id,user_name,user_nick_name,age,gender,occupation) VALUES (:id,:userName,:userNickName,:age,:gender,:occupation)", nativeQuery = true)
    Integer saveDto(@Param("id") Integer id,
                 @Param("userName") String userName,
                 @Param("userNickName") String userNickName,
                 @Param("age") Integer age,
                 @Param("gender") String gender,
                 @Param("occupation") String occupation);

    @Query(value = "SELECT * FROM user WHERE user_name = :userName", nativeQuery = true)
    User queryDto(String userName);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> listDto();
}
