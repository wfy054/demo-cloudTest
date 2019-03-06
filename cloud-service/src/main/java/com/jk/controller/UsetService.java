package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class UsetService {

    @RequestMapping("queryUser")
    @ResponseBody
    public HashMap<String, Object> queryUser(){
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("name","123");
        return map;
    }
}
