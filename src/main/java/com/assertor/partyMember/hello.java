package com.assertor.partyMember;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/hello")
    public String sayhello(){
       return "hello world!";
    }
}
