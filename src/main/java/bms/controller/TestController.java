package bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
//@RequestMapping("templates")
public class TestController {

        @RequestMapping("sel")
       String findAll(){
            return "login.html";
        }




}
