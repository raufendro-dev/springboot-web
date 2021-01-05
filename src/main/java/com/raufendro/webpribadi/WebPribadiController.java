package com.raufendro.webpribadi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebPribadiController {
    
    @RequestMapping("/")
    //@ResponseBody
    public String index(){
        return "index";
    }

}
