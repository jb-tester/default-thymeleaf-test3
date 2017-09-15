package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/14/2017.
 * Project: default-thymeleaf-test0
 * *******************************
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String Method(ModelMap model) {
        model.addAttribute("home_attr1", "test0");
        model.addAttribute("home_attr2", "this is default thymeleaf configuration test");
        return "home";
    }
}
