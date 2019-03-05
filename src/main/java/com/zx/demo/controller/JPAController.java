package com.zx.demo.controller;

import com.zx.demo.domain.User;
import com.zx.demo.service.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/user")
public class JPAController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 数据新增或更新，save方法可以执行添加也可以执行更新，如果需要执行持久化的实体存在主键值则更新数据，如果不存在则添加数据。
     */
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public User save(User user) {
        User tempUser = new User();
        tempUser.setName("lisi");
        tempUser.setAge(13);
        tempUser.setAddress("shanghai");
        return userJPA.save(tempUser);
    }

    //@Validated
    @RequestMapping(value = "/save2", method = RequestMethod.GET)
    public User save2(@Valid User user) {
        return userJPA.save(user);
    }

}