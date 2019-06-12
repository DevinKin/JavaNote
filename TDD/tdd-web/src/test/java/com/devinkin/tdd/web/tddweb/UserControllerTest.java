package com.devinkin.tdd.web.tddweb;

import com.devinkin.tdd.api.tddapi.user.UserService;
import com.devinkin.tdd.domain.tdddomain.user.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 11:03
 * @description: 用户controller测试类
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TddWebApplication.class)
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService userService;


    @Test
    public void testUserAdd() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUserName("tdd");
        userDto.setUserNickName("mc");
        userDto.setGender("male");
        userDto.setOccupation("spring boot devloper");
        userDto.setAge(29);
        Optional<Integer> mockUserDto = Optional.of(1);

        Mockito.when(userService.add(Mockito.any(UserDto.class))).thenReturn(mockUserDto);


        MvcResult mvcResult = mockMvc.perform(post("/user/add")
                .param("userName", "tdd")
                .param("userNickname", "mc")
                .param("gender", "male")
                .param("age", "25")
                .param("occupation", "spring boot developer"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.userName").value("tdd"))
                .andReturn();
    }

    @Test
    public void testUserQuery() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUserName("tdd");
        userDto.setUserNickName("mc");
        userDto.setGender("male");
        userDto.setOccupation("spring boot developer");
        userDto.setAge(29);

        Optional<UserDto> mockUserDto = Optional.of(userDto);

        Mockito.when(userService.query(Mockito.anyString())).thenReturn(mockUserDto);

        mockMvc.perform(get("/user/query/{userName}", "tdd"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.userName").value("tdd"))
                .andReturn();
    }

    @Test
    public void testUserList() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUserName("tdd");
        userDto.setUserNickName("mc");
        userDto.setGender("male");
        userDto.setOccupation("spring boot developer");
        userDto.setAge(29);

        List<UserDto> userDtoList = new ArrayList<>();
        userDtoList.add(userDto);

        Optional<List<UserDto>> mockUserDtoList = Optional.of(userDtoList);

        Mockito.when(userService.list()).thenReturn(mockUserDtoList);
        mockMvc.perform(get("/user/list")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].userName").isNotEmpty())
                .andReturn();
    }
}
