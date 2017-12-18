package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入门类
 *
 * @author wenyh
 * @create 2017-12-18 15:08
 */
@RestController
public class HelloController {

    @RequestMapping(path = {"/index"} , method = {RequestMethod.GET , RequestMethod.POST})
    public String index () {
        return "index";
    }
}
