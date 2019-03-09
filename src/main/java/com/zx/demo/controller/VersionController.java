package com.zx.demo.controller;

import com.zx.demo.annotation.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@ApiVersion(1)
@RequestMapping("{version}/aa")
public class VersionController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String version(){
        System.out.println("v1");
        return "v1";
    }
}
