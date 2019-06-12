package com.devinkin.tdd.web.tddweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-12 12:09
 * @description: 集成测试类
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TddWebApplication.class)
@ComponentScan(basePackages = "com.devinkin.tdd")
//@EnableJpaRepositories(basePackages = {"com.devinkin.tdd.repo.tddrepo.user"})
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testUserAdd() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/user/add")
                .param("userName", "tdd")
                .param("userNickName", "mc")
                .param("gender", "male")
                .param("age", "25")
                .param("occupation", "spring boot developer"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").value("1"))
                .andReturn();
    }

    @Test
    public void testUserQuery() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/user/query/{userName}", "tdd"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.userName").value("tdd"))
                .andReturn();
    }

    @Test
    public void testUserList() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/user/list")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].userName").value("tdd"))
                .andReturn();
    }
}
