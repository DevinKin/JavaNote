package com.devinkin.tdd.api.tddapi.user;

import com.devinkin.tdd.domain.tdddomain.user.UserDto;

import java.util.List;
import java.util.Optional;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 10:47
 * @description: userService接口
 **/
public interface UserService {
    Optional<Integer> add(UserDto userDto);
    Optional<UserDto> query(String userName);
    Optional<List<UserDto>> list();
}
