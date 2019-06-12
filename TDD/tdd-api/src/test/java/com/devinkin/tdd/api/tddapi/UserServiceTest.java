package com.devinkin.tdd.api.tddapi;

import com.devinkin.tdd.api.tddapi.user.UserService;
import com.devinkin.tdd.domain.tdddomain.user.User;
import com.devinkin.tdd.domain.tdddomain.user.UserDto;
import com.devinkin.tdd.repo.tddrepo.user.UserRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 14:36
 * @description: 用户service测试类
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TddApiApplication.class)
public class UserServiceTest {
    @Resource
    UserService userService;

    @MockBean
    UserRepo userRepo;

    @Test
    public void testUserAdd() {
        User user = new User();
        user.setUserName("tdd");
        user.setUserNickName("mc");
        user.setGender("male");
        user.setAge(29);
        user.setOccupation("spring boot developer");
        Mockito.when(userRepo.saveDto(Mockito.anyInt(),Mockito.anyString(),Mockito.anyString(),
                Mockito.anyInt(), Mockito.anyString(), Mockito.anyString())).thenReturn(10);

        UserDto userDto = new UserDto();
        userDto.setAge(29);
        userDto.setUserName("tdd");
        userDto.setUserNickName("mc");
        userDto.setGender("male");
        userDto.setOccupation("spring boot developer");

        Optional<Integer> result = userService.add(userDto);
        Assert.assertEquals(10, result.get().intValue());
    }

    @Test
    public void testUserQuery() {
        User user = new User();
        user.setUserName("tdd");
        user.setUserNickName("mc");
        user.setGender("male");
        user.setOccupation("spring boot developer");
        user.setAge(29);

        Mockito.when(userRepo.queryDto(Mockito.anyString())).thenReturn(user);
        Optional<UserDto> result = userService.query("tdd");
        Assert.assertEquals("tdd", result.get().getUserName());
    }

    @Test
    public void testUserList() {
        User user = new User();
        user.setUserName("tdd");
        user.setUserNickName("mc");
        user.setGender("male");
        user.setOccupation("spring boot developer");
        user.setAge(29);

        List<User> userList = new ArrayList<>();
        userList.add(user);

        Mockito.when(userRepo.listDto()).thenReturn(userList);

        Optional<List<UserDto>> result = userService.list();
        Assert.assertEquals(Boolean.TRUE.booleanValue(), result.get().size() > 0);
    }
}
