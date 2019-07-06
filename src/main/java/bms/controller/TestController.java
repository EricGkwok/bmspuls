package bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

        @RequestMapping("sel")
       String findAll(){
            return "login.html";
        }

}
