package com.devinkin.tdd.web.tddweb.controller;

import com.devinkin.tdd.api.tddapi.user.UserService;
import com.devinkin.tdd.domain.tdddomain.response.Response;
import com.devinkin.tdd.domain.tdddomain.user.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 10:50
 * @description: 用户controller
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/add")
    @ResponseBody
    public Response add(UserDto userDto) {
        Response response = new Response();
        Optional<Integer> result = userService.add(userDto);
        response.setData(result.get());
        return response;
    }

    @GetMapping("/query/{userName}")
    @ResponseBody
    public Response query(@PathVariable("userName") String userName) {
        Response response = new Response();
        Optional<UserDto> result = userService.query(userName);
        response.setData(result.get());
        return response;
    }

    @GetMapping("/list")
    @ResponseBody
    public Response list() {
        Response response = new Response();
        Optional<List<UserDto>> result = userService.list();
        response.setData(result.get());
        return response;
    }
}
