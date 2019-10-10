package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/display")
    public ModelAndView display(){
        System.out.println("In UserController");
        User userobj = new User();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",userobj.str);
        return mv;
    }
}
