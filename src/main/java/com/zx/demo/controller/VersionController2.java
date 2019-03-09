package com.zx.demo.controller;

import com.zx.demo.annotation.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@ApiVersion(2)
@RequestMapping("{version}/aa")
public class VersionController2 {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String version(){
        System.out.println("v2");
        return "v2";
    }
}
