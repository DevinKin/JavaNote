package com.devinkin.tdd.api.tddapi.user.impl;

import com.devinkin.tdd.api.tddapi.user.UserService;
import com.devinkin.tdd.domain.tdddomain.user.User;
import com.devinkin.tdd.domain.tdddomain.user.UserDto;
import com.devinkin.tdd.repo.tddrepo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 10:49
 * @description: 用户实现类
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepo userRepo;

    @Override
    public Optional<Integer> add(UserDto userDto) {
        User user = new User();
        Random random = new Random(49);
        user.setId(random.nextInt(100));
        user.setUserName(userDto.getUserName());
        user.setUserNickName(userDto.getUserNickName());
        user.setGender(userDto.getGender());
        user.setOccupation(userDto.getOccupation());
        user.setAge(userDto.getAge());
        Integer result = userRepo.saveDto(user.getId(), user.getUserName(),user.getUserNickName(), user.getAge(), user.getGender(),user.getOccupation());
        return Optional.of(result);
    }

    @Override
    public Optional<UserDto> query(String userName) {
        User user = userRepo.queryDto(userName);
        UserDto userDto = new UserDto();
        userDto.setAge(user.getAge());
        userDto.setUserName(user.getUserName());
        userDto.setUserNickName(user.getUserNickName());
        userDto.setGender(user.getGender());
        userDto.setOccupation(user.getOccupation());
        return Optional.of(userDto);
    }

    @Override
    public Optional<List<UserDto>> list() {
        List<UserDto> userDtos = new ArrayList<>();
        List<User> users = userRepo.listDto();
        for (User user : users) {
            UserDto userDto = new UserDto();
            userDto.setAge(user.getAge());
            userDto.setUserName(user.getUserName());
            userDto.setUserNickName(user.getUserNickName());
            userDto.setGender(user.getGender());
            userDto.setOccupation(user.getOccupation());
            userDtos.add(userDto);
        }
        return Optional.of(userDtos);
    }
}
