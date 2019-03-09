package com.zx.demo.controller;

import com.zx.demo.domain.User;
import com.zx.demo.service.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class JPAController {

    @Autowired
    private UserJPA userJPA;

    /*@InitBinder
    protected void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }*/


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
    public User save2(@Valid User user,BindingResult result) {
        if(result.hasFieldErrors()){
            List<FieldError> errorList = result.getFieldErrors();
            System.out.println("error");
        }
        return userJPA.save(user);
    }

    @RequestMapping(value = "/save3", method = RequestMethod.GET)
    public User save3( User user) {
        return user;
    }

}