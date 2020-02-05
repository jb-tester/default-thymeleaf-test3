package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping()
    public String demo() {


        return "data";
    }

    @GetMapping("/${urlProperty:hello}")
    public String getHello() {


        return "hello";
    }

    //language=RegExp
    public static final String REGEX = ".[0-9A-z]";
    @RequestMapping("/foo/bar/{bbb:"+REGEX+"}/aaa")
    public String foo(@PathVariable String bbb) {

        return "foo";
    }
    @RequestMapping("bar/{bbb:...[0-9]}/ccc")
    public String bar(@PathVariable String bbb) {

        return "bar"+bbb;
    }

}
