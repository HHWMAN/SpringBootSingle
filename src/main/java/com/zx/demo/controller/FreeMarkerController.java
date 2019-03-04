package com.zx.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FreeMarkerController {
    @RequestMapping("/freeMaker")
    public String demo(Map<String,Object> map){
        map.put("name","FreeMarker");
        return "demo";
    }
}
